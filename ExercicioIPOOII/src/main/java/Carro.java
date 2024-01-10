public class Carro implements Veiculo{
    private Boolean ligado=true;
    private Integer velocidadecarro=0;
    @Override
    public void ligar() {
        this.ligado=true;
        System.out.println("Carro ligado.");
    }

    @Override
    public void desligar() {
        this.ligado=false;
        System.out.println("Carro desligado.");
    }

    @Override
    public void acelerar(int velocidade) {
        this.velocidadecarro+=velocidade;
        System.out.println("Carro acelerando a " + velocidade + " km/h.");
    }

    @Override
    public void frear() {
        this.velocidadecarro=0;
        System.out.println("Carro freando.");
    }
}
