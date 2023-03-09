import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double raio = Math.pow(myObj.nextDouble(), 2);
        double pi = 3.14159;
        double area = pi * raio;
        
        System.out.printf("A=%.4f\n", area);
        
    }
}
