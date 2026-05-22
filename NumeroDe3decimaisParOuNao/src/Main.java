import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<=10;i=i+2) {
            String XYZ=JOptionPane.showInputDialog("Digite um numero de 3 casas decimais ("+i+"/10)");
            double num=Double.parseDouble(XYZ);
            double num2 = num*1000; 
                if(num2 %2 == 0) {
                    JOptionPane.showMessageDialog(null, "O numero é par.");
                } else {
                    JOptionPane.showMessageDialog(null, "O numero é impar");
            }

        }

    }
}