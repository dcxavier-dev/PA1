public class Main {
    public static void main(String[] args) {
            int [][] A = { //Declara matriz A 2x2
                    {2 , 4},
                    {6 , 8}
            };
            int [][] B = { //Declara matriz B 2x2
                    {1 , 3},
                    {5 , 7}
            };
            int [][] C = new int[2][2]; //Matriz C armazena resultado de A / B
            //Percorre as LINHAS de C: (i)
            for(int i=0;i<2;i++){
                //Percorre as COLUNAS de C: (j)
                for(int j=0;j<2;j++){ //Divide a matriz A por B
                    C[i][j] = A[i][j] / B[i][j];
                }
            }
            //EXIBE a matriz A:
        System.out.println("MATRIZ A:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(A[i][j] +"\t");
            }
            System.out.println();
        }
            //EXIBE a matriz B:
        System.out.println("MATRIZ B:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(B[i][j] +"\t");
            }
            System.out.println();
        }
            //EXIBE a matriz C:
        System.out.println("MATRIZ C:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(C[i][j]+"\t");
            }
            System.out.println();
        }
    }
}