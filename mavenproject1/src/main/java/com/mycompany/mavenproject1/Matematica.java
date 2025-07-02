
package com.mycompany.mavenproject1;

public class Matematica {
    
    public String ParImpar(int a){
        return ((Math.floorMod(a, 2)==0)?" Par":" Impar");
    }
    
    public double Media(double a, double b){
        
        return (a+b)/2;
    }
    
    public double calcularDelta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public double calcularX1(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public double calcularX2(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    
}
