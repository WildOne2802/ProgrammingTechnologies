package FirstLab.Fifth;

public class MyArrays {
    public static void main(String[] args) {
        int[] mas = {12, 43, 12, -65, 778, 123, 32, 76};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++) {
            if (min > mas[i])
                min = mas[i];
        }

        System.out.println(min);

        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                matrix[i][j] = (int) Math.round(Math.random() * 10);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        int tmp;
        int a = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = a; j < 3; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
            a++;
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
