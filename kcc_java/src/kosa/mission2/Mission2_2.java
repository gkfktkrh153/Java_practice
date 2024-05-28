package kosa.mission2;

import java.util.Arrays;
import java.util.Scanner;

public class Mission2_2 {
	
	public static int handleTotal(int[] score) {
		return score[0] + score[1] + score[2];
	}
	public static int handleAverage(int[] score, int total) {
		return total / 3;
	}

	
	public static void main(String[] args) {
		// �������� ���α׷�(�������� ������ ���غ���)

		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[][] {{90, 80, 70}, {50, 40, 30}};
		int[] totalOfSubject = new int[3]; 
		
		System.out.println(String.format("��ȣ\t����\t����\t����\t����\t���"));
		
		int n = 1;
		for(int[] score : scores)
		{
			int total = handleTotal(score);
			int average = handleAverage(score, total);
			totalOfSubject[0] += score[0];
			totalOfSubject[1] += score[1];
			totalOfSubject[2] += score[2];
			System.out.println(String.format("%2d\t %2d\t %2d\t %2d\t %2d\t %2d", n++ , score[0], score[1],score[2] ,total, average));
			
		}
		System.out.println("=======================");
		System.out.println(String.format("\t %d\t %d\t %d" , totalOfSubject[0], totalOfSubject[1],totalOfSubject[2]));
		System.out.println(String.format("\t %d\t %d\t %d" ,totalOfSubject[0] / 2, totalOfSubject[1] / 2,totalOfSubject[2] / 2));
		
		
		


	}

}
