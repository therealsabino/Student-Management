package models;

public class Disciplina {
    private String name;
    private Professor professor;

    public Disciplina(String especialidade, Professor professor){
        this.name = name;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString(){
        return name + "( Prof: " + getProfessor() + ")";
    }
}


