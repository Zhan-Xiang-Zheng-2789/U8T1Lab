import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {   //1a
        System.out.println("1a");
        String[][] seatingChart = {
                {"Abby", "Don", "George", "Kim"},
                {"Brain", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"}
        };



        printStringMatrix(seatingChart);

        //1b
        System.out.println("\n1b");
        seatingChart[1][2] = "Paul";

        printStringMatrix(seatingChart);

        //1c
        System.out.println("\n1c");
        String tempStudent = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = tempStudent;

        printStringMatrix(seatingChart);

        //1d
        System.out.println("\n1d");
        String[] tempRow = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempRow;

        printStringMatrix(seatingChart);

        //2a
        System.out.println("\n2a");
        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        printIntMatrix(arr1);
        System.out.println("");
        printIntMatrix(arr2);

        //2b
        System.out.println("\n2b");

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        printIntMatrix(arr1);

        //2c
        System.out.println("\n2c");
        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;

        printIntMatrix(arr2);

        //2D Array Methods
        System.out.println("\nTest code for totalElements");
        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(testArr1));
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(FunWith2DArrays.totalElements(testArr2));
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.totalElements(testArr3));
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.totalElements(testArr4));
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(FunWith2DArrays.totalElements(testArr5));
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(FunWith2DArrays.totalElements(testArr6));
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.totalElements(testArr7));
        int[][] testArr8 = {{4}};
        System.out.println(FunWith2DArrays.totalElements(testArr8));
        int[][] testArr9 = {{}};
        System.out.println(FunWith2DArrays.totalElements(testArr9));

        System.out.println("\nTest code for fourCorners");
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        FunWith2DArrays.fourCorners(words);
        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        FunWith2DArrays.fourCorners(words2);
        String[][] words3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(words3);
        String[][] words4 = {{"cat"}, {"dog"}, {"hamster"}, {"bird"}};
        FunWith2DArrays.fourCorners(words4);
        String[][] words5 = {{"time"}};
        FunWith2DArrays.fourCorners(words5);


    }
    public static void printStringMatrix(String[][] stringMatrix)
    {
        for(String[] row : stringMatrix)
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printIntMatrix(int[][] intMatrix)
    {
        for(int[] row : intMatrix)
        {
            System.out.println(Arrays.toString(row));
        }
    }

   

}
