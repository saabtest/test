package project;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Lubor Pesek
 */
public class Frame extends JFrame {

//###################-ATRIBUTY-###################
//==========KONSTANTNI ATRIBUTY TRIDY==========
//===========PROMENNE ATRIBUTY TRIDY===========
//========KONSTANTNI ATRIBUTY INSTANCI=========
    private final ArrayList<Brick> brickCollection = new ArrayList<>();
//=========PROMENNE ATRIBUTY INSTANCI==========
    private Brick brick;
    private JPanel panel;
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

        setBricks();
    }
//=============PRISTUPOVE METODY===============

    public ArrayList<Brick> getBricksCollection() {
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
        setSize(6 + Game.getBrickWidth() * 4, 28 + Game.getBrickHeight() * 4);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void setComponents() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(getSize());
        panel.setBackground(Color.cyan);
        add(panel);
    }

    private void setBricks() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                brick = new Brick(String.valueOf((i * 4) + j + 1));
                panel.add(brick);
                brick.setLocation(j * Game.getBrickWidth(), i * Game.getBrickHeight());
                brickCollection.add(brick);
            }
        }
        Game.getGame().setParametersOfEmptyPlace(brickCollection.get(brickCollection.size() - 1).getX(),
                brickCollection.get(brickCollection.size() - 1).getY());
        panel.remove(brickCollection.size() - 1);
        brickCollection.remove(brickCollection.size() - 1);
    }
//############-SOUKROME KONSTRUKTORY-#############
//===============SOUKROME TRIDY================
//==============TESTOVACI METODY===============
}
