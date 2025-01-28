/*Exercise:
Simulate a simple multithreaded task executor:
Create a fixed-thread pool of size 5 using Executors.newFixedThreadPool(5).
Submit 10 tasks (e.g., printing numbers from 1 to 10) and observe how tasks are distributed among threads.
Use VisualVM to monitor the thread usage and performance.
*/

package Day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorsVisualVM {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskNumber + " is running on thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executorService.shutdown();
    }
}

