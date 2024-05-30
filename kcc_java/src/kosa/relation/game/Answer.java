package kosa.relation.game;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Answer {
	private int[] answerArr;
	private int randomValueCount;
	
	public Answer() {
		answerArr = new int[3];
		setRandomValue();
	}
	
	public void setRandomValue() {
		while(randomValueCount < 3) {
			int randomValue = (int)(Math.random() * 9 + 1);
			if(isExist(randomValue)) {
				continue;
			}
			answerArr[randomValueCount++] = randomValue;
		}
	}
	public Boolean isExist(int inputValue) {
		for(int randomValue : answerArr) {
			if(randomValue == inputValue)
				return true;
		}
		return false;
	}
	public int[] getAnswerArr() {
		return answerArr;
	}

}
