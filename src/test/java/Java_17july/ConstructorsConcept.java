package Java_17july;
class number{

}

class names{

}

class students {

    String firstName;
    String middleName;
    String lastName;

    public void displayName()
    {
        System.out.println("First Name is: "+firstName);
        System.out.println("Middle Name is: "+middleName);
        System.out.println("Last Name is: "+lastName);
    }
}
public class ConstructorsConcept {

    public static void main(String[] args) {

        students n1= new students();

        n1.displayName();
    }
}

