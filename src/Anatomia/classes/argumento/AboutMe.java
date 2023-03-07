package Anatomia.classes.argumento;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com o indice 0
//        String nome = args [0];
//        String sobrenome = args [1];
//        int idade = Integer.valueOf(args [2]); //vamos falar sobre
//        double altura = Double.valueOf(args [3]);

//        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
//        System.out.println("Tenho " + idade + " anos");
//        System.out.println("Minha altura é " + altura + "cm");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo od dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm");

    }
}
