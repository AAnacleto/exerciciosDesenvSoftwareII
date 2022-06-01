package Exercicio2;

public class Terreno {
    private float lado;
    private float altura;

    public Terreno(float lado, float altura){
        this.setLado(lado);
        this.setAltura(altura);

    }

    public Terreno(){
        this.setLado(0);
        this.setAltura(0);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Terreno{" +
                "base=" + lado +
                ", altura=" + altura +
                '}';
    }
}


