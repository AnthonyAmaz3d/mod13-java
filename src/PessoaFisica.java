/**
 * @author Anthony.Amaz3d
 */

public class PessoaFisica extends Pessoa{

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String imprimirInformacoes() {
        return "Nome: " + this.nome + "\n" +
                "Sobrenome: " + this.sobrenome + "\n" +
                "Idade: " + this.idade + "\n" +
                "CPF : " + this.cpf + "\n";
    }
}