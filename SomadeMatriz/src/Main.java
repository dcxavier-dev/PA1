public class Main {
    public static void main(String[] args) {
        int[][] A = { //Declara matriz A de 2x2
                {2, 4},
                {6, 8}
        };
        int[][] B = { //Declara matriz B de 2x2
                {1, 3},
                {5, 7}
        };

        int[][] C = new int[2][2]; //Matriz C armazenará o resultado
        //Percorre as LINHAS (i) da matriz:
        for (int i = 0; i < 2; i++) {
            //Percorre as COLUNAS (j) da matriz:
            for (int j = 0; j < 2; j++) {
                //Soma os elementos correspondentes:
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        //EXIBE a matriz A:
        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        //EXIBE a matriz B:
        System.out.println("Matriz B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        //EXIBE a matriz C:
        System.out.println("Matriz C:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();


        }
    }
}