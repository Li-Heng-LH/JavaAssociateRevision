package mainApp;

public class FindSmallestCommonElement {

    public static void run () {
        int [][] matrix = {{1, 2, 3 }, {3, 9 ,10}, {3, 12, 13}};
        System.out.println(getSmallestCommonElement(matrix));
    }

    private static int getSmallestCommonElement(int [][] matrix) {
        for (int i = 0; i < matrix[0].length; i++ ) {  //size of column (n)

            int candidate = matrix[0][i];
            boolean [] foundInRow = new boolean[matrix.length - 1];

            for (int j = 1; j < matrix.length; j++) { //size of rows - 1 (n)

                for (int z = 0; z < matrix[j].length; z++) { //size of column (n) //binary search O(log n)
                    if (candidate == matrix[j][z]) {
                        foundInRow [j - 1] = true;
                        break;
                    }
                }
            }

            boolean allTrue = false;
            for (int x = 0; x < foundInRow.length; x++) { //n
                if (foundInRow[x] == false) {
                    allTrue = false;
                    break;
                }
                allTrue = true;
            }
            if (allTrue == true) {
                return candidate;
            }
        }

        return -1;
    }
}
