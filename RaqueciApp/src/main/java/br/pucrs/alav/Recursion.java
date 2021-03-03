package br.pucrs.alav;

public class Recursion {
    public static void main(String [] args){
        int resultado = multiplicaE1(4,6);
        System.out.println("Resultado E1 = "+ resultado);
        System.out.println("Resultado E3 = "+ calculoE3(4));
        System.out.println("Resultado E4, palavra 'azul' = "+ inversaoE4("azul"));
    }

    public static int multiplicaE1(int a, int b){
        if(b == 0) {
            return b;
        }
        else{
            return a + multiplicaE1(a, b - 1);
        }
    }

    public static double calculoE3(double n){
        if (n==1) return 1;
        else return (1.0/n+ 1/calculoE3(n-1));
    }

    public static String inversaoE4(String palavra){
        if (palavra.isEmpty()) return palavra;
        return inversaoE4(palavra.substring(1)) + palavra.charAt(0);
    }
}
