package Project;

public class Calculation {
    public static int calculation(int num1, int num2, String operator) throws NewException {
        switch (operator) {
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "*" -> {
                return num1 * num2;
            }
            case "/" -> {
                return num1 / num2;
            }
            default -> throw new NewException("Вы ввели неправильное число");
        }
    }
}

