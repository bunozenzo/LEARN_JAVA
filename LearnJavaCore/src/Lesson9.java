import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        //Bài 9: Viết chương trình nhập một mảng số nguyên và in ra các số chẵn trong mảng.
        Scanner s = new Scanner(System.in);
        System.out.print("Nhâp so luong mang: ");
        int sl = s.nextInt();
        int[] a = new int[sl];
        for (int i = 0; i < sl; i++) {
            System.out.print("Moi ban nhap phan tu thu " + i + ": ");
            a[i] = s.nextInt();
        }
        System.out.println("In thong tin mang:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i + " ");
        }
    }
}
