/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculopesoideal;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class CalculoPesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double altura=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura"));
        double peso=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso"));
        String sexo= JOptionPane.showInputDialog(null,("Qual o sexo? Digite 'masc' ou 'fem'"));
        if (sexo.equals("masc")){
           peso=(72.7*altura)-58;
          JOptionPane.showMessageDialog(null,"masculino,seu peso ideal e: "+peso);}
          if (sexo.equals("fem")){
            peso=(62.1*altura)-44.7;
              JOptionPane.showMessageDialog(null,"feminino,seu peso ideal e: "+peso);}
          
        
        
        
        
    }
    
}
