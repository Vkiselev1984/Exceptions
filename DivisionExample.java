public class DivisionExample {

    public static void divisionByZero() {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }

    public static void main(String[] args) {
        divisionByZero();
    }
}