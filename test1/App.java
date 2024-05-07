// class Name1{
//     public static void main(String[] args) {
//         System.out.println("Hello ClassAAA");
//     }
// }

// class Name2{
//     public static void main(String[] args) {
//         System.out.println("Hello Class");
//         // Name1 eee = new Name1();
//     }
// }

class Test1 {
    // 類別的屬性 Class Attribute/Static Attribute
    static int a = 10;
    static String s = "Hello Class";
}

class Test2 {
    static double a = 3.14;
    public static void main(String[] args) {
        System.out.println(Test1.a); // 10
        System.out.println(Test2.a); // 3.14
        System.out.println(Test1.s); // Hello Class
        Test1.a++;
        System.out.println(Test1.a);
    }
}