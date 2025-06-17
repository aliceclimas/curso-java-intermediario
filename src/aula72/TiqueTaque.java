package aula72;

public class TiqueTaque {

    boolean tique;

    synchronized void tique(boolean estaExcutando){
        if (!estaExcutando){
            tique = true;
            notify();
            return;
        }
        System.out.println("Tique");

        tique = true;
        notify();

        try {
            while (tique){
                wait();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void taque(boolean estaExcutando){
        if (!estaExcutando){
            tique = false;
            notify();
            return;
        }
        System.out.println("Taque");

        tique = false;

        notify();

        try {
            while (!tique){
                wait();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
