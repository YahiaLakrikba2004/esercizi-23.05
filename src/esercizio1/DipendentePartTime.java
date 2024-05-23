package esercizio1;

public class DipendentePartTime extends Dipendente {


    public DipendentePartTime(int matricola, double stipendio, Dipartimento nome ) {
        super(matricola,stipendio,nome);
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }



//    public static void main(String[] args) {
//        Dipendente dipendente = new DipendentePartTime(54321, 2500, Dipartimento.Vendite);
//        System.out.println("La matricola del dipendente è " + dipendente.getMatricola());
//        System.out.println("Stipedio calcolato: " + dipendente.calculateSalary() + " €");
//        System.out.println("Il dipartimento del dipendente è " + dipendente.getNome());
//    }

}

