import java.sql.SQLOutput;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            if(i == 0) {
                System.out.println("\nINICIANDO FORMULÁRIO DO CARRO\n");

            }
            if(i>0) {
                System.out.println("\n... Insira novos dados para um novo veículo");
            }
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
            Veículo veiculo1 = new Veículo(placa, marca, modelo, cor, velocMax, qtdRodas, motor1);

            System.out.println("Placa: "+veiculo1.placa + "\nMarca: "+veiculo1.marca + "\nModelo : "+veiculo1.modelo + "\nCor : "+veiculo1.cor + "\nVelocidade Máxima: "+veiculo1.velocMax + "\nQuantidade de rodas : "+veiculo1.qtdRodas + "\nQuantidade de pistões: "+veiculo1.motor.qtdPista + "\nPotência: "+veiculo1.motor.potencia+"\n");
            if(i==5){
                System.out.println("Encerrando dados...");
            }
        }
        scanner.close();
    }
}
