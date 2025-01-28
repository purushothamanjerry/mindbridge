package Day19;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long>{
	
	public static final long THRESHOLD=10_000;
	private final long[]numbers;
	private final int start;
	private final int end;
	
	public SumTask(long numbers[],int start,int end) {
		this.numbers=numbers;
		this.start=start;
		this.end=end;
	}
	
	@Override
	protected Long compute() {
		
		int length=end-start;
		
		if(length<=THRESHOLD) {
			return computeseq();
		}
		SumTask leftTask=new SumTask(numbers,start,start+length/2);
		leftTask.fork();
		SumTask rightTask=new SumTask(numbers,start+length/2,end);
		Long rightresult=rightTask.compute();
		Long leftresult=leftTask.join();
		return leftresult+rightresult;
		
	}
	private long computeseq() {
		long sum=0;
		for(int i=start;i<end;i++) {
			sum+=numbers[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
	    long[] numbers = new long[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; 
        }

        ForkJoinPool pool = new ForkJoinPool();

        SumTask task = new SumTask(numbers, 0, numbers.length);
        long result = pool.invoke(task);

        System.out.println("The sum is: " + result);
    }
		
		
	}


