package Exercicio3;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de cavalos no haras");
        int valor = entrada.nextInt();
        Cavalo novo = new Cavalo(valor);
        System.out.println(novo.getQuantidadeCavalos());
        System.out.println(novo.imprimeQtdFerraduras());

    }
}
