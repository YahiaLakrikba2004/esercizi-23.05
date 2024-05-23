package esercizio1;

public abstract class Dipendente {
    private long matricola;
    private double stipendio;


    public enum Dipartimento {
        Produzione, Amministrazione, Vendite
    }

    private Dipartimento nome;

    public Dipendente(int matricola, double stipendio, Dipartimento nome) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.nome = nome;
    }

    public long getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }


    public Dipartimento getNome() {
        return nome;
    }

    public void setNome(Dipartimento nome) {
        this.nome = nome;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio" + stipendio +
                ", Nome" + nome +

                "}";
    }

//    public static void main (String[] args) {
//
//        Dipendente dipendente = new Dipendente( 12345, 1000, Dipartimento.Produzione);
//        System.out.println("La matricola del dipendente è " + dipendente.matricola);
//        System.out.println("Lo stipendio del dipendente è " + dipendente.stipendio);
//        System.out.println("Il dipartimento del dipendente è "+ dipendente.nome);
//
//
//
//    }
//
}
