package tools;

/**
 *
 * @author Lubor Pesek
 */
public class Delay {

//###################-ATRIBUTY-###################
//==========KONSTANTNI ATRIBUTY TRIDY==========
//===========PROMENNE ATRIBUTY TRIDY===========
    private static Delay delay;
//========KONSTANTNI ATRIBUTY INSTANCI=========
//=========PROMENNE ATRIBUTY INSTANCI==========
//####################-STATIC-####################
//============STATICKY KONSTRUKTOR=============
//=========STATICKE PRISTUPOVE METODY==========

    public static Delay getDelay() {
        if (delay == null) {
            delay = new Delay();
        }
        return delay;
    }
//==============STATICKE METODY================
//=================MAIN METODA=================
//
//    public static void main(String[] args) {
//        new Delay();
//    }
//###################-INSTANCE-###################
//=================KONSTRUKTOR=================

    private Delay() {

    }
//=============PRISTUPOVE METODY===============
//===================METODY====================

    public void wait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException exp) {

        }
    }
//###############-SOUKROME METODY-################
//=====STATICKE SOUKROME A POMOCNE METODY======
//==========SOUKROME A POMOCNE METODY==========
//############-SOUKROME KONSTRUKTORY-#############
//===============SOUKROME TRIDY================
//==============TESTOVACI METODY===============
}
