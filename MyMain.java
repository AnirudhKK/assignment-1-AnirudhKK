import java.util.*;
public class MyMain
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        MyContacts ContactList = new MyContacts();
        int cont=1;
        while(cont==1)
        {
            System.out.println("Welcome to DBC's Contact List App\nPress 1 to add a new contact\nPress 2 to view all contacts\nPress 3 to search for a contact\nPress 4 to delete a contact\nPress 5 to exit program\n");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                        System.out.println("You have chosen to add a new contact: ");
                        System.out.println("Please enter the name of the Person");
                        System.out.print("First name: ");
                        String fn=sc.next();
                        System.out.println("");
                        System.out.print("Last name: ");
                        String ln=sc.next();
                        System.out.println("");
                        ArrayList<String> temp = new ArrayList<String>();
                        System.out.print("Contact Number: ");
                        temp.add(sc.next());
                        while(true)
                        {
                            System.out.print("Would you like to add another contact number? (y/n): ");
                            char c=sc.next().charAt(0);
                            if(c=='y')
                            {
                                System.out.print("Contact Number: ");
                                temp.add(sc.next());
                            }
							else
								break;
						}
                        System.out.println("");
                        System.out.print("Email: ");
                        String e=sc.next();
                        Person p=new Person(fn, ln, temp.get(0), e);
						if(temp.size()>1)
						{
							for(int i=1;i<temp.size();i++)
							{
								p.addPhoneNumber(temp.get(i));
							}
						}
                        ContactList.addNewContact(p);
                        Collections.sort(ContactList.list);
                        break;
                case 2:
                        ContactList.viewAllContacts();
                        break;
                case 3:
                            System.out.print("Enter name to search: ");
                            sc.nextLine();
                            String nameToFind=sc.nextLine();
                            ContactList.searchContact(nameToFind);
                            break;
                case 4:
                            System.out.println("Here are all your contacts: ");
                             for(int i=0;i<ContactList.list.size();i++)
                             {
                                 System.out.println(""+(i+1)+". "+ContactList.list.get(i).getFirstName());
                             }
                             System.out.print("Press the number against the contact to delete it: ");
                            int del=sc.nextInt();
                            ContactList.deleteContact(del-1);
                            break;
                case 5:
                            cont=0;
                            System.out.println("Thank You");
                            break;
                default:
                            System.out.println("Wrong choice entered. Try again!");

            }
    }
}
}