package br.pucrs.alav;

public class Recursion {
    public static void main(String [] args){
        int resultado = multiplicaE1(4,6);
        System.out.println("Resultado = "+ resultado);
    }

    public static int multiplicaE1(int a, int b){
        if(b == 0) {
            return b;
        }
        else{
            return a + multiplicaE1(a, b - 1);
        }
    }
}
