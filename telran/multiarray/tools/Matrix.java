package telran.multiarray.tools;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Matrix {
	public static int sum(int[][] matrix) {
		int x=matrix.length;     
        int sumEl=0;
        for (int i=0;i<x;i++){          
            for(int j=0;j<matrix[x-1].length;j++){
                sumEl+=matrix[i][j];
				System.out.println(sumEl);
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: "+sumEl);
    return sumEl;
		
	}

	public static int[][] transp(int[][] matrix) {
		int x=matrix.length;
		int y = matrix[0].length;
		int[][] mas = new int[y][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j <y; j++){
				mas[j][i] = matrix[i][j];	
			}
		}
		return mas;
	}
	
	public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
		int[][] result = new int[matrix1.length][matrix2[0].length];

    for (int row = 0; row < result.length; row++) {
        for (int col = 0; col < result[row].length; col++) {
            result[row][col] = resInCell(matrix1, matrix2, row, col);
        }
    }

    return result;
	}

	static int resInCell(int[][] matrix1, int[][] matrix2, int row, int col) {
		int cell = 0;
		for (int i = 0; i < matrix2.length; i++) {
			cell += matrix1[row][i] * matrix2[i][col];
		}
		return cell;
	}
}
