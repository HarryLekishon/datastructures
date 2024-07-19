public class Lambdas {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Printable lamdap = () -> System.out.println("Meow");
        printThing(lamdap);
    }

    static void printThing(Printable thing){
        thing.print();
    }

}
