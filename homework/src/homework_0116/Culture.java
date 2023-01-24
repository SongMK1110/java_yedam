package homework_0116;

public abstract class Culture {
	public String title;
	public int directorNum;
	public int actorNum;
	public int audience;
	public int totalScore;
	
	public Culture(String title, int directorNum, int actorNum) {
		this.title = title;
		this.directorNum = directorNum;
		this.actorNum = actorNum;
	}
	
	public void setTotalScore(int score) {
		this.totalScore += score;
		this.audience += 1;
	}
	
	public String getGrade() {
		String star = "*";
		return star;
	}
	
	public abstract void getInformation();
}
