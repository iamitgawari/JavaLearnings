import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //To take number from User
        System.out.println("Please Enter Number which you want to reverse below: \n");
        int num = sc.nextInt();
        // int num=20000;
        int rev = 0;
        int reminder;

        while (num != 0) {
            reminder = num % 10;
            rev = rev * 10 + reminder;
            num = num / 10;

        }
        System.out.println("Reverse number is: " + rev);

        int num2= 123456;
        StringBuffer sb = new StringBuffer(String.valueOf(num2));
        sb.reverse();
        System.out.println("Using String Buffer: " + sb);
    }

}
