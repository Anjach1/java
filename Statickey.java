class Statickey
 {
   String name1;   //this is an instance variable
   static String name2;  //this is an static variable

   void meth1() //this is an instance method
   {
      System.out.println("take a call from " + name1);
   }
   static void meth2() //this is an static method
   {
      System.out.println("take a call from " + name2);
   }

   public static void main(String[] args) 
   {
      name1 = "Samsung"; //cannot access non-static variable in static context.error
      name2 = "Pixel"; //static variable can be accessed in static context.non error
      meth1(); //cannot access non-static method in static context.error
      meth2(); //static method can be accessed in static context.non error

      //to accesss non-static variable and method, we need to create an object of the class
      Statickey obj = new Statickey();
      obj.name1 = "Samsung"; //now we can access non-static variable

      obj.meth1(); //now we can access non-static method
 }
}