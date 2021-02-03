package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rents = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int manyRooms = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		for(int i = 1; i <= manyRooms; i++) {
			System.out.println("Rent #" + i + ":");
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int roomId = sc.nextInt();
			sc.nextLine();
			
			rents[roomId] = new Rent(roomId, name, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < rents.length; i++) {
			if(rents[i] != null)
				System.out.println(rents[i]);
		}
		
		sc.close();
	}

}
