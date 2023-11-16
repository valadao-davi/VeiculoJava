public class Passeio extends Veículo{

    int qtdPassageiros = 0;

    public Passeio(int qtdPassageiros, String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor){
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public float calcVel(float velocMax){
        return velocMax*1000;
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
}
