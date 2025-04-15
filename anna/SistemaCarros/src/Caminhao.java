public class Caminhao extends Veiculo {
    public Caminhao(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 10);
        System.out.println(getModelo() + " acelerou. Velocidade atual: " + getVelocidade() + " km/h");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificando suspensão e sistema de carga do caminhão " + getModelo());
    }
}
