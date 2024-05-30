package kosa.relation.game;

import java.util.Arrays;

public class Game {
	private Answer answer;
	private int count;

	public Game() {
		answer = new Answer();
		System.out.println(Arrays.toString(answer.getAnswerArr()));
		System.out.println("게임 시작!");
	}
	
	public Boolean checkAnswer(int[] input) {
		int strike = 0;
		int ball = 0;
		
		int[] answerArr = answer.getAnswerArr();
		for(int i = 0; i < 3; i++) { // 1 2 3
			for(int j = 0 ; j < 3; j++) {
				if(input[i] == answerArr[j] && i == j)
					strike++;
				else if(input[i] == answerArr[j] && i != j)
					ball++;
			}			
		}
		if(strike == 3) {
			System.out.println(count + "번 만의 정답!");
			return true;
		}
		
		else {
			System.out.println(strike + "스트라이크 " + ball + "볼");
			count++;
			return false;
		}
	}
	/*
	 * increaseCount(){
	 * 
	 * }
	 */
}
