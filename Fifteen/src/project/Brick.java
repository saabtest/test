package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JLabel;
import tools.Delay;

/**
 *
 * @author Lubor Pesek
 */
public class Brick extends JComponent implements Runnable {
//###################-ATRIBUTY-###################
//==========KONSTANTNI ATRIBUTY TRIDY==========
//===========PROMENNE ATRIBUTY TRIDY===========
//========KONSTANTNI ATRIBUTY INSTANCI=========

    private final JLabel labelForNumber;
    private final Brick brick;
//=========PROMENNE ATRIBUTY INSTANCI==========

    private Thread thread;
    private Color positionColor = Color.gray;
    private int movingToX;
    private int movingToY;
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
        brick = this;
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
                Game.getGame().moveEnableBrick(brick);
            }
        });
    }
//=============PRISTUPOVE METODY===============
//===================METODY====================

    public void moveUp() {
        movingToY = -getHeight();
        start();
    }

    public void moveDown() {
        movingToY = getHeight();
        start();
    }

    public void moveRight() {
        movingToX = getWidth();
        start();
    }

    public void moveLeft() {
        movingToX = -getWidth();
        start();
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(positionColor);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.black);
        g.drawRect(0, 0, getWidth() - 2, getHeight() - 2);
    }

    @Override
    public void run() {
        int moveByX = 0;
        int moveByY = 0;
        if (movingToX > 0) {
            moveByX = 1;
        } else if (movingToX < 0) {
            moveByX = -1;
        } else if (movingToY > 0) {
            moveByY = 1;
        } else if (movingToY < 0) {
            moveByY = -1;
        }
        for (int i = 0; i < Math.abs(movingToX - movingToY); i++) {
            setLocation(getX() + moveByX, getY() + moveByY);
            Delay.getDelay().wait(Game.getSpeedOfMoving() / Math.abs(movingToX - movingToY));
        }
        movingToX = 0;
        movingToY = 0;
    }

    public void start() {
        if (thread == null || !thread.isAlive()) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void setColorOfRightPosition() {
        positionColor = Color.yellow;
        repaint();
    }

    public void setColorOfWrongPosition() {
        positionColor = Color.gray;
        repaint();
    }

    public void rightPosition() {
        setColorOfRightPosition();
    }
//###############-SOUKROME METODY-################
//=====STATICKE SOUKROME A POMOCNE METODY======
//==========SOUKROME A POMOCNE METODY==========
//############-SOUKROME KONSTRUKTORY-#############
//===============SOUKROME TRIDY================
//==============TESTOVACI METODY===============
}
