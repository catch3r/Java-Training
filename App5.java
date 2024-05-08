import data.Person;

public class App5 {
    public static void main(String[] args) {
        // Person p1 = new Person();       
        // p1.talk(); 
        // Person p2 = new Person("釘滿", 10);

        Person p1 = new Person(10, "釘滿");
        p1.talk();
        Person p2 = new Person("蓬蓬");
        p2.talk();
        // Person p3 = new Person();
    }
}
