package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;

/**
 *
 * @author Lubor Pesek
 */
public class Brick extends JComponent {
//###################-ATRIBUTY-###################
//==========KONSTANTNI ATRIBUTY TRIDY==========
//===========PROMENNE ATRIBUTY TRIDY===========
//========KONSTANTNI ATRIBUTY INSTANCI=========
//=========PROMENNE ATRIBUTY INSTANCI==========

    private final JLabel labelForNumber;
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

    public Brick(String name) {
        setName(name);
        setSize(Game.getBrickWidth(), Game.getBrickHeight());

        labelForNumber = new JLabel(name);
        labelForNumber.setSize(getWidth(), getHeight());
        labelForNumber.setFont(new Font("Times new Roman", 1, 30));
        labelForNumber.setHorizontalAlignment(0);
        add(labelForNumber);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                if (Game.getGame().isBrickEnableToMove(getX(), getY())) {
                    System.out.println("true");
                } else {
                    System.out.println("FALSE");
                }
            }
        });
    }
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
    public void paintComponent(Graphics g) {
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
