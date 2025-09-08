package Exercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a Altura e Largura do quadrado para saber a área e o dobro do quadrado: ");

        float altura = scan.nextFloat();
        float largura = scan.nextFloat();

        float areaQd = altura * largura;
        float dobroArea = areaQd * 2;

        System.out.println("A área do quadrado é: " + areaQd);
        System.out.println("O Dobro da área do quadrado é " + dobroArea);
    }
}
