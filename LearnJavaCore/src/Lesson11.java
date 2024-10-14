import java.util.Arrays;
import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
        //Bài 11: Viết chương trình đảo ngược một mảng số nguyên.
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập số lượng: ");
        int quantity = s.nextInt();
        int[] lstNumber = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            lstNumber[i] = s.nextInt();
        }
        reverseArray(lstNumber);
        System.out.println("Mang moi: " + Arrays.toString(lstNumber));
    }
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Đổi cho phan tu
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            // Tăng gia tr
            start ++;
            end --;
        }
    }
}
