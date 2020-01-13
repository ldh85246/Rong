class Movie {
	private String title;
	private String director;
	private String actors;
	private String releaseDate;
	private String madeByCountry;
	private double rate;
	private int runningTime;

	public void info() {
		System.out.println("영화제목 : " + title);
		System.out.println("영화감독 : " + director);
		System.out.println("주연배우 : " + actors);
		System.out.println("개봉날짜 : " + releaseDate);
		System.out.println("제작국가 : " + madeByCountry);
		System.out.println("영화평점 : " + rate);
		System.out.println("상영시간 : " + runningTime + "분");
	}

	public Movie() { // 기본생성자 생성 습관 필수! 없을 시 추후 오류 날 수 있음
		
	}

	public Movie(String title, String director, String actors, String releaseDate,
					String madeByCountry, double rate, int runningTime) {
		this.title = title;
		this.director = director;
		this.actors = actors;
		this.releaseDate = releaseDate;
		this.madeByCountry = madeByCountry;
		this.rate = rate;
		this.runningTime = runningTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getMadeByCountry() {
		return madeByCountry;
	}

	public void setMadeByCountry (String madeByCountry) {
		this.madeByCountry = madeByCountry;
	}

	public double getRate() {
		return rate;
	}

	public void setRate (double rate) {
		this.rate = rate;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime (int runningTime) {
		this.runningTime = runningTime;
	}
}

class MovieTest {
	public static void main(String[] args) {
		Movie m = new Movie("La La Land", "Damien Chazelle", "Ryan Gosling, Emma Stone",
							"2016년 12월 07일", "미국", 8.34, 127);
		m.info();
	}
}
