package services;

import models.Aluno;
import java.util.ArrayList;
import java.util.List;

public class GestorAlunos {
    private List<Aluno> alunos = new ArrayList<>();
    private Object getStudentID(){
        return null;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void addAlunos(Aluno aluno){
       alunos.add(aluno);
    }

    public Aluno SearchForStudentID(String StudendID){
        for(Aluno a: alunos)
            if(a: getStudentID().equals(StudendID);
        return null;
    }




}
