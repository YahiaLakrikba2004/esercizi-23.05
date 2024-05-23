package esercizio1;

public class Dirigente extends Dipendente {
    private double bonus;


    public Dirigente(int matricola, double stipendio, Dipartimento nome, double bonus) {
        super(matricola, stipendio, nome);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() + bonus;
    }

    @Override
    public String toString() {
        return "Dirigente{" +
                "Matricola" + getMatricola() +
                ", Stipendio" + getStipendio() +
                ", Nome" + getNome() +
                ", Bonus=" + bonus +
                '}';
    }
}




