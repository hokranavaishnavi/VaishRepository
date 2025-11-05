package Logics;

public class has_aRelation {
    public static void main(String[] args) {
        Address add1=new Address("djfhdjgjfhdj");
        Student s1=new Student(add1);
        Student s2=new Student();
    }
}
class Student{
    Address add;
    Idno no;
    Student(){          //tightly coupled
        this.no=new Idno();
    }
    Student(Address add){

    }
}
class Address{          //loosely coupled
    Address (String str){

    }
}
class Idno{


}

