package kosa.relation.vedio;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Vedio vedio;
	
	public GeneralMember() {
		
	}
	
	
	public GeneralMember(String id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	public void rental(Vedio vedio) {
		this.vedio = vedio;
	}

	public void printMemberInfo(){
		System.out.println("아이디 :" + id);
		System.out.println("이름 :" + name);
		System.out.println("주소 :" + address);
		System.out.println("비디오 번호 :" + vedio.getVedioNum());
		System.out.println("비디오 제목 :" + vedio.getTitle());
		System.out.println("비디오 배우 :" + vedio.getActor());
		
	}
}
