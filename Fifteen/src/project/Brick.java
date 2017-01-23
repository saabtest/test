package project;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Lubor Pesek
 */
public class Brick extends JComponent {

    public Brick(String name) {
        setName(name);
        setSize(Game.getBrickWidth(), Game.getBrickHeight());
    }

//###################-ATRIBUTY-###################
//==========KONSTANTNI ATRIBUTY TRIDY==========
//===========PROMENNE ATRIBUTY TRIDY===========
//========KONSTANTNI ATRIBUTY INSTANCI=========
//=========PROMENNE ATRIBUTY INSTANCI==========
//####################-STATIC-####################
//============STATICKY KONSTRUKTOR=============
//=========STATICKE PRISTUPOVE METODY==========
//==============STATICKE METODY================
//=================MAIN METODA=================
//
//    public static void main(String[] args) {
//        new Brick();
//    }
//###################-INSTANCE-###################
//=================KONSTRUKTOR=================
//=============PRISTUPOVE METODY===============
//===================METODY====================
    public void moveUp() {
        setLocation(getX(), getY() - getHeight());
    }

    public void moveDown() {
        setLocation(getX(), getY() + getHeight());
    }

    public void moveRight() {
        setLocation(getX() + getWidth(), getY());
    }

    public void moveLeft() {
        setLocation(getX() - getWidth(), getY());
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        g.drawRect(0, 0, getWidth() - 2, getHeight() - 2);
    }
//###############-SOUKROME METODY-################
//=====STATICKE SOUKROME A POMOCNE METODY======
//==========SOUKROME A POMOCNE METODY==========
//############-SOUKROME KONSTRUKTORY-#############
//===============SOUKROME TRIDY================
//==============TESTOVACI METODY===============
}
