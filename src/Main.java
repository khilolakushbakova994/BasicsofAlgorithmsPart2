import service.IntegerListImpl;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IntegerListImpl list = new IntegerListImpl(100000);

        System.out.println(System.currentTimeMillis() - start);
    }
}