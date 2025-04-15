public class Carro extends Veiculo {
    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 20);
        System.out.println(getModelo() + " acelerou. Velocidade atual: " + getVelocidade() + " km/h");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Revisando o motor e trocando óleo do carro " + getModelo());
    }
}
