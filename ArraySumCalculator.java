public class ArraySumCalculator {

    public static int calculateSum(int[][] array) {
        if (array.length != array[0].length) {
            throw new RuntimeException("Массив не является квадратным");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Массив содержит значение отличное от 0 или 1");
                }
                sum += array[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] squareArray = {{0, 1}, {0, 1, 0}, {1, 0, 1}};
        int sum = calculateSum(squareArray);
        System.out.println("Сумма элементов массива: " + sum);
    }
}