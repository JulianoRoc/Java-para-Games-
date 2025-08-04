package br.com.blw12.lgj;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInicial extends JFrame {

    public MenuInicial() {
        setTitle("Java para Games - Menu");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel painel = new JPanel();
        painel.setBackground(Color.BLACK);
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));

        JLabel titulo = new JLabel("Space Invaders JAVA");
        titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        titulo.setFont(new Font("Consolas", Font.BOLD, 32));
        titulo.setForeground(Color.GREEN);

        JButton btnIniciar = new JButton("Iniciar Jogo");
        btnIniciar.setAlignmentX(Component.CENTER_ALIGNMENT);
        estilizarBotao(btnIniciar);

        JButton btnSair = new JButton("Sair");
        btnSair.setAlignmentX(Component.CENTER_ALIGNMENT);
        estilizarBotao(btnSair);

        painel.add(titulo);
        painel.add(Box.createRigidArea(new Dimension(0, 40)));
        painel.add(btnIniciar);
        painel.add(Box.createRigidArea(new Dimension(0, 20)));
        painel.add(btnSair);

        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

                new Thread(() -> {
                    Jogo jogo = new Jogo(MenuInicial.this);
                    jogo.carregarJogo();
                    jogo.iniciarJogo();
                }).start();
            }
        });

        btnSair.addActionListener(e -> System.exit(0));

        getContentPane().add(painel);
        setVisible(true);
    }

    private void estilizarBotao(JButton botao) {
        botao.setBackground(Color.DARK_GRAY);
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setFont(new Font("Consolas", Font.BOLD, 18));
        botao.setPreferredSize(new Dimension(200, 50));
    }

    public static void main(String[] args) {
        new MenuInicial();
    }
}