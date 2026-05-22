import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int i = 1; //Conta as execuções do prompt de pedir número
         int num = 0; //Contém o valor digitado no prompt
        int cont = 0; //Conta quantos dos números foram menores que 200 e maiores que 100
        //Não foi pedido uma quantia específica de números lidos (simplesmente "vários") então usei 10.

        do{
            String string = JOptionPane.showInputDialog("Digite um número natural qualquer. ("+i+"/10)");
            num=Integer.parseInt(string);
            i++;
            if(num==0) {
            return;  //Verifica-se se 0 foi o valor digitado a cada valor recebido, caso seja o código é encerrado
            }
            if(num>100 && num<200){
                cont++;
            }
        }while (num!=0 && i<=10); //Condição: Executado até ser digitado 0 ou até atingir 10 execuções
        JOptionPane.showMessageDialog(null, ""+cont+" números foram maiores que 100 e menores que 200.");



    }
}
