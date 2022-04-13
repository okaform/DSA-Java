import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {


        int[][] int2DArray = new int[2][2];
        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.toString(int2DArray));//you need the deep To String method to print multi-dimensional array.
        System.out.println(Arrays.deepToString(int2DArray));

        String s2DArray[] [] = {{"a","b"}
                               ,{"c","d"}};
        System.out.println(Arrays.deepToString(s2DArray));

    }
}
