import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double A = myObj.nextDouble();
        double B = myObj.nextDouble();
        double C = myObj.nextDouble();

        double pesoA = 2.0;
        double pesoB = 3.0;
        double pesoC = 5.0;

        double MEDIA = ((A*pesoA) + (B*pesoB) + (C*pesoC)) / (pesoA + pesoB + pesoC);

        System.out.printf("MEDIA = %.1f\n", MEDIA);

        
    }
}
