import java.util.Scanner;
public class test {
    public static void main(String args[]) {
    Scanner x = new Scanner(System.in);
    int  i = 0;
    while (i < 10) {
        System.out.println("Enter a number:");
        int num = x.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        
        i++;

    }
 }
}

