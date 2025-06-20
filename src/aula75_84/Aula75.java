package aula75_84;

public class Aula75 {

    public static void main(String[] args){

        String vazia = new String(); //"" // Já existe no pool? Não, então cria referência
        System.out.println(vazia);

        String java = new String("JAVA");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char[] charsJava = {'J','A','V','A'};
        String java2 = new String(charsJava);
        System.out.println(java2);

        char[] abcdef = {'A','B','C','D','E','F'};
        String abc = new String(abcdef,1 , 3);
        System.out.println(abc);

        byte[] ascii = {65,66,67,68,69};
        String abcde = new String(ascii);
        System.out.println(abcde);

        String bcd = new String(ascii, 1 ,3);
        System.out.println(bcd);

        String java3 = "JAVA"; // apontam para o mesmo lugar na memória //atribuição simples // já existe no pool? Sim, então usa a MESMA referência
        String java4 = "JAVA"; // apontam para o mesmo lugar na memória //atribuição simples

        System.out.println(java3);
        System.out.println(java4);

    }

}
