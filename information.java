class Student{ 
    int rollno;
    String name;
    Student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    void details(){
        System.out.println("rollno:"+rollno);
        System.out.println("name:"+name);
       
    }

}
class information{
    public static void main(String[] args) {
        Student s1=new Student(23,"ashika");
        Student s2=new Student(53,"sri");
        s1.details();
        s2.details();
    }
}