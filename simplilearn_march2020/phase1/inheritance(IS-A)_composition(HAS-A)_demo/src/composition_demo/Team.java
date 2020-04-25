package composition_demo;

public class Team {

	private int tid;
	private String teamName;
	private String coachName;
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public Team(int tid, String teamName, String coachName) {
		super();
		this.tid = tid;
		this.teamName = teamName;
		this.coachName = coachName;
	}
	public void printTeam() {
		System.out.println("Team Details");
		System.out.println("Team Id : "+tid);
		System.out.println("Team Name : "+teamName);
		System.out.println("Coach Name : "+coachName);
	}
}
