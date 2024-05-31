package kosa.relation.vedio;

public class Main {

	public static void main(String[] args) {

		Video[] videos = new Video[] { new Video(1L, "트랜스포머", "서봉수"), new Video(2L, "쿵더펜더2", "지성민") };

		
		GeneralMember[] members = {new GeneralMember("aaa", "홍길동", "동탄"), new SpecialMember("bbb", "김철수", "서울", 10)};
		for(int i = 0; i < members.length; i++) {
			/*
			 * if(members[i] instanceof SpecialMember) {
			 * ((SpecialMember)members[i]).rental(videos[i]);
			 * ((SpecialMember)members[i]).printMemberInfo(); } else {
			 * members[i].rental(videos[i]); members[i].printMemberInfo(); }
			 */
			members[i].rental(videos[i]);
			members[i].printMemberInfo();
		}
		
		/*
		 * GeneralMember generalMember = new GeneralMember("aaa", "홍길동", "동탄");
		 * SpecialMember specialMember = new SpecialMember("bbb", "김철수", "서울", 10);
		 * 
		 * generalMember.rental(videos[0]); specialMember.rental(videos[1]);
		 * 
		 * generalMember.printMemberInfo();
		 * System.out.println("-----------------------------");
		 * specialMember.printMemberInfo();
		 */
	}

}
