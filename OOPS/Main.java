/*class Student{
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
}*/



/*class Student{
    String name;
    int age;

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Main{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=s1;
        s1.name="Salil";
        s1.age=21;
        s1.display();
        if(s1==s2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        if(s1.equals(s2)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}*/



/*class Student{
    String name;
    int age;

    @Override
    public boolean equals(Object obj){
        Student s=(Student)obj;
        return this.name.equals(s.name) && this.age==s.age;
    }
}

class Main{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Salil";
        s1.age=21;

        Student s2=new Student();
        s2.name="Salil";
        s2.age=21;

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}*/