package services;

import models.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class GestorDisciplinas {
    private List<Disciplina> disciplinas = new ArrayList<>();
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Disciplina> getAllDisciplinas(){return disciplinas;}
    public void addDisciplina(Disciplina disciplina){disciplinas.add(disciplina);}

    public Disciplina SearchForDisciplina(String name) {
        for (Disciplina d : disciplinas) {
            if (d.getName().equals(name)) {
                return d;
            }
        }
        return null;
    }

    public void listAllDisciplinas(){
        for(Disciplina d: disciplinas){
            System.out.println(d);
        }
    }








}
