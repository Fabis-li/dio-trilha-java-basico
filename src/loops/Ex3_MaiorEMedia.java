package loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;


            if (numero > maior) maior = numero;

            count = count + 1;

        }while(count < 5); // contador menor 5 - laço ate 5 numeros

        System.out.println("Maior :" + maior);
        System.out.println("Media :" + soma/5);
    }
}
