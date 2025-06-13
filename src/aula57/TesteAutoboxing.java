package aula57;

public class TesteAutoboxing {

    public static void main(String[] args){

        //autoboxing
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 100l; //nem Long(10000l);
        Float num11 = 3.5f; //nem Float(3.5f);
        Double num12 = 2.55555;
        Boolean flag2 = true;
        Character _b = 'b';


        //auto un-boxing
        // transformando um tipo que é de uma classe para um tipo primtitivo novamente
        int num13 = num9;

        //autoboxing em expressões
        num9++;

        System.out.println(num9);

        //auto unboxing num9 -> autoboxing num13/num9  -> num'4
        Integer num14 = num13/num9;

        //mau uso
        Double a, b , c;
        a = 10.0;
        b = 12.2;
        c = 4.7;

        Double media = (a+b+c)/3;
        System.out.println(media);


    }

}
