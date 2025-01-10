package Day11;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ConCurrentMap {

	public static void main(String[] args) {
		
		
		ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();
		ExecutorService exe = Executors.newFixedThreadPool(4);
		
		
	exe.execute(() -> addVote(votes, "Alice"));
        exe.execute(() -> addVote(votes, "Bob"));
        exe.execute(() -> addVote(votes, "Alice"));
        exe.execute(() -> addCandidateAndVote(votes, "Charlie"));

        exe.shutdown();
        try {
        	  exe.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Vote Counts:");
        votes.forEach((candidate, count) -> System.out.println(candidate + ": " + count));
    }

    public static void addVote(ConcurrentMap<String, Integer> votes, String candidate) {
        votes.compute(candidate, (key, currentCount) -> (currentCount == null) ? 1 : currentCount + 1);
    }
    public static void addCandidateAndVote(ConcurrentMap<String, Integer> votes, String candidate) {
        votes.putIfAbsent(candidate, 0);
        addVote(votes, candidate);      
    }
}	
	


