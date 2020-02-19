public class MyContacts
{
    public ArrayList<Person> list = new ArrayList<Person>();
    public addNewContact(Person p)
    {
        list.add(p);
    }
    public void viewAllContacts()
    {
        System.out.println("---Here are all your contacts---");
        for(Person per:list)
        {
            System.out.println(per);
        }
    }
    public searchContact(String nameToSearch)
    {
        int match=0;
        for(Person per:list)
        {
            if(per.getFirstName().equalsIgnoreCase(nameToSearch))
            {
                match++;
                System.out.println(per);
            }
        }
        System.out.println(match+ "match found!");
    }

}