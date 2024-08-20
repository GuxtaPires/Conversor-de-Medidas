import java.util.Scanner;

public class Conversoes {
    public static double converteDistancia(double valor){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a conversão de distancia");
        System.out.println("1 - Metros para Kilometros");
        System.out.println("2 - Kilometros para metros");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();

        if(escolha == 1){
            sc.close();
            return valor / 1000.0;
        }
        else if(escolha == 2){
            sc.close();
            return valor * 1000.0;
        }
        sc.close();
        return 0.0;
    }

    public static double converteVolume(double valor){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a conversão de volume");
        System.out.println("1 - Litros para mililitros");
        System.out.println("2 - mililitros para litros");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();

        if(escolha == 1){
            sc.close();
            return valor * 1000.0;
        }
        else if(escolha == 2){
            sc.close();
            return valor / 1000.0;
        }
        sc.close();
        return 0.0;
    }

    public static double converteMassa(double valor){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a conversão de massa");
        System.out.println("1 - Kilogramas para Gramas");
        System.out.println("2 - Gramas para Kilogramas");
        System.out.print("Escolha: ");
        int escolha = sc.nextInt();

        if(escolha == 1){
            sc.close();
            return valor * 1000.0;
        }
        else if(escolha == 2){
            sc.close();
            return valor / 1000.0;
        }

        sc.close();
        return 0.0;
    }
}
