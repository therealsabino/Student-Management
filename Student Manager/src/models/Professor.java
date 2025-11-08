package models;

public class Professor  extends Pessoa{
    private String especialidade;

    public Professor(String name, int age, String especialidade) {
        super(name, age);
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    @Override
    public String toString(){
        return "Professor" + getName() + "-" + especialidade;
    }

}
