import java.sql.SQLOutput;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            System.out.println("Defina se o seu veículo será de cargo ou Passeio:");
            System.out.println("1 - Para Passeio");
            System.out.println("2 - Para Carga");
           int cargaPasseio = scanner.nextInt();
           if(cargaPasseio == 1){
               System.out.println("Digite a quantidade de passageiros");
               int qtdPassageiros = scanner.nextInt();
               System.out.println("Digite a quantidade de pistões do motor");
               int qtdPista = scanner.nextInt();
               System.out.println("Digite a potência do motor");
               int potencia = scanner.nextInt();
               System.out.println("Digite a placa");
               String placa = scanner.next();
               System.out.println("Digite a marca");
               String marca = scanner.next();
               System.out.println("Digite o modelo");
               String modelo = scanner.next();
               System.out.println("Digite a cor");
               String cor = scanner.next();
               System.out.println("Digite a velocidade máxima");
               float velocMax = scanner.nextFloat();
               System.out.println("Digite a quantidade de rodas");
               int qtdRodas = scanner.nextInt();
               Motor motor1 = new Motor(qtdPista, qtdRodas);
               Passeio veiculo1 = new Passeio(qtdPassageiros, placa, marca, modelo, cor, velocMax, qtdRodas, motor1);
               System.out.println("Placa: "+veiculo1.placa + "\nMarca: "+veiculo1.marca + "\nModelo : "+veiculo1.modelo + "\nCor : "+veiculo1.cor + "\nVelocidade Máxima: "+veiculo1.calcVel(velocMax)+"m/h" + "\nQuantidade de rodas : "+veiculo1.qtdRodas + "\nQuantidade de pistões: "+veiculo1.motor.qtdPista + "\nPotência: "+veiculo1.motor.potencia+"\n");
           }
           if(cargaPasseio == 2){
               System.out.println("Digite a carga máxima:");
               int cargaMax = scanner.nextInt();
               System.out.println("Digite a tara do veículo:");
               int tara = scanner.nextInt();
               System.out.println("Digite a quantidade de pistões do motor");
               int qtdPista = scanner.nextInt();
               System.out.println("Digite a potência do motor");
               int potencia = scanner.nextInt();
               System.out.println("Digite a placa");
               String placa = scanner.next();
               System.out.println("Digite a marca");
               String marca = scanner.next();
               System.out.println("Digite o modelo");
               String modelo = scanner.next();
               System.out.println("Digite a cor");
               String cor = scanner.next();
               System.out.println("Digite a velocidade máxima");
               float velocMax = scanner.nextFloat();
               System.out.println("Digite a quantidade de rodas");
               int qtdRodas = scanner.nextInt();
               Motor motor2 = new Motor(qtdPista, qtdRodas);
               Carga veiculo2 = new Carga(cargaMax, tara, placa, marca, modelo, cor, velocMax, qtdRodas, motor2);
               System.out.println("Placa: "+veiculo2.placa + "\nMarca: "+veiculo2.marca + "\nModelo : "+veiculo2.modelo + "\nCor : "+veiculo2.cor + "\nVelocidade Máxima: "+veiculo2.calcVel(velocMax) +"cm/h"+ "\nQuantidade de rodas : "+veiculo2.qtdRodas + "\nQuantidade de pistões: "+veiculo2.motor.qtdPista + "\nPotência: "+veiculo2.motor.potencia+"\n");
           }
        }
        scanner.close();
    }
}
