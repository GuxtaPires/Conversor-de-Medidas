import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("---------------Conversão de medidas---------------");
        System.out.println("Olá, informe qual conversão você quer realizar:");
        System.out.println("1 - Distância (metros para kilometros, etc)");
        System.out.println("2 - Volume (Litros para mililitros)");
        System.out.println("3 - Massa (Quilogramas para gramas)");
        System.out.print("Escoha: ");
        int escolha = sc.nextInt();
        System.out.println("--------------------------------------------------");
        System.out.print("Informe o valor: ");
        double valor = sc.nextDouble();

        double resposta;

        switch (escolha) {
            case 1:
                resposta = Conversoes.converteDistancia(valor);
                System.out.print("O valor convertido é igual a: " + resposta);
                break;
            case 2:
                resposta = Conversoes.converteVolume(valor);
                System.out.print("O valor convertido é igual a: " + resposta);
                break;
            case 3:
                resposta = Conversoes.converteMassa(valor);
                System.out.print("O valor convertido é igual a: " + resposta);
                break;
            default:
                System.out.println("Valor inválido, encerrando sistema...");
                break;
        }

        sc.close();
    }
}
