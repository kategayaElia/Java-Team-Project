package taskmanagement;

import java.util.Scanner;

import models.Contacts;

public class ContactsService {
		
		Scanner scanner = new Scanner(System.in);
			
			public Contacts createContacts() {
				
				System.out.println("Enter Contacts Id");
				String id = scanner.nextLine();
				
				System.out.println("Enter Contacts Name");
				String name = scanner.nextLine();
				
				
				System.out.println("Enter Contacts email");
				String email = scanner.nextLine();
				
				scanner.nextLine();
				
				Contacts contacts = new Contacts();
				contacts.setId(id);
				contacts.setName(name);
				contacts.setEmail(email);

				System.out.println("My Contacts Details :");
				
				System.out.println(" My Contacts Id " + id );
				System.out.println(" My Contacts Name " + name);
				System.out.println(" My Contacts email " + email);
				
				return contacts;	
		
		}
		
	}