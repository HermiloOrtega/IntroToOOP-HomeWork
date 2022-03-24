package twodimensional;

public class TwoDimension {
    public static void main(String[] args) {
        // create a two-dimensional array (literal syntax)
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        // get the sum of first row?
        int firstRowSum = data[0][0] + data[0][1] + data[0][2];
        System.out.println(firstRowSum);

        // get the number of rows
        System.out.println(data.length);

        // create a two-dimensional array with the size
        String[][] students = new String[3][2];
        students[0][0] = "Aga";
        students[0][1] = null;
        students[1][0] = "Lucas";
        students[1][1] = "Katsuya";
        students[2][0] = null;
        students[2][1] = "Jiro";
        // Aga, null
        // Lucas, Katsuya
        // null, Jiro

        // loop over students to print their name
        for (int r = 0; r < students.length; r++) {
            for (int c = 0; c < students[r].length; c++) {
                System.out.print(students[r][c] + ", ");
            }
            System.out.println();  // newline after each row
        }

        // for-each loop : "for each row in students, for each student in row, ..."
        for (String[] row : students) {
            for (String student : row) {
                System.out.print(student + ", ");
            }
            System.out.println();
        }
    }
}
