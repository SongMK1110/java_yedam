package homework_0116;

public class Performance extends Culture{
	public String genre;
	
	public Performance(String title, int directorNum, int actorNum, String genre) {
		super(title, directorNum, actorNum);
		this.genre = genre;
	}


	@Override
	public void getInformation() {
		System.out.println("영화제목 : " + title);
		System.out.println("감독 : " + directorNum);
		System.out.println("배우 : " + actorNum);
		System.out.println("영화총점 : " + totalScore);
		System.out.println("영화평점 : " + getGrade());
	}


}
