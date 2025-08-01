package br.com.blw12.lgj;

import br.com.blw12.lgj.base.Elemento;

import java.awt.*;

public class Tiro extends Elemento {
    private boolean inimigo;

    public Tiro() {
        setAltura(5);
        setLargura(5);
    }

    public Tiro(boolean inimigo) {
        this();
        this.inimigo = inimigo;
    }

    @Override
    public void atualiza() {
    }

    @Override
    public void desenha(Graphics2D g) {
        if (!isAtivo())
            return;

        g.setColor(inimigo ? Color.RED : Color.WHITE);
        g.fillRect(getPx(), getPy(), getLargura(), getAltura());
    }
}