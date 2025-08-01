package br.com.blw12.lgj;

import br.com.blw12.lgj.base.Elemento;
import java.awt.*;

public class Tanque extends Elemento {
    private final int cano = 8;
    private final int escotilha = 10;

    public Tanque() {
        setLargura(30);
        setAltura(15);
    }

    @Override
    public void atualiza() {
    }

    @Override
    public void desenha(Graphics2D g) {
        g.setColor(Color.GREEN);

        g.fillRect(getPx() + getLargura() / 2 - cano / 2, getPy() - cano, cano, cano);
        g.fillRect(getPx(), getPy(), getLargura(), getAltura());

        g.setColor(Color.YELLOW);
        g.fillOval(getPx() + getLargura() / 2 - escotilha / 2, getPy() + getAltura() / 2 - escotilha / 2, escotilha, escotilha);
    }
}