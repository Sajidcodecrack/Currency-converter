class Student{
    String name;
    int age;
    public void info()
    {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println("Good bye");
    }
    Student(String name, int age){
        this.name =name;
        this.age=age;
    }
}

public class StudentOOP{
   public static void main(String[] args){
     Student sc= new Student("Sajid ahamed ", 24);
           sc.info();

   } 

}