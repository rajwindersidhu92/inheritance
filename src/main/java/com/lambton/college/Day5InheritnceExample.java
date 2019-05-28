package com.lambton.college;

import com.lambton.hardware.Laptop;
import com.lambton.hardware.Computer;
public class Day5InheritnceExample {
    public static void main(String[] args){
       int marks[] = new int[]{99,24,73,74,88,99};
       Student s1 = new Student();

        Laptop comp = new Laptop();
        comp.setId(1);
        comp.setManufactrerName("dell");
        comp.setScreeSize(32);
        comp.setWeight(50);

       s1.setId(1);
       s1.setFirstName("rajwinder");
       s1.setLastName("kaur");
       s1.setEmailId("kaurrajwinder203@gmail.com");
       s1.setGender("Female");
       s1.setCourse("Mobile application Design and development");
       s1.setComputer(comp);
       s1.setMarks(marks);


       Faculty f1 = new Faculty();
       f1.setFirstName("proffesor");
       f1.setLastName("singh");
       f1.setComputer(comp);
       f1.setEmailId("prof@gmail.com");
       f1.setGender("Male");
       f1.setDepartmenttName("cse");
       f1.setDesignation("Senior prof");
       f1.setSalary(100000);


        System.out.println(s1.getId());
        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getEmailId());
        System.out.println(s1.getGender());
        System.out.println(s1.getCourse());
        System.out.println(s1.getComputer());
        System.out.println(s1.getMarks());



        System.out.println(f1.getFirstName());
        System.out.println(f1.getLastName());
        System.out.println(f1.getComputer());
        System.out.println(f1.getEmailId());
        System.out.println(f1.getGender());
        System.out.println(f1.getDepartmenttName());
        System.out.println(f1.getDesignation());
        System.out.println(f1.getSalary());

    }
}
