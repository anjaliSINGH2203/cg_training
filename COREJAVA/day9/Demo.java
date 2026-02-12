class Demo {
    String name;
    int id;
    String gender;
    double marks;

    // method to print student data
    void display() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(gender);
        System.out.println(marks);
	System.out.println();
    }

    public static void main(String args[]) {

        Demo d1 = new Demo();
        d1.name = "Alaska";
        d1.id = 122183;
        d1.gender = "Female";
        d1.marks = 90.0;

        Demo d2 = new Demo();
        d2.name = "Bob";
        d2.id = 1221853;
        d2.gender = "Female";
        d2.marks = 88.0;

        Demo d3 = new Demo();
        d3.name = "Venessa";
        d3.id = 127183;
        d3.gender = "Female";
        d3.marks = 99.0;

        Demo d4 = new Demo();
        d4.name = "Raha";
        d4.id = 129183;
        d4.gender = "Female";
        d4.marks = 100.0;

        Demo d5 = new Demo();
        d5.name = "Bob";
        d5.id = 122183;
        d5.gender = "Female";
        d5.marks = 90.0;

        System.out.println("Student 1");
        d1.display();

        System.out.println("Student 2");
        d2.display();

        System.out.println("Student 3");
        d3.display();

        System.out.println("Student 4");
        d4.display();

        System.out.println("Student 5");
        d5.display();
    }
}
