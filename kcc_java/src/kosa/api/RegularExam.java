package kosa.api;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();

		/*
		 * if(str.matches(".*abc.*")) System.out.println("매칭"); else
		 * System.out.println("비매칭");
		 */

		/*
		 * // 알파벳, 숫자만 5자리 이상 if (str.matches("[\\w]{5,}")) System.out.println("매칭");
		 * else System.out.println("비매칭");
		 */

		/*
		 * // 한글 3~5 if (str.matches("[가-힣]{3,5}")) System.out.println("매칭"); else
		 * System.out.println("비매칭");
		 */

		/*
		 * // 숫자 먼저 오면 안됨 // @없으면 안됨 // nate.com 으로 끝나지 않으면 if
		 * (str.matches("^[\\p{Alpha}][\\w]*@[\\p{Alpha}]+\\.{1}[\\p{Alpha}]{3}"))
		 * System.out.println("매칭"); else System.out.println("비매칭");
		 */

		/*
		 * // 이미지 형식 if(str.matches("^[\\p{Alpha}]+\\.{1}(?i)(jpg|png|gif)$"))
		 * System.out.println("이미지"); else System.out.println("일반");
		 */
		
		
		/*
		 * // 숫자 제거 String message =
		 * "SW 개발자 4214처우와 근무여건 선진국 수준으로 개선해야 【321321서울=뉴시스】김형섭 기자 = 박근혜 대5235235통령은 23일 소프트웨어(SW) 중심사회를 실현하기 위해서는 SW의 가치를 제대로 인정하는 데서 출발해야 한다고 말했다. 박 대통령은 이날 오전 판교 테크노밸리에서 열린 'SW 중심사회 실현 전략보고회'에서 우리나라가 IT 강국으로 지속 발전하기 위해서는 SW 분야의 경쟁력 확보가 시급한 과제라며 이같이 밝혔다. 박 대통령은 시장에서 SW의 가치를 제대로 인정하지 않아 SW 기업들의 수익성이 악화되고, 우수한 인재가 유입되지 않는 악순환의 고리를 끊어야 한다며 공공부문의 SW 제값주기 노력이 민간으로 확산돼 창의성과 노력이 온전히 보답 받는 환경을 조성해 나가도록 노력할 것이라고 약속했다.  이어 그동안 공공 정보화사업이 오히려 민간 SW 시장을 위축시킨다는 지적이 있었는데 민간의 기술과 산업발전을 위한 마중물 역할을 해야 할 정부가 오히려 민간시장을 위축시키는 일이 있어서는 안 될 것이라며 민간시장에 미치는 영향을 사전에 평가하는 등 공공 정보화사업 추진절차를 개선할 필요가 있다고 진단했다.  박 대통령은 또 SW 개발자의 처우와 근무여건도 선진국 수준으로 개선할 필요가 있다며 SW 개발자가 '꿈의 직업'이 돼 최고의 인재들이 유입되고 이들이 SW 산업 발전을 이끌어가고, 그래서 소프트웨어 개발자들의 처우가 더욱 개선되는 선순환 구조를 만들어 나가야 하겠다고 강조했다.  특히 자라나는 미래세대에 대한 SW 교육이 무엇보다 중요하다며 SW 중심사회의 주역이 될 미래 세대가 '컴퓨터적 사고'를 기본소양으로 갖출 수 있도록 초·중등학교에서부터 SW교육을 강화해야 한다고 말했다."
		 * ; String result = message.replaceAll("[\\p{Digit}]", "");
		 * System.out.println(result);
		 */
		
		

	}

}
