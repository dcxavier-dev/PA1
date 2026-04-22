/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validaçãosenha;

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;
public class ValidaçãoSenha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String senha=JOptionPane.showInputDialog(null,"Digite a senha.");
        if (senha.equals("abcd")){
        JOptionPane.showMessageDialog(null,"Senha validada com sucesso.");}
        else {
                JOptionPane.showMessageDialog(null,"Senha incorreta.");}
                }
        
    }

