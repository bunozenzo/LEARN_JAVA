public class Lesson8 {
    public static final int Key = 100;

    public static void main(String[] args) {
        //Bài 8: Viết chương trình in ra các số từ 1 đến 100, nhưng thay vì in số chia hết cho 3 thì in "Fizz", chia hết cho 5 thì in "Buzz", chia hết cho cả 3 và 5 thì in "FizzBuzz".
        for (int i = 0; i < Key; i++) {
            boolean div3 = checkDiv(i,3);
            boolean div5 = checkDiv(i,5);
            if (div3 && div5) {
                System.out.println(i + " FizzBuzz");
            } else if(div3) {
                System.out.println(i + " Fizz");
            } else if (div5) {
                System.out.println(i + " Buzz");
            }
        }
    }

    public static boolean checkDiv(int number, int key) {
        return number % key == 0;
    }
}
