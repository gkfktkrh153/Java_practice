package kosa.relation.game;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Game game = new Game();
	
		while(true) {
			System.out.print("ют╥б :");
			String[] split = sc.nextLine().split("");
			int[] input = Stream.of(split).mapToInt(Integer::parseInt).toArray();
			
			if(game.checkAnswer(input) == true)
				return;
		}
	}

}
