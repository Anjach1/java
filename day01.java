import java.util.Scanner;
public class day01{
    public static void main(String args[]) {
        System.out.println("Hello world");
        //object
        Scanner x= new Scanner(System.in);

        String name = x.nextLine();
        System.out.println("your name is:"+ name);

        int age = x.nextInt();
        System.out.println("your age is:" + age);
    }
}