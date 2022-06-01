package Exercicio4;

public class PessoaController {
    Pessoa pessoa;

    public PessoaController(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public float calculoDias(){
        return (getPessoa().getIdade() * 365);
    }

    public String imprimirTextoDias(){
        return (getPessoa().getNome() + ", voce ja viveu" + " " +calculoDias() + " " +"dias");
    }


}
