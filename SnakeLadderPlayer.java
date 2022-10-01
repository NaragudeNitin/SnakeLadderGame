package com.snakeLadder;

import java.util.Random;

public class SnakeLadderPlayer {
	public static void main(String[] args) {
		Random random = new Random();
		int move =random.nextInt(3);
		int player=0;
		switch (move) {
		case 0:
			System.out.println("Player: no play");
			break;
		case 1:
			System.out.println("Player: ladder");
			break;

		default:
			System.out.println("Player: Snake");
			break;
		}
	}
}
