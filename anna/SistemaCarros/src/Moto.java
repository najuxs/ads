public class Moto extends Veiculo {
    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public void acelerar() {
        setVelocidade(getVelocidade() + 30);
        System.out.println(getModelo() + " acelerou. Velocidade atual: " + getVelocidade() + " km/h");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Ajustando corrente e freios da moto " + getModelo());
    }
}
