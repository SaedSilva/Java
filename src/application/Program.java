package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de linhas da matriz: ");
        int n = sc.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz: ");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite o numero procurado na matriz: ");
        int x = sc.nextInt();

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == x) {
                    System.out.printf("Position: %d, %d%n", i, j);
                    if(j > 0) {
                        System.out.printf("Left: %d%n", mat[i][j-1]);
                    }
                    if(i > 0) {
                        System.out.printf("Up: %d%n", mat[i-1][j]);
                    }
                    if(j < mat[i].length - 1) {
                        System.out.printf("Right: %d%n", mat[i][j+1]);
                    }
                    if(i < mat.length - 1) {
                        System.out.printf("Down: %d%n", mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
