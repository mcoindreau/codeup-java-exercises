public class Person {
    public static void main(String[] args) {
        Person person = new Person("Marianna");
        System.out.println("person = " + person.Name);
        System.out.println(person.getName());
        person.setName("Martinez");

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
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
        Name = name;
        System.out.println("name = " + name);
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hi" + Name);
    }




} //end Person class





