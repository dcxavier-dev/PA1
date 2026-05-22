import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int cont=0; //conta quantos números foram somados
        int total=0;
        int ON=1; //Serve para manter o loop while, caso o usuario digite 0, ON deixa de ser 1 finalizando o while.
        while (ON == 1) { //Se ON != 1, o loop é finalizado
            String s1=JOptionPane.showInputDialog("Digite números a serem somados ou 0 para finalizar.");
            int num=Integer.parseInt(s1);
            if(num == 0){ //Caso 0 seja digitado, o loop é terminado
                cont--;
                ON=0; //Finaliza o loop
            }
            total = total + num; //Soma os numeros digitados
            cont++; //Acrescenta um a contagem de numeros somados

        }
        JOptionPane.showMessageDialog(null, +cont+" números foram somados, resultado: "+total);
        //Sair do loop while segue com a exibição do resultado
    }
}