package project;

import java.util.ArrayList;
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
    private final ArrayList<Brick> brickCollection = new ArrayList<>();
//=========PROMENNE ATRIBUTY INSTANCI==========
    private Brick brick;
//####################-STATIC-####################
//============STATICKY KONSTRUKTOR=============
//=========STATICKE PRISTUPOVE METODY==========

    public static int getCountOfNumbers() {
        return COUNT_OF_NUMBERS;
    }
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

        setBricks();
    }
//=============PRISTUPOVE METODY===============

    public ArrayList getBricksCollection() {
        return brickCollection;
    }
//===================METODY====================
//###############-SOUKROME METODY-################
//=====STATICKE SOUKROME A POMOCNE METODY======
//==========SOUKROME A POMOCNE METODY==========

    private void init() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Fifteen");
        setSize(500, 500);
        setLocationRelativeTo(null);
    }

    private void setComponents() {

    }

    private void setBricks() {
        for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
            brick = new Brick(String.valueOf(i));
            brickCollection.add(brick);
        }
    }
//############-SOUKROME KONSTRUKTORY-#############
//===============SOUKROME TRIDY================
//==============TESTOVACI METODY===============
}
