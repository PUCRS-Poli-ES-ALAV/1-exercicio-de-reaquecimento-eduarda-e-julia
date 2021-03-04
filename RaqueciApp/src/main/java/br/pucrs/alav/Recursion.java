package br.pucrs.alav;

public class Recursion {
    public static void main(String [] args){
        System.out.println("Resultado E1, valores '4' e '6' = "+ multiplicaE1(4,6));
        System.out.println("Resultado E3, valor '4' = "+ calculoE3(4));
        System.out.println("Resultado E4, palavra 'azul' = "+ inversaoE4("azul"));
        System.out.println("Resultado E5, valor '5' = "+ seqE5(5));
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

    public static double seqE5(int n){
        if (n==2 || n==1) return n;
        else return 2 * seqE5(n-1) +3*seqE5(n-2);
    }
}
