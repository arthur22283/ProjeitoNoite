


import java.util.Scanner;
import java.util.ArrayList;


public class Desafio2 {
    public static void main (String[] args) {

        Scanner ler1 = new Scanner(System.in);
        Scanner ler2 = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList();

        int comp = 0;
        int numero;

        System.out.println(" Digite o tamanho do vetor: ");
        comp = ler1.nextInt();
        System.out.println(" Digite um valor para o vetor: ");
        numero = ler2.nextInt();


        System.out.println(" ============================================== ");
        System.out.println(" Analisando ");
        System.out.println("=================================================");

        for (int i = 0; i < comp; i++) {
            numeros.add(numero);
        }

        int somadosNumeros = 0;
        for (int n : numeros) {
            somadosNumeros += n;
        }

        System.out.println(" A soma de valores: " + somadosNumeros);
        System.out.println(" A quantidade de numeros: " + numeros.size());

    }
}