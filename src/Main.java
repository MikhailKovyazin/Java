import java.util.Scanner;

public class Main {
    private static String firstString = "";
    private static String secondString = "";

    public static void main(String args[]) {
        getStrings();
        System.out.println(checkStrings());
    }

    private static void getStrings() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        while (true) {
            if (sc.hasNextLine()) {
                firstString = sc.nextLine();
                break;

            } else {
                System.out.println("Введено недопустимое значение! Повторите ввод.");
            }
        }

        System.out.println("Введите вторую строку:");
        while(true) {
            if (sc.hasNextLine()) {
                secondString = sc.nextLine();
                break;
            }else{
                System.out.println("Введено недопустимое значение! Повторите ввод.");
            }
        }
    }

    private static boolean checkStrings() {
        return firstString.endsWith(secondString);
    }
}
