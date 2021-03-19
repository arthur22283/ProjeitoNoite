
package AulaNoite;

public class NumberDate {
    public static void main (String[] args) {


        int[] pares = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] imp = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.println("Esses são os numeros pares: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("São eles: " + pares[i]);

        }
        System.out.println("Esses são os numeros impares: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("São eles: " + imp[i]);


        }

        System.out.println("Quantidade de numeros pares é : " + pares.length);
        System.out.println("Quantidade de numeros impares é: " + imp.length);



    }

}
