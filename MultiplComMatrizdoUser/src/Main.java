import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int[][] A = new int[2][4]; //Matriz 2x4 A
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {   //Input do usuario = nulo -> Código abortado
                String input = JOptionPane.showInputDialog(null, "(A) Digite o elemento da posição [" + i + "][" + j + "]");
                if (input == null) return;
                A[i][j] = Integer.parseInt(input); //Valores convertidos de string para int

            }
        }

        int[][] B = new int[4][2]; //Matriz 4x2 B
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null, "(B) Digite o elemento da posição [" + i + "][" + j + "]");
                if (input == null) return;
                B[i][j] = Integer.parseInt(input);
            }
        }
                //Multiplicação resulta em matriz quadrada
                //Calculo da multiplicação: (A*B=result)
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 4; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

                //Exibição das matrizes (A, B e result)
        System.out.println("Matriz A (2x4)");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        } System.out.println();

        System.out.println("Matriz B (4x2)");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        } System.out.println();

        System.out.println("Resultado (Matriz 2x2)");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        } System.out.println();

    }
}