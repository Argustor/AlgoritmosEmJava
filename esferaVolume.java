import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double raio = Math.pow(myObj.nextDouble(), 3);
        double pi = 3.14159;
        double volume = (4/3.0) * pi * raio;
        
        System.out.printf("VOLUME = %.3f\n", volume);
        
    }
}
