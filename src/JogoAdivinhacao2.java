import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;
        int contador = 0;

        while (contador < 5){
            System.out.println("-".repeat(25));
            System.out.println("Adivinhe o numero: ");
            numeroDigitado = leitura.nextInt();
            contador++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabéns! Você adivinhou em " + contador + "tentativas!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Maior.");
            } else if (numeroDigitado > numeroGerado) {
                System.out.println("Menor.");
            }
        }
        if (contador == 5 && numeroDigitado != numeroGerado) {
        System.out.println("Você não conseguiu acertar em 5 tentativas. O número era: " + numeroGerado);
    }}}


