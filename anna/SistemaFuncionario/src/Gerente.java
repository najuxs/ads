public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Gerente: " + nome + " - Salário: R$ " + salario);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(nome + " está organizando uma reunião de equipe.");
    }
}
