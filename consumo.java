import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int X = myObj.nextInt();
        double Y = myObj.nextDouble();

        double gasto = X / Y;

        System.out.printf("%.3f km/l\n", gasto);
    }
}
