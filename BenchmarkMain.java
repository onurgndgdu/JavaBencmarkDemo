public class BenchmarkMain {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        for (int i = 0; i < 1_000_000_000; i++) {
            compute();
        }

        long endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
    public static int compute() {
        return (int) Math.pow(2, 10);
    }
}
