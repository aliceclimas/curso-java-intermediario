package aula69;

import aula68.MinhaThreadRunnable;

public class Teste2 {

     public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();

        while (t1.isAlive() || t2.isAlive() || t3.isAlive()){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Programa finalizado");
    }

}
