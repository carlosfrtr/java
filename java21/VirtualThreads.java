import java.util.concurrent.Executors;

public class VirtualThreads {
    public static void main(String[] args) {
        
        // Thread API Java 21

        Thread.startVirtualThread(
            () -> System.out.println("Virtual Thread w/ Thread API"));

        // Executors API Java 21

        var executor = Executors.newVirtualThreadPerTaskExecutor();
        executor.submit(() -> System.out.println("Virtual Thread w/ Executors API"));

    }
}