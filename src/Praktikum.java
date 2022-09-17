import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("День программиста 12.09." + year + ".");
        } else {
            System.out.println("День программиста 13.09." + year + ".");
        }
    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}