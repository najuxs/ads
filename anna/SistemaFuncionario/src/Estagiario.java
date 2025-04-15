public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Estagiário: " + nome + " - Salário: R$ " + salario);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(nome + " está auxiliando nas tarefas administrativas.");
    }
}
