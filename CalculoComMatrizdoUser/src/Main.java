import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int[][] A = new int[3][3]; //Matriz 3x3 A
            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++) {   //Recebe os valores do user, caso algum seja nulo, encerra o código
                    String input = JOptionPane.showInputDialog(null, "Digite o elemento da posição [" + i + "][" + j + "]");
                    if (input == null) return;
                    A[i][j] = Integer.parseInt(input); //Traduz os valores de uma string para int, e deposita na matriz

                }
            }

        int[][] B = new int[3][3]; //Matriz 3x3 B
            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++) {
                    String input = JOptionPane.showInputDialog(null, "Digite o valor da posição [" + i + "][" + j + "]");
                    if(input==null) return;
                    B[i][j] = Integer.parseInt(input);
                }
            }
                //Exibição da matriz A
        System.out.println("Matriz A");
            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++) {
                    System.out.print(A[i][j] + "\t");
                }
                System.out.println();
            } System.out.println();
                //Exibição da matriz B
            System.out.println("Matriz B");
            for (int i=0;i<3;i++) {
                for (int j=0;j<3;j++) {
                    System.out.print(B[i][j] + "\t");
                }
                System.out.println();
            } System.out.println();
                //Calculo da adição/soma
        int[][] ADIC = new int[3][3];
            for (int i=0;i<3;i++) {
                for (int j = 0; j < 3; j++) {
                    ADIC[i][j] = A[i][j] + B[i][j];
                }
            }
                //Calcula da subtração
        int[][] SUBT = new int[3][3];
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                SUBT[i][j] = A[i][j] + B[i][j];
            }
        }
                //Calculo da dviisão
        int[][] DIV = new int[3][3];
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                DIV[i][j] = A[i][j] + B[i][j];
            }
        }

                //Passando para a exibição dos resultados:

        System.out.println("ADIÇÃO");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(ADIC[i][j] + "\t");
            }
            System.out.println();
        } System.out.println();

        System.out.println("SUBTRAÇÃO");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(SUBT[i][j] + "\t");
            }
            System.out.println();
        } System.out.println();

        System.out.println("DIVISÃO");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(DIV[i][j] + "\t");
            }
            System.out.println();
        } System.out.println();

    } //main string end
} //Main class end


