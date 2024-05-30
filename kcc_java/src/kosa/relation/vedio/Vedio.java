package kosa.relation.vedio;

public class Vedio {
	private int vedioNum;
	private String title;
	private String actor;

	public Vedio() {
		
	}

	public Vedio(int vedioNum, String title, String actor) {
		this.vedioNum = vedioNum;
		this.title = title;
		this.actor = actor;
	}

	public int getVedioNum() {
		return vedioNum;
	}

	public String getTitle() {
		return title;
	}
	public String getActor() {
		return actor;
	}

	
}
