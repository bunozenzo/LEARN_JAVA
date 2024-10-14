import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        // Bài 10: Viết chương trình tìm số lớn nhất và nhỏ nhất trong một mảng.
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập số lượng: ");
        int quantity = s.nextInt();
        int[] lstNumber = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            lstNumber[i] = s.nextInt();
        }
        int maxNumber = 0;
        int minNumber = lstNumber[0];
        for (int i = 0; i < lstNumber.length; i++) {
            if (lstNumber[i] > maxNumber) {
                maxNumber = lstNumber[i];
            }
            if (lstNumber[i] < minNumber) {
                minNumber = lstNumber[i];
            }
        }
        System.out.println("Max : " + maxNumber);
        System.out.println("Min : " + minNumber);

        s.close();
    }
}
