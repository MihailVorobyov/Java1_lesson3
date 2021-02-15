//1. �������� ���������, ������� ���������� ��������� ����� �� 0 �� 9 � ������������ ������ 3 ������� ������� ��� �����. ��� ������ ������� ��������� ������ ��������, ������ �� ��������� ������������� �����, ��� ����������, ��� ������. ����� ������ ��� ��������� ��������� ������ � ���������� ���� ��� ���? 1 � �� / 0 � ���(1 � ���������, 0 � ���).

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

                 while (true) {
                     System.out.println("��������� ����� �� 0 �� 9");
                     try{
                        userAnswer = scanner.nextInt();
                        break;
                     } catch (Exception ex) {
                        System.out.println("�� ����� ������������ ��������!" );
                        scanner.close();
//                        continue;
                     }
                }

                if (userAnswer == num) {
                    message = "������!";
                    break;
                } else if (userAnswer > num) {
                    System.out.println("������� �����!");
                } else if (userAnswer < num) {
                    System.out.println("������� ����!");
                }
                if (i == 2) {
                    message = "��������!";
                }
            }
        } while (continueGame(message));
    }

    static boolean continueGame (String mes) {
        int yesOrNo = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println(mes);

        while (true) {
            System.out.println("��������� ���� ��� ���? 1 � �� / 0 � ���");
            try {
                yesOrNo = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("������������ �����!");
                continue;
            }
            if (yesOrNo == 0) {
                sc.close();
                return false;
            } else if (yesOrNo == 1) {
                return true;
            } else {
                System.out.println("������������ �����!");
            }
        }
    }
}

