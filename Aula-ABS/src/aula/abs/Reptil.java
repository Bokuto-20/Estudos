package aula.abs;

public class Reptil extends Animal{
   private String cor_escama;

    @Override
    public void emitir_somstatic() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reagir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Reptil(String cor_escama, String nome, double peso, int idade, int membros) {
        super(nome, peso, idade, membros);
        this.cor_escama = cor_escama;
    }

    public String getCor_escama() {
        return cor_escama;
    }

    public void setCor_escama(String cor_escama) {
        this.cor_escama = cor_escama;
    }

    @Override
    public String toString() {
        return super.toString() + "cor_escama=" + cor_escama + '}';
    }

}