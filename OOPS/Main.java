class Student{
    String name;
    int age;

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Main{
    public static void main(String args[]){
        Student s=new Student();
        s.name="Salil";
        s.age=21;
        s.display();
    }
}