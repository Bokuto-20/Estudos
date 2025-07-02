package sobrecarga;


public class Sobrecarga {

  
    public static void main(String[] args) {
      Matematica mat = new Matematica();
      
       System.out.println(mat.calculo(7)); 
        System.out.println("");
       
        mat.calculo(7, 4);
        System.out.println("");
        
        mat.calculo(1, -11, 12);
        System.out.println(" ");
        
        mat.calculo(1, 7, 5);
        
        
        
    }
    
}
