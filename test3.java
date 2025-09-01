class test3 { //objects
    String name;
    void call() {
        System.out.println("take a call from " + name);
    }
    void Studentname(String Stuname) {
        System.out.println("Student name is " + Stuname);
    }
        
    public static void main(String[] args) {
        test3 phone1 = new test3();
        test3 phone2 = new test3();
        test3 phone3 = new test3();

        test3 student = new test3();

        phone1.name = "Samsung";
        phone2.name = "Pixel";
        phone3.name = "iPhone";
        phone1.call();
        phone2.call();
        phone3.call();
        
        student.Studentname("Anjana");

    }
        
}
