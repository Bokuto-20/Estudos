package aula.abs;
import java.util.Scanner;
public class Ave extends Animal{
    Scanner tec = new Scanner (System.in);
    
    private String cor_pena;
    
    public void Fazer_Ninho(){
        System.out.println("Fazendo Ninho");
    }

    @Override
    public void emitir_somstatic() {
        System.out.println("cru, cru, cru");    
    }

    @Override
    public void reagir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void reagir(String reacao) {
        
        System.out.println("Qual é a reação que ele está?: ");
        reacao = tec.nextLine();
        
        if (reacao=="Agradavel"||reacao=="agradavel") {
            
        }
    }
    

    public Ave(String cor_pena, String nome, double peso, int idade, int membros) {
        super(nome, peso, idade, membros);
        this.cor_pena = cor_pena;
    }

    

    public String getCor_pena() {
        return cor_pena;
    }

    public void setCor_pena(String cor_pena) {
        this.cor_pena = cor_pena;
    }

    @Override
    public String toString() {
        return super.toString() + "cor_pena=" + cor_pena + '}';
    }

}
