package Project;

public class Calculation {
    public int calc(int num1, int num2, String oper) {

        switch (oper) {
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "/" -> {
                return num1 / num2;
            }
            case "*" -> {
                return num1 * num2;
            }
        }
        return 0;
    }
}

