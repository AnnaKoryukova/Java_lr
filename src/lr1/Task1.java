package lr1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String first_name = in.nextLine();

        System.out.println("Введите фамилию: ");
        String last_name = in.nextLine();

        System.out.println("Введите отчество: ");
        String father_name = in.nextLine();

        System.out.printf("%s %s %s %s", "Hello,", last_name, first_name, father_name);
        in.close();
    }
}

