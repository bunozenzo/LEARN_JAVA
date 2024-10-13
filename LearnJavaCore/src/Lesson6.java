import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        //Bài 6: Viết chương trình in ra bảng cửu chương từ 1 đến 10.
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so muon in: ");
        int number = s.nextInt();
        for (int i = 1; i < number; i++) {
            System.out.println(i);
        }
    }
}
