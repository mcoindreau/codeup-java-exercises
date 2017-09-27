public class Person {
    public static void main(String[] args) {
        Person person = new Person("Marianna");
        System.out.println("person = " + person.Name);
        System.out.println(person.getName());
        person.setName("Martinez");
        person.sayHello();
        Person mari = new Person("Mari");
        mari.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //TRUE
//        System.out.println(person1 == person2); //FALSE

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2); //TRUE refers to the same object; do they hold a reference to the same memory position

        System.out.println("Person 1 " + person1 + " " + "Person 2 " +  person2); //prints Person@610455d6
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //JOHN
//        System.out.println(person2.getName()); //JOHN
//        person2.setName("Jane"); //NAME = JANE
//        System.out.println(person1.getName()); //JANE
//        System.out.println(person2.getName()); //JANE
    }

    private String Name;

    public Person(String aName) {
        this.Name = aName;
    }

    // returns the person's name
    public String getName(){
        return this.Name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.Name = name; //need this keyword and Name is ambiguous
        System.out.println("name = " + name);
    }

    // prints a message to the console using the person's name
    public void sayHello() {

        System.out.println("Hi " + this.Name + "!");
    }

} //end Person class





