package projeto.banco;
import java.util.Scanner;
public class ProjetoBanco {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
//       cont_banco Jubileu = new cont_banco(1, "Conta Poupança", "Jubileu", 300.00, true);
//       cont_banco Creuza = new cont_banco(2, "Conta Corrente", "  Creuza",500.00,false );
       ///BAMNCO DO Júbileu/////////
       
        
        ////////Bncao da CREUZA///////
        System.out.println("Digite o seu nome:");
        String dono = tec.next(); 
        
        System.out.println(" ");
        
        System.out.println("Qual o tipo de conta você deseja ?: ");
        System.out.println("1- Conta Poupanca");
        System.out.println("2- Conta Corrente");
        int confirm = tec.nextInt();
        
            switch(confirm){
                case 1:
                    System.out.println("Abrindo conta Poupança");
                    break;
        }
    }
   
}
