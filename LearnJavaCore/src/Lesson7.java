import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        //Bài 7: Viết chương trình tính giai thừa của một số nguyên dương nhập từ bàn phím.
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap thong tin");
        int n = s.nextInt();
        System.out.println("Gia thua: " + factorial(n));
        // Đóng Scanner
        s.close();
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }
}
