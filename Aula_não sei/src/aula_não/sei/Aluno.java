
package aula_não.sei;


public class Aluno extends Pessoa{
         private String matricula;
         private String curso;
         
         public void Cancelarmatricula(){
             System.out.println("Cancelar matricula");
}

    public Aluno(String matricula, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "matricula=" + matricula + ", curso=" + curso + '}';
    }
}

