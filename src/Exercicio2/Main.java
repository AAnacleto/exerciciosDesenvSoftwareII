package Exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TerrenoController terreno = new TerrenoController();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a base do retangulo");
        float base = entrada.nextFloat();
        System.out.println("Informe a altura do retangulo");
        float altura = entrada.nextFloat();
        Terreno novoTerreno = new Terreno(base, altura);
        terreno.setTerreno(novoTerreno);
        System.out.println(terreno.calculaArea(novoTerreno));
        System.out.println(terreno.imprimirTerreno());
    }
}
