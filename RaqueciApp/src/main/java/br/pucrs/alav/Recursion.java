package br.pucrs.alav;

import java.util.Scanner;

public class Recursion {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int a, b, resultado;
        System.out.println("Forneça dois valores");
        a = in.nextInt();
        b = in.nextInt();

        resultado = multiplica(a,b);
        System.out.println("Resultado = "+ resultado);
    }

    public static int multiplica(int a, int b){
        if(b == 0) {
            return b;
        }
        else{
            return a + multiplica(a, b - 1);
        }
    }
}
