public class main {
    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Carlos", 8000);
        Funcionario f2 = new Desenvolvedor("Ana", 5000);
        Funcionario f3 = new Estagiario("Lucas", 1500);

        Funcionario[] funcionarios = {f1, f2, f3};

        for (Funcionario f : funcionarios) {
            f.exibirInformacoes();
            f.realizarTarefa();
            System.out.println("----------------------");
        }
    }
}
