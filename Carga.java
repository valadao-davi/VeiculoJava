public class Carga  extends  Veículo{
    int cargaMax = 0;
    int tara = 0;

    public Carga(int cargaMax, int tara, String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    @Override
    public float calcVel(float velocMax) {
        return velocMax*10000;
    }

}
