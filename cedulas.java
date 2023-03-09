import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int N;

        Scanner myObj = new Scanner(System.in);
        N = myObj.nextInt();

        int nota100 = N / 100;
        int resto = N % 100;
        int nota50 = resto / 50;
            resto = resto % 50;
        int nota20 = resto / 20;
            resto = resto % 20;
        int nota10 = resto / 10;
            resto = resto % 10;
        int nota5 = resto / 5;
            resto = resto % 5;
        int nota2 = resto / 2;
            resto = resto % 2;
        int nota1 = resto / 1;
            resto = resto % 1;
        System.out.println(N);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");


        }   
    }
