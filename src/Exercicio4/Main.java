package Exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Informe seu nome");
        String nome = entrada.nextLine();

        System.out.println("Informe sua idade");
        int idade = entrada.nextInt();

        pessoa.setNome(nome);
        pessoa.setIdade(idade);

        PessoaController controle = new PessoaController(pessoa);
        System.out.println(controle.imprimirTextoDias());



    }
}
