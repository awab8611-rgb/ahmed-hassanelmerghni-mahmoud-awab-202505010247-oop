public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ali", "P100");
        Person p2 = new Student("Khaled", "S200");
        Person p3 = new Lecturer("Dr Ahmad", "L300");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
