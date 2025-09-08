package Exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe 2 números para somar: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println("A soma de " + n1 + " + " + n2 + " é: ");
        System.out.println(n1 + n2);
    }
}
