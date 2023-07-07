import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int chute = 0;
        int chances = 5;
        int random = new Random().nextInt(100);

        for (int tentativas = 0; tentativas < 5; tentativas++) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Qual o número que você deseja jogar? Você tem "+ chances +" chances.");
            chute = (int) leitura.nextDouble();
            chances--;
            if(chute == random){
                System.out.println("Parabéns! você acertou o número.");
                break;
            }else if(chute > random){
                System.out.println("Seu chute foi maior que o valor, tente novamente!");
            }else {
                System.out.println("Seu chute foi menor que o valor, tente novamente!");
            }

        }
    }
}