public abstract class Veiculo {
    private String modelo;
    private int ano;
    private int velocidade;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public abstract void acelerar();
    public abstract void realizarManutencao();

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    protected void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano + ", Velocidade: " + velocidade + " km/h");
    }
}
