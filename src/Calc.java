public class Calc {

    public static void calc(String numberFirstString, String operationString, String numberSecondString) {

        int number1 = 0;
        int number2 = 0;
        int result = 0;

        boolean roman = false;  //флаг для римских чисел
       try {
            number1 = Integer.parseInt(numberFirstString);
            number2 = Integer.parseInt(numberSecondString);
        } catch (Exception e) {
            try {
                number1 = RomanNumber.toNumber(numberFirstString);
                number2 = RomanNumber.toNumber(numberSecondString);
                roman = true;
           } catch (Exception e1) {
                System.out.println("Ошибка ввода.");
            }
        }
        if (number1 < 1 || number1 > 10 || number2 < 1 || number2 > 10) {
            System.out.println("Ошибка ввода.");
            System.exit(0);
        }

        Operation operation = new Operation(number1, number2);

        switch (operationString) {
            case "+":
                result = operation.addition();
                break;
            case "-":
                result = operation.subtraction();
                break;
            case "*":
                result = operation.multiplication();
                break;
            case "/":
                result = operation.division();
                break;
            default:
                System.out.println("Неверная операция.");


        }
        if (roman) {
            String romanNumber = RomanNumber.toRoman(result);
            System.out.println(romanNumber);
       } else {
           System.out.println(result);

        }
    }
}
