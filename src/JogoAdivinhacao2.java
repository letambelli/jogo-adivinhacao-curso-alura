import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;
        int contador = 0;

        while (contador < 5){
            contador++;
            System.out.println("-".repeat(25));
            System.out.println("Adivinhe o numero: ");
            numeroDigitado = leitura.nextInt();

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabéns! Você adivinhou!");
                break;
            }
            else {
                System.out.println("Errou! Tente novamente!");
                if (contador == 5 && numeroDigitado != numeroGerado) {
                    System.out.println("Você errou todas! Mais sorte na próxima!");
                }
            }
        }
    }
}
