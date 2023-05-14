package Progetto.Catalogo.bibliografico;


import java.util.Scanner;

public class MainProject {
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Scegli un'opzione:");
            System.out.println("[1] Aggiungi libro");
            System.out.println("[2] Aggiungi rivista");
            System.out.println("[3] Rimuovi elemento dato un codice ISBN");
            System.out.println("[4] Ricerca per ISBN");
            System.out.println("[5] Ricerca per anno pubblicazione");
            System.out.println("[6] Ricerca per autore");
            System.out.println("[7] Carica elementi su disco");
            System.out.println("[8] Salva elementi su disco");
            System.out.println("[9] Stampa catalogo");
            System.out.println("[0] Termina il programma");

            int scelta = input.nextInt();
            input.nextLine();

            switch (scelta) {
                case 1:
                    aggiungiLibro(catalogo, input);
                    break;
                case 2:
                    aggiungiRivista(catalogo, input);
                    break;
                case 3:
                    rimuoviElemento(catalogo, input);
                    break;
                case 4:
                    ricercaPerISBN(catalogo, input);
                    break;
                case 5:
                    ricercaPerAnnoPubblicazione(catalogo, input);
                    break;
                case 6:
                    ricercaPerAutore(catalogo, input);
                    break;
                case 7:
                    caricaElementiSuDisco(catalogo, input);
                    break;
                case 8:
                    salvaElementiSuDisco(catalogo, input);
                    break;
                case 9:
                    catalogo.stampaCatalogo();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }
    }

    private static void salvaElementiSuDisco(Catalogo catalogo, Scanner input) {
		
		
	}

	private static void caricaElementiSuDisco(Catalogo catalogo, Scanner input) {
		// TODO Auto-generated method stub
		
	}

	private static void ricercaPerAutore(Catalogo catalogo, Scanner input) {
		// TODO Auto-generated method stub
		
	}

	private static void ricercaPerAnnoPubblicazione(Catalogo catalogo, Scanner input) {
		// TODO Auto-generated method stub
		
	}

	private static void ricercaPerISBN(Catalogo catalogo, Scanner input) {
		// TODO Auto-generated method stub
		
	}

	private static void rimuoviElemento(Catalogo catalogo, Scanner input) {
		// TODO Auto-generated method stub
		
	}

	private static void aggiungiLibro(Catalogo catalogo, Scanner input) {
        System.out.println("Inserisci dati del libro:");
        System.out.print("ISBN: ");
        String isbn = input.nextLine();
        System.out.print("Titolo: ");
        String titolo = input.nextLine();
        System.out.print("Anno Pubblicazione: ");
        int anno = input.nextInt();
        input.nextLine();
        System.out.print("Numero pagine: ");
        int pagine = input.nextInt();
        input.nextLine();
        System.out.print("Autore: ");
        String autore = input.nextLine();
        System.out.print("Genere: ");
        String genere = input.nextLine();

        Libro libro = new Libro(isbn, titolo, anno, pagine, autore, genere);
        catalogo.aggiungi(libro);
    }

    private static void aggiungiRivista(Catalogo catalogo, Scanner input) {
        System.out.println("Inserisci dati della rivista:");
        System.out.print("ISBN: ");
        String isbnR = input.nextLine();
        System.out.print("Titolo: ");
        String titoloR = input.nextLine();
        System.out.print("Anno Pubblicazione: ");
        int annoR = input.nextInt();
        input.nextLine();
        System.out.print("Numero pagine: ");
        int pagineR = input.nextInt();
        input.nextLine();
        System.out.print("Numero della rivista: ");
        int numeroR = input.nextInt();
        input.nextLine();
        System.out.print("Autore: ");
        String autoreR = input.nextLine();
        System.out.print("Periodicità: ");
        System.out.print("Editore: ");
        Rivista rivista = new Rivista(isbnR, titoloR, annoR, pagineR, numeroR, autoreR);
        catalogo.aggiungi(rivista);
    }
}