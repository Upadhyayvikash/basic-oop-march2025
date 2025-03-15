package encapsulationexample;

import classesandobjects.Demo;

import java.sql.SQLOutput;

public class EncapsulationMainClass {
    public static void main(String[] args) {
    Teacher teacher = new Teacher();
    //assign the values to teacher object
        //teacher.id=123 - private member variables can not be accesssed in another package with dot operator
        teacher.setId(123);
        teacher.setName("vikas");
        teacher.setEmail("vikas123@gmail.com");
        teacher.setMobile("+916388175397");
        teacher.setGender("male");
        teacher.setQualification("B.tech");
        System.out.println("Teacher is : "+teacher);

        System.out.println("Teacher is : "+teacher);

        System.out.println("Teacher name is : "+teacher.getName());
        System.out.println("Teacher id is : "+teacher.getId());
        System.out.println("Teacher mobile no is : "+teacher.getMobile());
        System.out.println("Teacher email id is : "+teacher.getEmail());
        System.out.println("Teacher gender is : "+teacher.getGender());
        System.out.println("Teacher qualification is : "+teacher.getQualification());

        Demo demo = new Demo();
        demo.setAbc(2222);
        demo.setXyz("Test");

        System.out.println("demo abc is : "+demo.getAbc());
        System.out.println("demo xyz is : "+demo.getXyz());

        Sample sample = new Sample();
        sample.setAbc(8888);
        sample.setXyz("Sample");

        System.out.println("sample abc is : "+sample.getAbc());
        System.out.println("sample xyx is : "+sample.getXyz());
    }
}
