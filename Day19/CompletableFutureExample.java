/*Write a program using CompletableFuture to simulate the following tasks:
Task 1: Fetch user data (simulate with a Thread.sleep()).
Task 2: Fetch user orders (simulate with a Thread.sleep()).
Combine the results of both tasks and print the user details along with the orders.
Use thenCombine() to merge the results from both tasks.
*/

package Day19;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> task = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Fetching user data...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "User: Sanji";
        });

        CompletableFuture<String> userOrdersTask = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Fetching user orders...");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Orders: [Laptop, Phone, Tablet]";
        });

        CompletableFuture<String> combinedTask = task.thenCombine(userOrdersTask, (userData, userOrders) -> {
            return userData + "\n" + userOrders;
        });

        combinedTask.thenAccept(result -> {
            System.out.println("\nCombined Result:");
            System.out.println(result);
        });

        combinedTask.join();
    }
}

