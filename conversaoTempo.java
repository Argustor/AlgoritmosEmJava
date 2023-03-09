import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int s;

        Scanner myObj = new Scanner(System.in);
        s = myObj.nextInt();

        int horas = s/3600;
        s = s-(horas*3600);
        int minutos = s/60;
        s = s-(minutos*60);
        int segundos = s%60;

        System.out.println(horas+":"+minutos+":"+segundos);

        }   
    }
