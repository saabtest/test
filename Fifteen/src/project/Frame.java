package project;

import javax.swing.JFrame;

/**
 *
 * @author Lubor Pesek
 */
public class Frame extends JFrame {

//###################-ATRIBUTY-###################
//==========KONSTANTNI ATRIBUTY TRIDY==========
    private final static int COUNT_OF_NUMBERS = 15;
//===========PROMENNE ATRIBUTY TRIDY===========
//========KONSTANTNI ATRIBUTY INSTANCI=========
//=========PROMENNE ATRIBUTY INSTANCI==========
//####################-STATIC-####################
//============STATICKY KONSTRUKTOR=============
//=========STATICKE PRISTUPOVE METODY==========
//==============STATICKE METODY================
//=================MAIN METODA=================

    public static void main(String[] args) {
        new Frame();
    }
//###################-INSTANCE-###################
//=================KONSTRUKTOR=================

    public Frame() {
        init();
        setComponents();
    }
//=============PRISTUPOVE METODY===============
//===================METODY====================
//###############-SOUKROME METODY-################
//=====STATICKE SOUKROME A POMOCNE METODY======
//==========SOUKROME A POMOCNE METODY==========

    private void init() {

    }

    private void setComponents() {

    }
//############-SOUKROME KONSTRUKTORY-#############
//===============SOUKROME TRIDY================
//==============TESTOVACI METODY===============
}
