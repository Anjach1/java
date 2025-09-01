public class javastring2 
{
    public static void main(String args[]) 
    {
        String s1 = "hello";
        String s2 = "world";

        //length method
        System.out.println(s1.length()+s2.length());

        //toUpperCase method
        System.out.println((s1+s2).toUpperCase());

        //toLowerCase method
        System.out.println((s1+s2).toLowerCase());

        //concat method
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(" ").concat(s2));

        //isEmpty method
        System.out.println(s1.isEmpty());

        //replace method
        System.out.println(s2.replace("world","universe"));

        //contains method
        System.out.println(s1.contains("o"));

    }
}
