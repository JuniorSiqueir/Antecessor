import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int numero, numeroAnt, numeroSuce, numeroQuad, numeroRaiz;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Me informe um numero: ");
        numero = scanner.nextInt();
        numeroAnt = numero - 1;
        numeroSuce = numero + 1;
        numeroQuad = numero * numero;
        numeroRaiz = numero / 2;

        System.out.println("O numero antecessor de " + numero + " é " + numeroAnt);
        System.out.println("O numero sucessor de " + numero + " é " + numeroSuce);
        System.out.println("O quadrado de " + numero + " é " + numeroQuad);
        System.out.println("A raiz do numero " + numero + " é " + numeroRaiz);

        scanner.close();

    }
}
