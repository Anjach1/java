public class brANcn {
    public static void main(String args[]) {
        //break and continue
        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
                break;
            System.out.println(i);
        }

        for (int x = 1; x <= 10;x++)
        {
            if (x == 5)
                continue;
            System.out.println(x);
        }
    }
}
