class Student {
    String name;
    int age;
}

class School {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "sri";
        s1.age = 22;
        s2.name="nithi";
        s2.age=23;

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("name:"+ s2.name);
        System.out.println("age:"+s2.age);
    }
}