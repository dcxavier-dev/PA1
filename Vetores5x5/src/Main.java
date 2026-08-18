public class Main {
    public static void main(String[] args) {
        int[][] A = { //Array 5x5 A (valores pares crescentes)
                {2, 4, 6, 8, 10},
                {12, 14, 16, 18, 20},
                {22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40},
                {42, 44, 46, 48, 50}
        };
        int[][] B = {   //Array 5x5 B (valores impares crescentes)
                {1, 3, 5, 7, 9},
                {11, 13, 15, 17, 19},
                {21, 23, 25, 27, 29},
                {31, 33, 35, 37, 39},
                {41, 43, 45, 47, 49}
        };

        //Exibe o array A:
        System.out.println("Array A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        //Exibe o array B:
        System.out.println("Array B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        //Calcula a soma de A e B:
        int[][] SOMA = new int[5][5]; //Array que representa a soma
        //Percorre as linhas (i)
        for (int i = 0; i < 5; i++) {
            //Percorre as colunas (j)
            for (int j = 0; j < 5; j++) {
                //Faz as somas dos elementos e armazena em SOMA:
                SOMA[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("========================");
        System.out.println("          SOMA        ");
        System.out.println();
        //Exibe a soma (Soma dos arrays A e B em um unico array)
        System.out.println("Array SOMA:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(SOMA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        //Faz a subtração de A e B
        int[][] SUBT = new int[5][5]; //Array que guarda a subtração
        //Percorre as linhas (i)
        for (int i = 0; i < 5; i++) {
            //Percorre as colunas (j)
            for (int j = 0; j < 5; j++) {
                //Faz as subtrações dos elementos e armazena em SUBT:
                SUBT[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("========================");
        System.out.println("        SUBTRAÇÃO       ");
        System.out.println();
        //Exibe a subtração (Subtração A - B)
        System.out.println("Array SUBT:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(SUBT[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        //Por último a divisão:
        int[][] DIV = new int[5][5]; //Array da divisão
        //Percorre as linhas (i)
        for (int i = 0; i < 5; i++) {
            //Percorre as colunas (j)
            for (int j = 0; j < 5; j++) {
                //Divide os elementos de A e B dentro de DIV:
                DIV[i][j] = A[i][j] / B[i][j];
            }
        }
        System.out.println("========================");
        System.out.println("         DIVISÃO        ");
        System.out.println();
        //Exibe a divisão (A / B)
        System.out.println("Array DIV:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(DIV[i][j] + "\t");
            }
            System.out.println();
        }
        //Divisão fica sem os decimais
        //OBS tentei fazer a multiplicação vendo tutorial de matematica do curió mas não consegui
    }
}
