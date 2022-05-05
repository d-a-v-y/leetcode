package com.davy.array;

/**
 * @author Davy
 *
 * 旋转图像
 *
 * 给定一个 n×n 的二维矩阵matrix 表示一个图像。请你将图像顺时针旋转 90 度。
 *
 * 你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
 */
public class Rotate {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] matrix_new = new int[len][len];
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++){
                matrix_new[j][len-i-1] = matrix[i][j];
            }
        }
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++){
                matrix[i][j] = matrix_new[i][j];
            }
        }
    }
}
