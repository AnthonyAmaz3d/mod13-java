/**
 * @author Anthony.Amaz3d
 */

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String imprimirInformacoes() {
        return "Nome: " + this.nome + "\n" +
                "Sobrenome: " + this.sobrenome + "\n" +
                "Idade: " + this.idade + "\n" +
                "CNPJ : " + this.cnpj + "\n";
    }
}