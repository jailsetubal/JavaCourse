package Exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de metros para ser convertidas em cm: ");
        float metros = scan.nextFloat();

        float metrosParaCentimetros = metros * 100;
        System.out.println(metros + " metros em centimetros são " + metrosParaCentimetros + " centimetros" );
    }
}
