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
		System.out.println("���̵� :" + id);
		System.out.println("�̸� :" + name);
		System.out.println("�ּ� :" + address);
		System.out.println("���� ��ȣ :" + vedio.getVedioNum());
		System.out.println("���� ���� :" + vedio.getTitle());
		System.out.println("���� ��� :" + vedio.getActor());
		
	}
}
