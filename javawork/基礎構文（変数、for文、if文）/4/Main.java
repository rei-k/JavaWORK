import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                 .filter(n -> n % 2 == 0)
                 .forEach(n -> System.out.print(n + " "));
    }
}
