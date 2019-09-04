public class Main {

    public static void main(String[] args){
    
        Phonebook phonebook = new Phonebook();

        phonebook.add("John Doe", "408-123-456");
        phonebook.add("Bob cop", "408-234-4355");
        phonebook.add("Donald Duck", "408-123-2345");

        phonebook.printAll();

    }
}
