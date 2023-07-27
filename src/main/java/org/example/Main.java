package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix= {{3, 5, 7}, {9, 11, 13}, {15, 17, 19}};

        int[][] transpoz = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpoz[j][i] = matrix[i][j];
            }
        }

        System.out.println(Arrays.deepToString(transpoz));
    }
}