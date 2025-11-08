package models;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String StudentID;
    private List<Nota> notas;

    public Aluno(String name, int age, String StudentID) {
        super(name, age);
        this.StudentID = StudentID;
        this.notas = new ArrayList<>();
    }

    public String getStudentID(){
        return StudentID;
    }
    public void addNota(Nota nota){
        notas.add(nota);

    }

    public double CalculateAverage(){
        if(notas.isEmpty()) return 0;
        double sum = 0;
        for(Nota n: notas) sum += n.getValor;
        return sum;
    }

    @Override
    public String toString(){
        return "Aluno" + getName() + "[" + StudentID + "] - Media: " + String.format("%2f", CalculateAverage());
    }




}
