package Exercicio3;

public class Cavalo {

    private Integer quantidadeCavalos = 0;

    public Cavalo(int valor){
      this.setQuantidadeCavalos(valor);
    }

    public Cavalo(){
        this.setQuantidadeCavalos(0);
    }

    public Integer getQuantidadeCavalos() {
        return quantidadeCavalos;
    }

    public void setQuantidadeCavalos(Integer quantidadeCavalos) {
        this.quantidadeCavalos = quantidadeCavalos;
    }



    public Integer calculaCavalos(){
        return this.quantidadeCavalos * 4;
    }

    public String imprimeQtdFerraduras(){
        return ("Precisa-se de"+ " " +this.calculaCavalos() + " " +"Ferraduras");
    }

}
