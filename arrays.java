public class arrays {
    public static void main(String args[]) {
      //arrays
        int []numbers = {2,4,6,8,10};
        String []names = {"john", "doe", "jane", "smith"};
        names[0] = "Alice";
        System.out.println(names[0]);

        //defining an array with size
         int[] numbers2 = new int[5];
         numbers2[0] = 1;
         numbers2[1] = 2;
         numbers2[2] = 3;
         numbers2[3] = 4;
         
         System.out.println(numbers2[4]); // This will print 0 since it is not initialized

         //2 dimensional array
            int[][] x = {{1,2,3},{2,4,6},{5,10,15}};
            System.out.println(x[2][0]); // This will print 5

    }
}
