/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodebaskarajava;

/**
 *
 * @author Admin
 */
public class CalculodeBaskaraJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int d=0, a=2, b=9, c=4;
        double dr=0, xpositivo=0,xnegativo=0;
        d=(b*b)-(4*a*c);
        dr=Math.sqrt(d);
        
        xpositivo=((b-(2*b))+dr)/(2*a);
        System.out.println("X1 e: "+xpositivo);
        
        xnegativo=((b-(2*b))-dr)/(2*a);
        System.out.println("X2 e: "+xnegativo);
        // TODO code application logic here
    }
    
}
