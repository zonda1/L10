import java.util.Scanner;

public class Main {
    static void main() {
        PasswordChecker pc = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите мин. длину пароля: ");
            pc.setMinLength(Integer.parseInt(scanner.nextLine()));
            System.out.println("Введите макс. допустимое количество повторений символа подряд: ");
            pc.setMaxRepeatSymbol(Integer.parseInt(scanner.nextLine()));
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        try {
            while (true) {
                System.out.println("Введите пароль или end: ");
                String input = scanner.nextLine();
                if (input.equals("end")) break;
                boolean result = pc.verify(input);
                if (result) {
                    System.out.println("Подходит!");
                } else {
                    System.out.println("Не подходит!");
                }
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Программа завершена");
    }
}
