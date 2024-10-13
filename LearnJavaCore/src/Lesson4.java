import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        //Bài 4: Viết chương trình nhận vào một số nguyên và in ra thông báo về số đó (dương, âm, hay bằng 0).
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap vao so :");
        int n = s.nextInt();
        System.out.println("So ban vua nhap la so " + CheckNumber(n));
    }
    public static String CheckNumber(int number) {
        return number == 0 ? "Khong" : (number > 0 ? "Duong" : "Am");
    }
}
