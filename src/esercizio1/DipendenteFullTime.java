package esercizio1;

public class DipendenteFullTime extends Dipendente {
    private int oreDiLavoro;


    public DipendenteFullTime (int matricola, double stipendio, Dipartimento nome, int oreDiLavoro) {
        super(matricola, stipendio, nome);
        this.oreDiLavoro = oreDiLavoro;
    }

    public int getOreDiLavoro() {
        return oreDiLavoro;
    }

    @Override
    public double calculateSalary() {
        return getStipendio();
    }

    @Override
    public String toString() {
        return "DipendenteFullTime{" +
                "Matricola" + getMatricola() +
                ", Stipendio" + getStipendio() +
                ", Nome" + getNome() +
                ", Ore di lavoro=" + getOreDiLavoro() +
                '}';
    }

//    public static void main (String[] args) {
//        Dipendente dipendente = new DipendenteFullTime(12345, 4500,Dipartimento.Produzione);
//        System.out.println("La matricola del dipendente è " + dipendente.getMatricola());
//        System.out.println("Stipendio calcolato: " + dipendente.calculateSalary() + " €");
//        System.out.println("Il dipartimento del dipendente è " + dipendente.getNome());
//
//
//
//    }


}
