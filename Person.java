class Person {
    String name;
    int age;
    public Person(String personName, int personAge) {
        name = personName;
        age = personAge;
  }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Ram", 30);
        person1.display();
        person2.display();
    }
}