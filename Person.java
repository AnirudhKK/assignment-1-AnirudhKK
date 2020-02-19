public class Person
{
	private String firstName;
	private String lastName;
	private ArrayList<String> phoneNumber = new ArrayList<String>();
	private String email;
    public Person(String firstName, String lastName, String number, String email)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        phoneNumber.add(number);
        this.email=email;
    }

    public String getFirstName() 
    {
        return firstName;
    }
    public String getLastName() 
    {
        return lastName;
    }
    public String getEmail()
    {
    return email;
    }
    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void addPhoneNumber(String pNumber) {
        phoneNumber.add(pNumber);
    }
    @Override
    public String toString()
    {
        System.out.println("-------- * -------- * -------- * --------");
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: "+lastName);
        if(phoneNumber.size()>1)
        {
            System.out.println("Contact Number(s): ");
            for(String no:phoneNumber)
            {
                System.out.print(no+", ");
            }
        }
        else
        {
            System.out.println("Contact Number: ");
                System.out.print(phoneNumber.get(0));
        }
        System.out.println("Email Address: "+email);
    }
}