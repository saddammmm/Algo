package jobScheduling;

import java.util.List;

public interface JobSchedulerService {
	
		void shortestJobFirst(int threadCount, List<Job> job);

		
		void firstComeFirstServe(int threadCount, List<Job> job);

		
		void fixedPriorityScheduling(int threadCount, List<Job> job);

		
		void earliestDeadlineFirst(int threadCount, List<Job> job);

	}
