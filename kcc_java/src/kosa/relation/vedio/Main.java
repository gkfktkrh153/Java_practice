package kosa.relation.vedio;

public class Main {

	public static void main(String[] args) {
		
		GeneralMember member = new GeneralMember("aaa", "ȫ�浿", "��ź");
		member.rental(new Vedio(1, "Ʈ��������", "������"));
		
		
		member.printMemberInfo();
	}

}
