package esercizio1;

public class Main {

    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[4];

        dipendenti[0] = new DipendenteFullTime(12345, 4500, Dipendente.Dipartimento.Produzione, 9);
        dipendenti[1] = new DipendentePartTime(54321, 2500, Dipendente.Dipartimento.Vendite);
        dipendenti[2] = new Dirigente(23920, 4500, Dipendente.Dipartimento.Amministrazione, 1500);

        for (Dipendente dipendente : dipendenti) {
            if ( dipendente instanceof DipendenteFullTime) {
                System.out.println("Dipendente FullTime:");
            } else if (dipendente instanceof DipendentePartTime) {
                System.out.println("Dipendente PartTime:");
            } else if (dipendente instanceof Dirigente) {
                System.out.println("Dirigente:");
            }

            System.out.println("La matricola del dipendente è " + dipendente.getMatricola()
            );
            if (dipendente instanceof DipendenteFullTime) {
                System.out.println("ore di lavoro del dipendente: " + ((DipendenteFullTime) dipendente).getOreDiLavoro());
            }
            System.out.println("Stipendio calcolato: " + dipendente.calculateSalary() + "€");
            System.out.println("Il dipartimento del dipendente è " + dipendente.getNome());

            System.out.println();


        }


    }
}
