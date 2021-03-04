package br.pucrs.alav;

public class Recursion {
    public static void main(String [] args){
        System.out.println("Resultado E1, valores '4' e '6' = "+ multiplicaE1(4,6));
        //E2
        System.out.println("Resultado E3, valor '4' = "+ calculoE3(4));
        System.out.println("Resultado E4, palavra 'azul' = "+ inversaoE4("azul"));
        System.out.println("Resultado E5, valor '5' = "+ seqE5(5));
        System.out.println("Resultado E6, valores '3' e '2' = "+ ackermanE6(3,2));
        System.out.println("Resultado E7, valores '1','2' e '3' = "+ vetorE7Soma(new int[]{1,2,3},2));
    }
//    Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
    public static int multiplicaE1(int a, int b){
        if(b == 0) {
            return b;
        }
        else{
            return a + multiplicaE1(a, b - 1);
        }
    }

//    Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
    public static double calculoE3(double n){
        if (n==1) return 1;
        else return (1.0/n+ 1/calculoE3(n-1));
    }

//    Inversão de uma string.
    public static String inversaoE4(String palavra){
        if (palavra.isEmpty()) return palavra;
        return inversaoE4(palavra.substring(1)) + palavra.charAt(0);
    }

//    Gerador da sequência dada por:
//    F(1) = 1
//    F(2) = 2
//    F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
    public static int seqE5(int n){
        if (n==2 || n==1) return n;
        else return 2 * seqE5(n-1) +3*seqE5(n-2);
    }

//    Gerador de Sequência de Ackerman:
//    A(m, n) = n + 1, se m = 0
//    A(m, n) = A(m − 1, 1), se m != 0 e n = 0
//    A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.
    public static int ackermanE6(int m, int n){
        if (m==0) return n+1;
        if (m!=0 && n==0) return ackermanE6(m-1,1);
        return ackermanE6(m-1,ackermanE6(m,n-1));
    }

//    A partir de um vetor de números inteiros, calcule a soma e o produto dos elementos do vetor.
    public static int vetorE7Soma(int [] vet,int n){
        if (n==0) return vet[0];
        return vet[n]+vetorE7Soma(vet,n-1);
    }
}
