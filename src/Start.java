import java.util.Scanner;

public class Start {



    public static void main(String[] args) {

        System.out.println("Введите данные в формате: число операция число (через пробелы)");
        Scanner scanner = new Scanner(System.in);
        String[] read = scanner.nextLine().split(" ");

            if (read.length > 3) {
                System.out.println("Калькулятор принимает только 2 числа и 1 оператор!");
                System.exit(0);
            }

        try {
                Calc.calc(read[0], read[1], read[2]);
        } catch (Exception e) {
            System.out.println("Неверный формат данных.");
        }
        System.exit(0);


    }
}
