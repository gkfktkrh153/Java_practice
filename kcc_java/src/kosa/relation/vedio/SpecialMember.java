package kosa.relation.vedio;

public class SpecialMember extends GeneralMember{
	
	private int bonusPoint;
	
	public SpecialMember() {}
	public SpecialMember(String id, String name, String address,int bonusPoint) {
		super(id, name, address);
		this.bonusPoint = bonusPoint;
	}

	public void printMemberInfo(){
		super.printMemberInfo();
		System.out.println("회원의 보너스 포인트 적립 : " + bonusPoint);
		
	}
	public void rental(Video video) {
		super.rental(video);
		bonusPoint += 10;
	}

}
