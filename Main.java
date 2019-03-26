
public class Main {
	
	public static void main(String[] args) {
		ContactsManager myContactmanager= new ContactsManager();
	
		Contact Fanny= new Contact();
		Fanny.name="Fanny";
		Fanny.phoneNumber="713449000";
		myContactmanager.addContact(Fanny);
		
		Contact petya= new Contact();
		petya.name="petya";
		petya.phoneNumber="713449000";
		myContactmanager.addContact(petya);
		
		Contact result= myContactmanager.searchContact("petya");
		System.out.println(result.phoneNumber);
		
	}

}
