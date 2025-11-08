import models.*;

public class Main{
    public static void main(String[] args){
        Professor prof1 = new Professor("Josh", 44, "Matematica");
        Disciplina mat = new Disciplina("Matematica", prof1);

        Aluno al1 = new Aluno("Filomeno", 21, "20241963");
        al1.addNota(new Nota(mat, 19));
        al1.addNota(new Nota(mat, 20));

        Aluno al2 = new Aluno("Daniel", 19, "20241962");
        al1.addNota(new Nota(mat, 15));



    }
}