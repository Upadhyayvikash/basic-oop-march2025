package classesandobjects;

public class Student {
    public int id;
    public String name;
    public int age;
    public String email;
    public String grade;

    int xyz = 800;
    static int mno = 900;

    public void demo(){
        System.out.println("non static method");
        //we can use static methods or variables inside the non static methods
        demo2();
        mno=1000;

    }
    public static void demo2(){
        System.out.println("static method");
        //xyz=700;
        //demo(); we can not use non static inside the static block method or variable
    }
//toString : converts the objects reference to string format
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
