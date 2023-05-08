package PlayerMultimediale;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ElementoMultimediale[] arr = new ElementoMultimediale[5];

    public static void main(String[] args) {
    	PlayMulty();
        Play();

    }

    public static void PlayMulty() {

    	
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Scegli l'opzione multimediale: \n > 1 Immagine \n > 2 Video, \n > 3 Registrazione Audio");

            int input1 = input.nextInt();
            input.nextLine();


            switch (input1) {
                case 1:
                    System.out.println("Scrivi il titolo:");
                    String titolo1 = input.nextLine();
                    System.out.println("Regola la luminosità:");
                    int luminosita1 = input.nextInt();
                    arr[i] = new Immagine(titolo1, luminosita1);
                    break;
                    
                case 2:
                    System.out.println("Scrivi il titolo:");
                    String titolo2 = input.nextLine();
                    System.out.println("Regola la durata:");
                    int durata2 = input.nextInt();
                    System.out.println("Regola il volume:");
                    int volume2 = input.nextInt();
                    System.out.println("Regola la luminosità:");
                    int luminosita2 = input.nextInt();
                    arr[i] = new Video(titolo2, durata2, volume2, luminosita2);
                    break;
                    
                case 3:
                    System.out.println("Scrivi il titolo:");
                    String titolo3 = input.nextLine();
                    System.out.println("Regola la durata:");
                    int durata3 = input.nextInt();
                    System.out.println("Regola il volume:");
                    int volume3 = input.nextInt();
                    arr[i] = new Audio(titolo3, durata3, volume3);
                    break;
                    
                default:
                    i--;
                    System.out.println("Errore! Riprova di nuovo");
                    break;

            }

        }


    }

    public static void Play() {
        for (int seleziona = -1; seleziona != 0; ) {
            System.out.println("Quale elemento vuoi riprodurre? \n Scegli:  \n > 1-6   \n > 0 per terminare");
            seleziona = input.nextInt();

            if (seleziona >= 0 && seleziona <= 6) {
                ElementoMultimediale elemento = arr[seleziona - 1];

                if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                } else if (elemento instanceof Player) {
                    ((Player) elemento).play();
                }
            } else {
                System.out.println("Errore! Riprova di nuovo");
            }
        }
        input.close();
    }

}
