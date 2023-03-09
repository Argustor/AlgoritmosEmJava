import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int tempo, velocidade;
        double calculo;

        Scanner myObj = new Scanner(System.in);
        tempo = myObj.nextInt();
        velocidade = myObj.nextInt();
        
        calculo = (tempo * velocidade) / 12.0;

        System.out.printf("%.3f\n", calculo);
        

        }   
    }
