import java.util.Random;
import java.util.Scanner;

public class JokenPo {
    public static void main(String[] args) {
        Scanner scanner;

        do {
            int player, cpu, pontosPlayer = 0, pontosCpu = 0;
            scanner = new Scanner(System.in);
            System.out.println("\n___Vamos Jogar Jankenpon___\n");
            System.out.println(" Selecione sua jogada:");
            System.out.println("    1- Pedra");
            System.out.println("    2- Papel");
            System.out.println("    3- Tesoura");

            while ((pontosPlayer < 3) && (pontosCpu < 3)) {
                Random random = new Random();
                player = scanner.nextInt();
                cpu = random.nextInt(3) + 1;
                if (player == cpu) {
                    System.out.println("!!!Empate!!!");
                    } else if ((player == 2 && cpu == 1) ||
                            (player == 3 && cpu == 2) ||
                            (player == 1 && cpu == 3)) {
                        System.out.println("!!!Parabéns você venceu!!!");
                        pontosPlayer++;
                        } else if ((cpu == 1 && player == 3) ||
                                (cpu == 2 && player == 1) ||
                                (cpu == 3 && player == 2)) {
                            System.out.println("!!!Cpu Venceu!!!");
                            pontosCpu++;
                            } else {
                                System.out.println("Você digitou um número inválido!!!");
                            }
                                    System.out.println("\n     ____Placar____");
                                    System.out.println("Player:" + pontosPlayer + "         Cpu:" + pontosCpu);
                                    System.out.println("\nSelecione sua jogada:");
                                    System.out.println("    1- Pedra");
                                    System.out.println("    2- Papel");
                                    System.out.println("    3- Tesoura");}
                                    System.out.println("\nDeseja jogar novamente? S ou N");
                                    scanner.nextLine();
        } while (scanner.nextLine().equals("s"));
    }
}


