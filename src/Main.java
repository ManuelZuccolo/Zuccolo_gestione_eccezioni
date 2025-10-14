import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Inserisci prima data:");
            System.out.print("Giorno: ");
            int g1 = input.nextInt();
            System.out.print("Mese: ");
            int m1 = input.nextInt();
            System.out.print("Anno: ");
            int a1 = input.nextInt();
            Data data1 = new Data(g1, m1, a1);

            System.out.println("Inserisci seconda data:");
            System.out.print("Giorno: ");
            int g2 = input.nextInt();
            System.out.print("Mese: ");
            int m2 = input.nextInt();
            System.out.print("Anno: ");
            int a2 = input.nextInt();
            Data data2 = new Data(g2, m2, a2);

            System.out.println("Prima data: " + data1.getData());
            System.out.println("Seconda data: " + data2.getData());
            System.out.println("Distanza in giorni: " + data1.distanzaInGiorni(data2));

        } catch (DataNonValidaException e)
        {
            System.out.println("Errore: " + e.getMessage());
        }

        input.close();
    }
}