package org.lessons.java.christmas;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		List<String> presents = new ArrayList<>();
		
		while(true) {
			
			System.out.println("Inserisci il nome del regalo");
			String present = in.nextLine();
			
			presents.add(present);
			
			System.out.println("Al momento hai inserito " + presents.size() + " regali");
			System.out.println("Vuoi inserire altri regali? Digita si o no");
			String newPresent = in.nextLine().toLowerCase();
			
			if(newPresent.equals("no")) {
				break;
			}
		}
		
		System.out.println("Lista dei regali:");
		for(String present: presents) {
			System.out.println("-" + present + "\n");
		};
		
		in.close();
	}

}
