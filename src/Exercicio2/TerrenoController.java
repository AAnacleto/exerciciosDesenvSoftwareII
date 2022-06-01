package Exercicio2;

public class TerrenoController {
    Terreno terreno;

    public TerrenoController(Terreno terreno){
        this.setTerreno(terreno);
    }

    public TerrenoController(){
        this.setTerreno(null);
    }
    public Terreno getTerreno() {
        return terreno;
    }

    public void setTerreno(Terreno terreno) {
        this.terreno = terreno;
    }

    public float calculaArea(Terreno terreno){

        return terreno.getLado() * terreno.getAltura();

    }

    public String imprimirTerreno(){
        return terreno.toString();
    }
}
