public class Motor {

    int qtdPista;
    int potencia;

    public int getQtdPista() {
        return qtdPista;
    }

    public void setQtdPista(int qtdPista) {
        this.qtdPista = qtdPista;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Motor(int qtdPista, int potencia){
        this.qtdPista = qtdPista;
        this.potencia = potencia;
    }
}
