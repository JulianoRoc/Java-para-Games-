package br.com.blw12.lgj.base;

import java.awt.*;

public class Texto extends Elemento{
    private Font fonte;

    public Texto() {
        fonte = new Font("Tahoma", Font.PLAIN, 16);
    }

    public void desenha(Graphics g, String texto) {
        desenha(g, texto, getPx(), getPy());
    }

    public void desenha(Graphics g, String texto, int px, int py) {
        if (getCor() != null)
            g.setColor(getCor());

        g.setFont(fonte);
        g.drawString(texto, px, py);
    }

    public Font getFonte() {
        return fonte;
    }

    public void setFonte(Font fonte) {
        this.fonte = fonte;
    }
}