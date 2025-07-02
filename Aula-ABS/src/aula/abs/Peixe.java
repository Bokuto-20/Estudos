package aula.abs;


public class Peixe extends Animal{
    
    private String Cor_escama;

    @Override
    public void emitir_somstatic() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reagir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Peixe(String Cor_escama, String nome, double peso, int idade, int membros) {
        super(nome, peso, idade, membros);
        this.Cor_escama = Cor_escama;
    }

    @Override
    public String toString() {
        return super.toString() + "Cor_escama=" + Cor_escama + '}';
    }
    
}
