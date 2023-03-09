import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int A = myObj.nextInt();
        int B = myObj.nextInt();
        int C = myObj.nextInt();

        int AB = ((A+B) + Math.abs(A-B)) / 2;

        int ABC = ((AB+C) + Math.abs(AB-C)) / 2;

        System.out.println(ABC + " eh o maior");
    }
}
