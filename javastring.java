public class javastring {
    public static void main(String args[]) 
    {
         // String s1 = "Hello";
       String s1 = "Hello" ;
       String s2 = "Hello";

    if (s1==s2)
        System.out.println("yes");
    else
        System.out.println("no");

         // String s2 = new String ("Hello");
       String s3 = new String ("world");
       String s4 = new String ("world");

       if (s3==s4)
           System.out.println("yes");
       else
           System.out.println("no");


         //character array
         char[] c1 = {'H', 'e', 'l', 'l', 'o'}; 
         String Str1 = new String(c1);
         System.out.println(Str1); 
    }
}