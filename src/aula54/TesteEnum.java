package aula54;


public class TesteEnum {

    public static void main(String[] args){
        DiaSemana dia = DiaSemana.SEGUNDA;

        System.out.println(dia.toString() + " - " + dia.getValor());

        Data data = new Data(12,6,2025, DiaSemana.QUINTA);
    }
}
