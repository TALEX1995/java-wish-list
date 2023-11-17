package org.lessons.java.christmas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		List<Present> presents = new ArrayList<>();
		
		while(true) {
			
			System.out.println("Inserisci il nome del regalo");
			String presentName = in.nextLine();
			
			System.out.println("Inserisci il destinatario del regalo");
			String presentRecipient = in.nextLine();
			
			Present present = new Present(presentName, presentRecipient);
			presents.add(present);
			
			System.out.println("Al momento hai inserito " + presents.size() + " regali");
			System.out.println("Vuoi inserire altri regali? Digita si o no");
			String newPresent = in.nextLine().toLowerCase();
			
			if(newPresent.equals("no")) {
				break;
			}
			if(!newPresent.equals("si")) {
				break;
			}
		}
		
		System.out.println("Vuoi ordinare la lista per nome o per destinatario? Inserisci 'nome' o 'destinatario':");
        String orderBy = in.nextLine().toLowerCase();
        
        if (orderBy.equals("nome")) {
            Collections.sort(presents, (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
        } else if (orderBy.equals("destinatario")) {
            Collections.sort(presents, (p1, p2) -> p1.getRecipient().compareToIgnoreCase(p2.getRecipient()));
        }
        
        
        System.out.println("Lista dei regali:");
        for (Present present : presents) {
            System.out.println("- " + present);
        }
       
		
		in.close();
	}

}
