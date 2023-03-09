import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String nome = myObj.next();
        double salario_fixo = myObj.nextDouble();
        double vendas = myObj.nextDouble();
        double comissao = vendas * 15/100;
        double TOTAL = salario_fixo + comissao;

        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);

        
    }
}
