package kosa.relation.vedio;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video video;
	
	public GeneralMember() {
		
	}
	
	
	public GeneralMember(String id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	public void rental(Video video) {
		this.video = video;
	}

	public void printMemberInfo(){
		System.out.println("회원의 아이디 :" + id);
		System.out.println("회원의 이름 :" + name);
		System.out.println("회원의 주소 :" + address);
		System.out.println("회원이 대여한 비디오 번호 :" + video.getVideoNo());
		System.out.println("회원이 대여한 비디오 제목 :" + video.getTitle());
		System.out.println("회원이 대여한 비디오 주인공:" + video.getActor());
		
	}
}
