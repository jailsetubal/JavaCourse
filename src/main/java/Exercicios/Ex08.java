package Exercicios;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        float salarioHora = scan.nextFloat();
        System.out.print("Quantas horas você trabalha por dia? ");
        float horaDia = scan.nextFloat();
        System.out.print("Quantos dias você trabalha no mês: ");
        int diasTrabalhados = scan.nextInt();

        float calculoSalario = (salarioHora * horaDia) * diasTrabalhados;
        System.out.println("O valor do seu salário com base nas suas horas trabalhadas é de R$:" + calculoSalario);



    }
}
