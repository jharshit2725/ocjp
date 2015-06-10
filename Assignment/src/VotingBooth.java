import java.util.HashMap;
import java.util.Map;

class Candidate{
}

public class VotingBooth {
	VoteRecorder voteRecorder = new VoteRecorder();
	public void vote(Candidate candidate) {
		voteRecorder.record(candidate);
	}
	class VoteRecorder {
		Map hVotes = new HashMap();
		public void record(Candidate candidate) {
			int count = 0;
			if (!hVotes.containsKey(candidate)){
				hVotes.put(candidate, count);
			} 
			else {
				count = (Integer) hVotes.get(candidate);
			}
			count++; //1
			hVotes.put(candidate, count);  //2
		}
	}
}
