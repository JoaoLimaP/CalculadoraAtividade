import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int adição = 1;
        int subtração = 2;
        int multiplicação = 3;
        int divisão = 4;
        int potencialização = 5;
        int RaizQuadrada = 6;
        int calculo;

        System.out.println("por fim, escolha uma das operações;" + "\n" + "1.adição" + "\n" + "2.subtração" + "\n" + "3.multiplicação" + "\n" + "4.divisao" + "\n" + "5.Potencialização" + "\n" + "6.Raiz quadrada");
        calculo = scan.nextInt();

        if (calculo == 1) {
            System.out.println(a + b);
        }
        if (calculo == 2) {
            System.out.println(a - b);
        }
        if (calculo == 3) {
            System.out.println(a * b);
        }
        if (calculo == 4) {
            System.out.println(a / b);
        }
        if (calculo == 5) {
            System.out.println(Math.pow(a, b));
        }
        if (calculo == 6) {
            System.out.println("Raiz de " + a + " é: " + Math.sqrt(a));
            System.out.println("Raiz de " + b + " é: " + Math.sqrt(b));
            System.out.println("raiz de " + a + " + " + b + " é: " + Math.sqrt(a + b));
        }

    }

}