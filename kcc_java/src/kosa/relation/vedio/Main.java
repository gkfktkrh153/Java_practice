package kosa.relation.vedio;

public class Main {

	public static void main(String[] args) {
		
		GeneralMember member = new GeneralMember("aaa", "È«±æµ¿", "µ¿Åº");
		member.rental(new Vedio(1, "Æ®·£½ºÆ÷¸Ó", "¼­ºÀ¼ö"));
		
		
		member.printMemberInfo();
	}

}
