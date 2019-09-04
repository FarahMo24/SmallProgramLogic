import java.util.ArrayList;

public class PhoneBook{

  private ArrayList<Person> contacts = new ArrayList<Person>();
  
  public void add(String name, String number){
        Person p2 = new Person(name,number);
        contacts.add(p2);
  }

  public void printAll(){
      for(Person p : contacts)
          System.out.println(p.getName() + " number: " + p.getNum());
  }
  
  public String searchNumber(String name){
        for(Person p: contacts){
            if(p.getName().equals(name)){
                return p.getNum();
            }

        }
        return "Number not found";
    }
  

}


