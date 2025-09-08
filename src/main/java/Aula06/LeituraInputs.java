package Aula06;

import java.util.Scanner;

public class LeituraInputs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.print("Digite seu nome completo: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.print("Você tem " + idade + " anos\n");

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.print("Sua altura é: " + altura);
    }
}
