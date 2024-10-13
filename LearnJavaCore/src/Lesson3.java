import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        //Bài 3: Viết chương trình kiểm tra xem một số là số chẵn hay số lẻ.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = s.nextInt();
        System.out.println("Số này là số " + IsEven(number));
        // Đóng Scanner
        s.close();
    }

    public static String IsEven(int number) {
        int a = number % 2;
        return a == 0 ? "Chẵn" : "Lẻ";
    }
}
