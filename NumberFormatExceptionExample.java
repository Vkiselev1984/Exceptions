public class NumberFormatExceptionExample {

    public static void numberFormatException() {
        String str = "abc";

        try {
            int number = Integer.parseInt(str);
            System.out.println("Число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: невозможно преобразовать строку в число");
        }
    }

    public static void main(String[] args) {
        numberFormatException();
    }
}