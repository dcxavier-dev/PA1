import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int cont=0; //conta quantos números foram somados
        int total=0; //contém o total da soma
        int ON=1; //Serve para manter o loop while
        do {
            String s1 = JOptionPane.showInputDialog("Digite um número a ser somado, digite 0 para ver o resultado");
            int num = Integer.parseInt(s1);
            if (num != 0) {           //Se algo além de 0 foi digitado a soma é efetuada e o loop não é encerrado
                total=total+num;
                cont++; //Acrescenta um a contagem
            } else if(num==0) { ON = 0; } //Verifica se 0 foi digitado, caso sim, o loop é encerrado
        }while (ON == 1);
        JOptionPane.showMessageDialog(null, +cont+" números foram somados, resultado: "+total);
        //Sair do loop while segue com a exibição do resultado
    }
} //OBS: Nessa versão, não é removido 1 da contagem
    //Pois digitar 0 não aumenta a contagem nessa versão, mas na versão de while sim