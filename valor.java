import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int peca1Codigo = myObj.nextInt();
        int peca1Quantidade = myObj.nextInt();
        double peca1ValorUnitario = myObj.nextDouble();
        
        int peca2Codigo = myObj.nextInt();
        int peca2Quantidade = myObj.nextInt();
        double peca2ValorUnitario = myObj.nextDouble();

        double valorTotal = (peca1Quantidade * peca1ValorUnitario) + (peca2Quantidade * peca2ValorUnitario);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
        
    }
}
