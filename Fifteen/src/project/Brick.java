package project;

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

//###############-SOUKROME METODY-################
//=====STATICKE SOUKROME A POMOCNE METODY======
//==========SOUKROME A POMOCNE METODY==========
//############-SOUKROME KONSTRUKTORY-#############
//===============SOUKROME TRIDY================
//==============TESTOVACI METODY===============
}
