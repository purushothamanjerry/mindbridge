package Day11;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;

import java.util.concurrent.ConcurrentHashMap;


import java.util.concurrent.Executors;
public class ConMurrentMap {

	public static void main(String[] args) {
		
	
	ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();
    ExecutorService executor = Executors.newFixedThreadPool(4);
    executor.execute(() -> {
        votes.merge("Alice", 1, Integer::sum);
    });

    executor.execute(() -> {
        votes.merge("Bob", 1, Integer::sum);
    });

    executor.execute(() -> {
        votes.merge("Alice", 1, Integer::sum);
    });

    executor.execute(() -> {
        votes.merge("Charlie", 1, Integer::sum);
    });

    executor.shutdown();
    while (!executor.isTerminated()) {
    }
    System.out.println("Final Vote Counts:");
    votes.forEach((candidate, count) -> {
        System.out.println(candidate + ": " + count);
    });
}
}
	



