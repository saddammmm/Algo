package jobScheduling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobSchedulerServiceImpl implements JobSchedulerService{

	
	
	private Map<Integer, List<String>> assignThreadsToJobs(int threadNo, List<Job> job) {
		Map<Integer, List<String>> threads = new HashMap();
		List<String> jobNames;
		int thread = 0;
		for (Job j : job) {
			if (!threads.containsKey(thread % threadNo)) {
				jobNames = new ArrayList<>();
				jobNames.add(j.getJobName());
				threads.put(thread % threadNo, jobNames);
			} else {
				jobNames = threads.get(thread % threadNo);
				jobNames.add(j.getJobName());

			}
			thread++;
		}
		return threads;
	}
	
	private void displayScheduledJobs(Map<Integer, List<String>> threads) {
		for (Map.Entry<Integer, List<String>> entry : threads.entrySet()) {
			System.out.print("Thread:" + entry.getKey() + " - ");
			entry.getValue().forEach(name -> {
				System.out.print(name + " ");
			});
			System.out.println();
		}

	}
	
	
	@Override
	public void shortestJobFirst(int threadNo, List<Job> job) {

		System.out.println("SJF:");
		List<Job> jobs = (List<Job>) ((ArrayList) job).clone();

		jobs.sort(new Comparator<Job>() {

			@Override
			public int compare(Job j1, Job j2) {
				
				
				if(j1.getDuration()==j2.getDuration()){
					return j1.getPriority()-j2.getPriority();
				}
				return (int) (j1.getDuration()-j2.getDuration());
				
			}
		});
		
		Map<Integer, List<String>> threads = assignThreadsToJobs(threadNo, job);

		displayScheduledJobs(threads);
	}

	@Override
	public void firstComeFirstServe(int threadNo, List<Job> job) {

		System.out.println("FCFS:");

		Map<Integer, List<String>> threads = assignThreadsToJobs(threadNo, job);

		displayScheduledJobs(threads);
	}

	@Override
	public void fixedPriorityScheduling(int threadCount, List<Job> job) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void earliestDeadlineFirst(int threadCount, List<Job> job) {
		// TODO Auto-generated method stub
		
	}

}
