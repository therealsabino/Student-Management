import models.*;
import services.GestorAlunos;
import services.GestorDisciplinas;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Josh", 44, "Matematica");
        Disciplina mat = new Disciplina("Matematica", prof1);

        Aluno al1 = new Aluno("Filomeno", 21, "20241963");
        al1.addNota(new Nota(mat, 19));
        al1.addNota(new Nota(mat, 20));

        Aluno al2 = new Aluno("Daniel", 19, "20241962");
        al1.addNota(new Nota(mat, 15));

        GestorAlunos gestor = new GestorAlunos();
        gestor.addAlunos(al1);
        gestor.addAlunos(al2);
        for (Aluno a : gestor.getAlunos()) {
            System.out.println(a);
        }

        Professor prof2 = new Professor("Romulo", 50, "Educacao Fisica");
        Disciplina ef = new Disciplina("Educacao Fisica", prof2);

        GestorDisciplinas gestorD = new GestorDisciplinas();
        gestorD.addDisciplina(mat);
        gestorD.addDisciplina(ef);
        for (Disciplina d : gestorD.getDisciplinas()) {
            System.out.println(d);
        }
    }
}