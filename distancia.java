import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double x1 = myObj.nextDouble();
        double y1 = myObj.nextDouble();
        double x2 = myObj.nextDouble();
        double y2 = myObj.nextDouble();
        
        double calculoX = Math.pow((x2 - x1), 2);
        double calculoY = Math.pow((y2 - y1), 2);
        double somaXY = calculoX + calculoY;
        
        double distancia = Math.sqrt(somaXY);

        System.out.printf("%.4f\n", distancia);
    }
}
