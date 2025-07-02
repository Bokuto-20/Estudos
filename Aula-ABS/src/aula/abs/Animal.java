
package aula.abs;

abstract class Animal {
    private String nome;
    private double peso;
    private int idade;
    private int membros;

    public abstract void emitir_somstatic();
    public abstract void reagir();  

    public Animal(String nome, double peso, int idade, int membros) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", peso=" + peso + ", idade=" + idade + ", membros=" + membros + '}';
    }
}

  