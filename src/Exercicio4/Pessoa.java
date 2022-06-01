package Exercicio4;

public class Pessoa {

    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public Pessoa(){
        this.setNome(" ");
        this.setIdade(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
