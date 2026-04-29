/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculomaioridade;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class CalculoMaioridade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade=0;
        String string= JOptionPane.showInputDialog(null, "Digite o seu ano de nascimento.");
        int nasc= Integer.parseInt(string);
        int ano=2026; //Variavel para o ano atual.
        idade=(ano-nasc);
            if (idade<18){
                JOptionPane.showMessageDialog(null, "Voce e menor de idade, idade: "+idade+" anos.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Voce e maior de idade, idade:"+idade+" anos.");
            
            }
        
    }
    
}
