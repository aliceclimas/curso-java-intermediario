package aula56.exercicios;

public enum Calculadora {

    
    SOMAR("+") {
        @Override
        public double executarOperacao(double x, double y) {
            
            return x + y;
        }
    }, SUBTRAIR("-") {
        @Override
        public double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICAR("*") {
        @Override
        public double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDIR("/") {
        @Override
        public double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    private String simbolo;

    Calculadora(String simbolo){
        this.simbolo = simbolo;
    }

    public String getSimbolo(){
        return this.simbolo;
    }

    public abstract double executarOperacao(double x,double y);


}


