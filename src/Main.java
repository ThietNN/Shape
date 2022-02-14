public class Main {
    public static void main(String[] args) {
        // Shape test
        Shape test1 = new Shape();
        System.out.println(test1);
        test1 = new Shape("red", false);
        System.out.println(test1);

        // Circle test
        Circle test2 = new Circle();
        System.out.println(test2);
        test2 = new Circle(3.5);
        System.out.println(test2);
        test2 = new Circle(3.5, "indigo", false);
        System.out.println(test2);

        // Rectangle test
        Rectangle Test3 = new Rectangle();
        System.out.println(Test3);
        Test3 = new Rectangle(2.3, 5.8);
        System.out.println(Test3);
        Test3 = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(Test3);

        // Square test
        Square Test4 = new Square();
        System.out.println(Test4);
        Test4 = new Square(2.3);
        System.out.println(Test4);
        Test4 = new Square(5.8, "yellow", true);
        System.out.println(Test4);
    }
}
        
