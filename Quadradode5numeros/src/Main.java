import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { //Variavel i conta as execuções do prompt
            String ABC = JOptionPane.showInputDialog("Digite um número inteiro qualquer ("+i+"/5)");
            int num=Integer.parseInt(ABC); //Variavel para o numero digitado
            int quad=num*num; //Variavel para o quadrado do digitado
            JOptionPane.showMessageDialog(null, "O quadrado de "+num+" é "+quad);
            if(i>=5) {
            JOptionPane.showMessageDialog(null, "Obrigado por testar!");
            return;
            }
        }
    }
}