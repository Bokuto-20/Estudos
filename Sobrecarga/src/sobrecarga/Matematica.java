package sobrecarga;

public class Matematica {
    
    public String calculo(int a){
        
        return (Math.floorMod(a,2)==0)?"Par":"Impar";
    }
    public void calculo(double a, double b){
        System.out.println("A soma e: "+(a+b));
        System.out.println("A media de dos tres e: "+ (a+b)/2);
    }
    
    public double calculo (double a, double b, double c){
        double dl, x1, x2;
        
        dl = Math.pow(b, 2)-(4*a*c);
        System.out.println("O valo de Delta: " +dl);
        
        if (dl<0) {
            System.out.println("Não existe raizes reais.");
        }
        else if (dl==0) {
            double x = -b /(2*a);
            System.out.println("Existe uma raiz real" + x);
        }
        else{
             x1 = (-b + Math.sqrt(dl)) / (2 * a);
             x2 = (-b - Math.sqrt(dl)) / (2 * a);
            
            System.out.println(" A valor de x1 e: "+ x1 + " e o valor de x2 e: "+ x2);
        }
        
        return dl;
      
} 
}