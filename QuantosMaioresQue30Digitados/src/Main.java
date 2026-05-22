import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;

public class Main {
  public static void main(String[] args) {
        int cont=0; //Conta quantos dos numeros foram maiores que 30
        for (int i = 1; i <= 15; i++) { //Variavel conta quantas vezes foi executado o prompt de receber o numero.
            String string = JOptionPane.showInputDialog("Digite um número natural qualquer. ("+i+"/15)");
            int num = Integer.parseInt(string);
            if (num > 30) {
                cont++;} //se o numero digitado for maior que 30, é acrescentado 1 a cont
        }
      JOptionPane.showMessageDialog(null, "Dos 15 números, um total de "+cont+" foram maiores do que 30.");
        //É exibido somente após a condição de for se tornar falsa
    }
}