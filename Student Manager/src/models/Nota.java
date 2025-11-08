package models;

public class Nota {
    public double getValor;
    private Disciplina disciplina;
    private double valor;

    public Nota(Disciplina mat, int i){
        this.disciplina = disciplina;
        this.valor = valor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString(){
        return disciplina.getName() + ":" + valor;
    }

}
