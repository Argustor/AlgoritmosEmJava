import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double A = myObj.nextDouble();
        double B = myObj.nextDouble();
        double C = myObj.nextDouble();

        double pi = 3.14159;

        double tri = (A * C) / 2;
        double circ = Math.pow(C, 2) * pi;
        double trap = (A+B) * C / 2;
        double quad = Math.pow(B, 2);
        double reta = A * B;

        System.out.printf("TRIANGULO: %.3f\n", tri);
        System.out.printf("CIRCULO: %.3f\n", circ);
        System.out.printf("TRAPEZIO: %.3f\n", trap);
        System.out.printf("QUADRADO: %.3f\n", quad);
        System.out.printf("RETANGULO: %.3f\n", reta);


    }
}
