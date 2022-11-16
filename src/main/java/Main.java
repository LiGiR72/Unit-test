public class Main {
    public static void main(String[] args) {
        MagicBox<String> box = new MagicBox<>(5);
        MagicBox<Integer> box2 = new MagicBox<>(3);
        System.out.println( box.add("first"));
        System.out.println( box.add("second"));
        System.out.println( box.add("third"));
        System.out.println( box.add("forth"));
        System.out.println( box.add("fifth"));
        System.out.println( box2.add(1));
        System.out.println( box2.add(2));
        System.out.println( box2.add(3));
        System.out.println( box.pick());
        System.out.println( box2.pick());
    }
}