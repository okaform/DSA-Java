import java.util.Arrays; //rotate matrix by 90 degrees to the right

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}
                         ,{4,5,6}
                         ,{7,8,9}};

        int [][] newMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i <matrix.length; i++) {//rows
            for (int j = 0; j < matrix[i].length; j++) {//columns
                newMatrix[i][j] = matrix[(matrix[j].length-1) - j][i];
                //System.out.println((matrix[j].length-1) - j);
            }
        }

        for (int i = 0; i <matrix.length; i++) {//rows
            for (int j = 0; j < matrix[i].length; j++) {//columns
                matrix[i][j] = newMatrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
