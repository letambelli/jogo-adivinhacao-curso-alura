import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            if (numeroDigitado != numeroGerado) {
                System.out.println("-".repeat(25));
                System.out.println("Adivinhe o número: ");
                numeroDigitado = leitura.nextInt();
                contador++;

                if (numeroDigitado != numeroGerado) {
                    System.out.println("Errou! Tente novamente.");
                }
                if (i == 4 && numeroDigitado != numeroGerado) {
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
