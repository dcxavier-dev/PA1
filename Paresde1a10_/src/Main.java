
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        System.out.println("Numeros pares entre 0 e 10. (Sem 0 e 10)"); //Fora do "for" pra evitar repetição
        for (int i = 0; i < 10; i = i + 2) {
            if(i>1){ //Isso serve pra garantir que o 0 não será exibido, levei em conta que 0 e 10 não estão no intervalo dado.
                System.out.println(+i);
            }

        }
    }
}