public class FunWith2DArrays {
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
}
