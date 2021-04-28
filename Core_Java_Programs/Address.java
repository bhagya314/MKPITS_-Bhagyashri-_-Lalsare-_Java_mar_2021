package Com.mkpits.java.Aggregation;

public class Address
{
    String city;
    String state;
    String country;
    public  Address(String city,String state,String country)
    {
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
class employee
{
    int id;
    String name;
    Address address;
    public employee(int id,String name,Address address)
    {
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display()
    {
        System.out.println(id + " : " +name);
        System.out.println(address.city+":" +address.state +":" +address.country);
    }
}
class aggregation {
    public static void main(String[] arg)
    {
        Address adr = new Address("Chandrapur", "Maharashtra", "India");
        Address adr1 = new Address("Chandigar", "Panjab", "India");

        employee emp = new employee(11, "Bhagya", adr);
        employee emp1 = new employee(12, "Vicky", adr1);

        emp.display();
        emp1.display();
    }
}