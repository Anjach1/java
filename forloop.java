public class forloop 
{
    public static void main(String args[])
    {
        //for loop
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("hello " + i);
        }

        // array for loop
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        for(int i = 0; i < names.length; i++)
        {
            System.out.println("Student name:" + names[i]);
        }
    }  
}