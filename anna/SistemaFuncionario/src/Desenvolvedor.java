public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Desenvolvedor: " + nome + " - Salário: R$ " + salario);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(nome + " está codando uma nova funcionalidade.");
    }
}
