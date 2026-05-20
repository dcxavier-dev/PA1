/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exibirtabuadajava;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class ExibirTabuadaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String string=JOptionPane.showInputDialog(null, "Digite o numero da qual se quer a tabuada.");
    int option=Integer.parseInt(string); //A variavel string recebe o numero digitado pelo usuario, e esse valor é atribuido e convertido para a a
    System.out.println("Tabuada de 1 a 10 do "+option+":"); //option, do tipo int, em seguida multiplicado e exibido na forma de tabuada ao usuario
    System.out.println(+option+" x 1 = "+option*1);
    System.out.println(+option+" x 2 = "+option*2);
    System.out.println(+option+" x 3 = "+option*3);
    System.out.println(+option+" x 4 = "+option*4);
    System.out.println(+option+" x 5 = "+option*5);
    System.out.println(+option+" x 6 = "+option*6);
    System.out.println(+option+" x 7 = "+option*7);
    System.out.println(+option+" x 8 = "+option*8);
    System.out.println(+option+" x 9 = "+option*9);
    System.out.println(+option+" x 10 = "+option*10);
    }
    
}
