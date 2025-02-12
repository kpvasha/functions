import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = getValidString(scanner);

        System.out.println("оберіть:");
        System.out.println("1 - перевернути строку");
        System.out.println("2 - перевернути слова окремо");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("перевернута строка: " + reverseString(userInput));
        } else if (choice == 2) {
            System.out.println("перевернуті слова: " + reverseEachWord(userInput));
        } else {
            System.out.println("невірний вибір");
        }
    }

    public static String getValidString(Scanner scanner) {
        while (true) {
            System.out.println("введіть строку:");
            String input = scanner.nextLine();

            String[] words = input.trim().split("\\s+");
            if (words.length >= 2) {
                boolean valid = true;
                for (String word : words) {
                    if (word.length() < 3) {
                        valid = false;
                        break;
                    }
                }
                if (valid) return input;
            }
            System.out.println("невірний ввід");
        }
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }
}
