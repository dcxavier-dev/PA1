import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<=10;i=i+2) {
            String XYZ=JOptionPane.showInputDialog("Digite um numero inteiro de 3 casas ("+i+"/10)");
            int num=Integer.parseInt(XYZ);
            if(num %2 == 0) {
                JOptionPane.showMessageDialog(null, "O numero é par.");
            } else {
                JOptionPane.showMessageDialog(null, "O numero é impar");
            }

        }

    }
}