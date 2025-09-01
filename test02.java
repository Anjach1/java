import java.util.Scanner;
public class test02 {
    public static void main(String args[]) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        int i = 1;
        int total = 0;
        while (i < 10)
        {
            System.out.println("Enter Subject name:");
            String subject = y.nextLine();
            System.out.println("Enter marks for" + subject + ":");
            total = total + x.nextInt();
            i++;
        }
        int average = total/(i);
        System.out.println("Total marks: " + total );
        System.out.println("Average marks: " + average);

        if (average> 60)
        {
            System.out.println("You passed the exam.");
        }
        else
        {
            System.out.println("You failed the exam.");
        }
    }
}
