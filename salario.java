import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int funcNum = myObj.nextInt();
        int hora = myObj.nextInt();
        double valorHora = myObj.nextDouble();

        double salario = hora * valorHora;

        System.out.printf("NUMBER = " + funcNum + "\nSALARY = U$ %.2f\n", salario);
        
    }
}
