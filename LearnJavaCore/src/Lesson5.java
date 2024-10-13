import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        // Bài 5: Viết chương trình kiểm tra xem một số có phải là số nguyên tố hay không.
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so:");
        int number = s.nextInt();
        if (IsPrime(number)) {
            System.out.println(number + " Là so nuyên tố");
        } else {
            System.out.println(number + " Không là số nguyên tố");
        }
    }

    public static boolean IsPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
