public class Person {

    private String name;



    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public static void main(String[] args) {
        Person person = new Person("Bob");
        person.sayHello();
        person.setName("Nick");
        person.sayHello();



    }

}