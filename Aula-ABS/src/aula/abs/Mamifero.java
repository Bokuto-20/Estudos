package aula.abs;
import java.util.Scanner;
public class Mamifero extends Animal{
    Scanner tec = new Scanner(System.in);
    private String cor_pelo;

    @Override
    public void emitir_somstatic() {
        System.out.println("AHHHHHHH");
     }

    @Override
    public void reagir() {
        String reacao;
        
        System.out.println("Qual e a reacao que ele esta?: ");
        reacao = tec.nextLine();
        
        if (reacao=="calmo"||reacao=="Calmo") {
            System.out.println("Abanar e latir");
        }
        else if(reacao=="agressivo"||reacao=="Agressivo"){
            System.out.println("Rosnar e latir alto");
        }
}

    public Mamifero(String cor_pelo, String nome, double peso, int idade, int membros) {
        super(nome, peso, idade, membros);
        this.cor_pelo = cor_pelo;
    }

    public Scanner getTec() {
        return tec;
    }

    public void setTec(Scanner tec) {
        this.tec = tec;
    }

    public String getCor_pelo() {
        return cor_pelo;
    }

    public void setCor_pelo(String cor_pelo) {
        this.cor_pelo = cor_pelo;
    }

    @Override
    public String toString() {
        return super.toString() + "tec=" + tec + ", cor_pelo=" + cor_pelo + '}';
    }

}