//1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        go();
    }

    static void go() {

        int num;
        int userAnswer;
        String message = null;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            num = random.nextInt(9);
            for (int i = 0; i < 3; i++) {

                System.out.println("Отгадайте число от 0 до 9");
                userAnswer = scanner.nextInt();

                if (userAnswer == num) {
                    message = "Победа!";
                    break;
                } else if (userAnswer > num) {
                    System.out.println("Слишком много!");
                } else if (userAnswer < num) {
                    System.out.println("Слишком мало!");
                }
                if (i == 2) {
                    message = "Проигрыш!";
                }
            }
        } while (continueGame(message));
    }

    static boolean continueGame (String mes) {
        int yesOrNo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(mes);

        while (true) {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

            yesOrNo = sc.nextInt();

            if (yesOrNo == 0) {
                sc.close();
                return false;
            } else if (yesOrNo == 1) {
                return true;
            } else {
                System.out.println("Недопустимый ответ!");
            }
        }
    }
}

