public class day02 {
    public static void main(String args[]) 
    {
     //if -else  
        int x = 10;
        if (x == 10)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect");
        }

        int y = 20;
        int z = 30;
        if (y >z || z>y)
        {
            System.out.println("correct" );
        }
        else
        {
            System.out.println("incorrect");
        }
    
    // switch case
        int weekday = 8;
        switch (weekday)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
               System.out.println("wednesday");
               break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                 System.out.println("saturday");
                 break;
            case 7:
                System.out.println("sunday");
                break; 
            default:
                System.out.println("invalid day");

    //  switch case on string 
            String day ="monday";
            switch (day)
            {
                case "monday":
                case "tuesday":
                case "wednesday":
                case "thursday":
                case "friday":
                    System.out.println("School day");
                    break;
                case "saturday":
                case "sunday":
                   System.out.println("weekend");   
            default:
                   System.out.println("invalid day");
            }

            

        }
        
    }
}