import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        // Creo array con la lista di invitati
        String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // Creo una classe scanner
        Scanner input = new Scanner(System.in);

        // Chiedo all'utente di inserire il nome
        System.out.println("Inserisci il tuo nome");
        String nomeUtente = input.nextLine();

        // Creo ciclo for per verificare se il nome inserito si trova nella guest list
        boolean isFound = false;
        for (String nome : guestList) {
            if (nome.equalsIgnoreCase(nomeUtente)) {
                isFound = true;
                break;
            }
        }

        // Risultato
        if (isFound) {
            System.out.println("Benvenut* alla festa, " + nomeUtente + "!");
        } else {
            System.out.println("Mi dispiace," + nomeUtente + ", non sei nella lista degli invitati");
        }

        // Chiudo lo scanner
        input.close();
    }

}
