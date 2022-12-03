import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Limpar o codigo
        //corrigir erros de aritimetica
        //repetição até que se digite 0

        try {
            var Final = 1;
            do {

                Scanner scan = new Scanner(System.in);

                int a, b;
                System.out.println("Digite o primeiro valor: ");
                a = scan.nextInt();
                System.out.println("Digite o segundo valor: ");
                b = scan.nextInt();

                int calculo;

                System.out.println("por fim, escolha uma das operações: \n " +
                        " 0.Encerrar os calculos \n " +
                        " 1.Adição \n " +
                        " 2.Subtração \n " +
                        " 3.Multiplicação \n " +
                        " 4.Divisao \n " +
                        " 5.Potencialização \n " +
                        " 6.Raiz quadrada");

                calculo = scan.nextInt();
                Final = calculo;

                if (calculo == 1) {
                    System.out.println("A soma de " + a + " + " + b + " é: " + (a + b) + "\n");
                }
                if (calculo == 2) {
                    System.out.println("A subtração de " + a + " - " + b + " é " + (a - b) + "\n");
                }
                if (calculo == 3) {
                    System.out.println("A multiplicação de " + a + " * " + b + " é " + (a * b) + "\n");
                }
                if (calculo == 4) {
                    System.out.println("A divisão de " + a + "/" + b + " é " + (a / b) + "\n");
                }

                if (calculo == 5) {
                    System.out.println("A potencia de " + a + " sobre " + b + " é " + (Math.pow(a, b)) + "\n");
                }
                if (calculo == 6) {
                    System.out.println("Raiz de " + a + " é: " + Math.sqrt(a));
                    System.out.println("Raiz de " + b + " é: " + Math.sqrt(b));
                    System.out.println("raiz de " + a + " + " + b + " é: " + Math.sqrt(a + b) + "\n");
                }
                if (calculo >= 7) {
                    System.out.println("tente novamente, escolha um das operções presentes na lista \n ");
                }
                if (calculo < 0) {
                    System.out.println("tente novamente, escolha um das operções presentes na lista \n ");
                }
                if (calculo == 0) {
                    System.out.println("Encerrando programa \n ");
                }
            } while (Final != 0);


        } catch (RuntimeException e) {
            System.out.println("Não é possivel realizar esta função, tente novamente");
        }

    }
}
