package Anatomia.classes;

public class MinhaClasse { //corpo da classe

    public static void main(String[] args) { //corpo do metodo
//        System.out.println("Olá turma, sejam bem-vindos");
//         final String BR = "Brasil"; // varialve com maiuscula não pode ser alterada
        String meuNome = "Fabiano";
        int anoFabricacao = 2022;

        String primeiroNome = "Fabiano";
        String segundoNome = "Lima";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    } //metodo encerra aqui

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }

}// encerra corpo da classa
