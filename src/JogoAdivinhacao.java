import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int tentativa = 0;

        for (int i = 0; i < 5; i++) {
            if (tentativa != numero) {
                System.out.println("Adivinhe o número: ");
                tentativa = leitura.nextInt();
                System.out.println("Errou! Tente novamente.");
                if (i == 4 && tentativa != numero) {
                    System.out.println("Você errou todas! Mais sorte na próxima tentativa!");
                }
            }
            else {
                System.out.println("Parabéns! Você adivinhou o número!");
                break;
            }
        }

    }
}
