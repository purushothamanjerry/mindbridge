/*Exercise:
Write a program to calculate the factorial of a number using Callable and Future.
Create a FactorialTask class that implements Callable<Long>.
Use an ExecutorService to submit the task.
Retrieve the result using the Future.get() method.
*/

package Day19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialUsingCallable {
    public static void main(String[] args) {
        int number = 5;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialTask task = new FactorialTask(number);
        Future<Long> future = executorService.submit(task);

        try {
            long result = future.get();
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }finally {
            executorService.shutdown();
        }
    }
    static class FactorialTask implements Callable<Long> {
        private final int number;

        public FactorialTask(int number) {
            this.number = number;
        }

        @Override
        public Long call(){
            return calculateFactorial(number);
        }
        private Long calculateFactorial(int num) {
            if (num == 0 || num == 1) {
                return 1L;
            }
            long factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}

