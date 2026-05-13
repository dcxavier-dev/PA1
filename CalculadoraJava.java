import java.util.Scanner;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int opcao=0;
    while (true){
        System.out.println("Determine o primeiro valor da equação");
        int valor1 = scanner.nextInt();
        System.out.println("Determine o segundo valor da equação");
        int valor2 = scanner.nextInt();
        System.out.println("Escolha a operação (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
        opcao = scanner.nextInt();
    

    int result=0;
    switch(opcao) {
        case 1:
            result =(valor1+valor2);
            System.out.println(+valor1 +" + " +valor2 +" = "+result);
            break;
        case 2:
            result =(valor1-valor2);
            System.out.println(+valor1 +" - " +valor2 +" = "+result);
            break;
        case 3:
            result =(valor1*valor2);
            System.out.println(+valor1 +" x " +valor2 +" = "+result);
            break;
        case 4:
            result =(valor1/valor2);
            System.out.println(+valor1 +" : " +valor2 +" = "+result);
            break;
    }

}
    }
}
