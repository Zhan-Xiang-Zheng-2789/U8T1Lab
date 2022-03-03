import java.util.Arrays;
public class FunWith2DArrays {
    public static void main(String[] args) {
        // TEST CODE FOR average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(average(testArr5));

        // TEST CODE FOR indexFound
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(indexFound(words, "stuff")));
        System.out.println(Arrays.toString(indexFound(words, "good")));
        System.out.println(Arrays.toString(indexFound(words, "map")));
        System.out.println(Arrays.toString(indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(indexFound(words2, "time")));
        System.out.println(Arrays.toString(indexFound(words2, "joy")));
        System.out.println(Arrays.toString(indexFound(words2, "bam")));
        System.out.println(Arrays.toString(indexFound(words2, "cat")));

    }
    public static int totalElements(int[][] intMatrix)
    {
        int count = 0;
        for(int[] row : intMatrix)
        {
            for(int ele : row)
            {
                count++;
            }
        }
        return count;
    }

    public static void fourCorners(String[][] stringMatrix)
    {
        System.out.println(stringMatrix[0][0]);
        System.out.println(stringMatrix[0][stringMatrix[0].length-1]);
        System.out.println(stringMatrix[stringMatrix.length-1][0]);
        System.out.println(stringMatrix[stringMatrix.length-1][stringMatrix[stringMatrix.length-1].length-1]);
    }

    public static double average(int[][] intMatrix)
    {
        double total = 0;
        int count = 0;
        for(int[] row : intMatrix)
        {
            for(int num : row)
            {
                total+= num;
                count++;
            }
        }
        return total/count;
    }

    public static int[] indexFound(String[][] stringMatrix, String target)
    {
        int[] returnArry = {-1,-1};
        for(int row = 0; row < stringMatrix.length; row++)
        {
            for(int col = 0; col < stringMatrix[row].length; col++)
            {
                if(stringMatrix[row][col].equals(target)) {
                    returnArry[0] = row;
                    returnArry[1] = col;
                    return returnArry;
                }
            }
        }
        return returnArry;
    }
}
