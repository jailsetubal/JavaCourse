package Exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o raio do cículo para saber sua área:");
        float raio = scan.nextFloat();

        float area = raio * raio;
        System.out.println("A área do raio é equivalente a: " + area);
    }
}
