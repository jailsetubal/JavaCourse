package Exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe as 4 notas desse bimestre: ");
        float n1 = scan.nextFloat();
        float n2 = scan.nextFloat();
        float n3 = scan.nextFloat();
        float n4 = scan.nextFloat();

        float media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média das suas notas é: " + media);

    }
}
