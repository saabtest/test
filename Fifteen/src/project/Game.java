package project;

/**
 *
 * @author Lubor Pesek
 */
public class Game {

//###################-ATRIBUTY-###################
//==========KONSTANTNI ATRIBUTY TRIDY==========
    private final static int WIDTH_OF_BRICK = 50;
    private final static int HEIGHT_OF_BRICK = 50;
    private final static int COUNT_OF_NUMBERS = 15;
//===========PROMENNE ATRIBUTY TRIDY===========
    private static Game game;
//========KONSTANTNI ATRIBUTY INSTANCI=========
//=========PROMENNE ATRIBUTY INSTANCI==========
    private int xParameterOfEmptyPlace;
    private int yParameterOfEmptyPlace;
//####################-STATIC-####################
//============STATICKY KONSTRUKTOR=============
//=========STATICKE PRISTUPOVE METODY==========

    public static int getBrickWidth() {
        return WIDTH_OF_BRICK;
    }

    public static int getBrickHeight() {
        return HEIGHT_OF_BRICK;
    }

    public static int getCountOfNumbers() {
        return COUNT_OF_NUMBERS;
    }

    public static Game getGame() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }
//==============STATICKE METODY================
//=================MAIN METODA=================
//
//    public static void main(String[] args) {
//        new Game();
//    }
//###################-INSTANCE-###################
//=================KONSTRUKTOR=================

    private Game() {

    }
//=============PRISTUPOVE METODY===============

    public void setParametersOfEmptyPlace(int x, int y) {
        xParameterOfEmptyPlace = x;
        yParameterOfEmptyPlace = y;
    }

    public boolean isBrickEnableToMove(int x, int y) {
        return xParameterOfEmptyPlace == x || yParameterOfEmptyPlace == y;
    }
//===================METODY====================
//###############-SOUKROME METODY-################
//=====STATICKE SOUKROME A POMOCNE METODY======
//==========SOUKROME A POMOCNE METODY==========
//############-SOUKROME KONSTRUKTORY-#############
//===============SOUKROME TRIDY================
//==============TESTOVACI METODY===============
}
