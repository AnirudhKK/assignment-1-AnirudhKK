import java.util.Scanner;
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
                        System.out.print("Contact Number: ");
                        String no=sc.next();
                        System.out.println("");
                        System.out.print("Email: ");
                        String e=sc.next();
                        Person p=new Person(fn, ln, no, e);
                        ContactList.addNewContact(p);
                        System.out.println(p);
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

            }
    }
}
}