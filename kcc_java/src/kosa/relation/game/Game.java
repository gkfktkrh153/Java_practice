package kosa.relation.game;

import java.util.Arrays;

public class Game {
	private Answer answer;
	private int count;

	public Game() {
		answer = new Answer();
		System.out.println(Arrays.toString(answer.getAnswerArr()));
		System.out.println("���� ����!");
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
			System.out.println(count + "�� ���� ����!");
			return true;
		}
		
		else {
			System.out.println(strike + "��Ʈ����ũ " + ball + "��");
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
