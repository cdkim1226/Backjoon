package backjoon_training;

import java.util.Scanner;

// 별 찍기 - 21

public class trainingEx06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n*2; i++) {
			if(i%2 == 1) {
				for(int j=1; j<=n; j++) {
					if(j%2 == 1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}else {
				for(int j=1; j<=n; j++) {
					if(j%2 == 1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
			
		
	}
}
