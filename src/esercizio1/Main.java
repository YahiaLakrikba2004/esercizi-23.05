package esercizio1;

public class Main {

    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[4];
        Volontario[] volontari = new Volontario[2];

        dipendenti[0] = new DipendenteFullTime(12345, 4500, Dipendente.Dipartimento.Produzione, 9);
        dipendenti[1] = new DipendentePartTime(54321, 2500, Dipendente.Dipartimento.Vendite);
        dipendenti[2] = new Dirigente(23920, 4500, Dipendente.Dipartimento.Amministrazione, 1500);

        volontari[0] = new Volontario("Marco", 25, "Esperienza nel settore sociale");
        volontari[1] = new Volontario("Anna", 30, "Esperienza in eventi di raccolta fondi");

        for (Dipendente dipendente : dipendenti) {
            if (dipendente != null) {
                if (dipendente instanceof DipendenteFullTime) {
                    System.out.println("Dipendente FullTime:");
                    System.out.println("La matricola del dipendente è " + dipendente.getMatricola());
                    System.out.println("ore di lavoro del dipendente: " + ((DipendenteFullTime) dipendente).getOreDiLavoro());
                } else if (dipendente instanceof DipendentePartTime) {
                    System.out.println("Dipendente PartTime:");
                    System.out.println("La matricola del dipendente è " + dipendente.getMatricola());
                } else if (dipendente instanceof Dirigente) {
                    System.out.println("Dirigente:");
                    System.out.println("La matricola del dipendente è " + dipendente.getMatricola());
                }

                System.out.println("Stipendio calcolato: " + dipendente.calculateSalary() + "€");
                System.out.println("Il dipartimento del dipendente è " + dipendente.getNome());
                if (dipendente instanceof DipendenteFullTime) {
                    dipendente.checkIn();
                }

                System.out.println();
            }
        }
        for (Volontario volontario : volontari) {
            if (volontario != null) {
                System.out.println("Volontario:");
                System.out.println("Nome del volontario: " + volontario.getNome());
                System.out.println("Età del volontario: " + volontario.getEta());
                System.out.println("Esperienza del volontario: " + volontario.getCv());
                volontario.checkIn();
                System.out.println();
            }
        }
    }
}