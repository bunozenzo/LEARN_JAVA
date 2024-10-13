import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        //Bài 2: Viết chương trình nhận vào 2 số và in ra tổng, hiệu, tích, và thương của chúng.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int numberOne = s.nextInt();
        System.out.println("Enter a number 2:");
        int numberTwo = s.nextInt();
        int sum = numberOne + numberTwo;
        int dif = numberOne - numberTwo;
        int multi = numberOne * numberTwo;
        float division = (float) numberOne / numberTwo;

        // System.out.printf("%5s %5s %5s %10.2f\\n", sum, dif, multi, division);
//         %-10s: In chuỗi với chiều rộng tối đa là 10 ký tự, căn trái.
//         %5d: In số nguyên với chiều rộng tối thiểu là 5 ký tự.
//         %10.2f: In số thực với chiều rộng tối thiểu là 10 ký tự, với 2 chữ số thập phân.
        String formattedOutput = String.format("%5s %5s %5s %10.2f", sum, dif, multi, division);
        System.out.println(formattedOutput);
    }
}
