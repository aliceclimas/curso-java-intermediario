package aula74.exercicios;

public class SimuladorSemaforo {

    public static void main(String[] args) {
        
        ThreadSemafaro semaforo = new ThreadSemafaro(); // instanciamos e ai já começa a "rodar" o método RUN

        for (int i = 0;i<10;i++){
            System.out.println(semaforo.getCor());
            semaforo.esperaCorMudar();
        }

        semaforo.desligarSemafaro();
    }

}
