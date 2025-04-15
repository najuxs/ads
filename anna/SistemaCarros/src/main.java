public class main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota Corolla", 2022);
        Veiculo moto = new Moto("Honda CG", 2021);
        Veiculo caminhao = new Caminhao("Volvo FH", 2020);

        Veiculo[] veiculos = {carro, moto, caminhao};

        for (Veiculo v : veiculos) {
            v.exibirInformacoes();
            v.acelerar();
            v.realizarManutencao();
            System.out.println("--------------------------");
        }
    }
}
