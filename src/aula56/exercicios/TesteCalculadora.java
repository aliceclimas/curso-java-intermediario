package aula56.exercicios;

public class TesteCalculadora {

     public static void main(String[] args){
        double x = 2.0;
		double y = 3.0;
		
		for (Calculadora op : Calculadora.values()){
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.println(op.executarOperacao(x, y));
		}

       
    }



}
