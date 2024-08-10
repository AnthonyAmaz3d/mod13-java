public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Joao");
        pessoaFisica.setIdade(18);
        pessoaFisica.setSobrenome("Pedro");
        pessoaFisica.setCpf("520.687.260-17");
        System.out.println(pessoaFisica.imprimirInformacoes());

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Pedro");
        pessoaJuridica.setIdade(38);
        pessoaJuridica.setSobrenome("Augusto");
        pessoaJuridica.setCnpj("77.669.678/0001-96");
        System.out.println(pessoaJuridica.imprimirInformacoes());
    }
}