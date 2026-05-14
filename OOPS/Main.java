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



/*class Employee{
    int id;
    String name;
    int salary;

    void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
class Main{
    public static void main(String args[]){
        Employee e=new Employee();
        e.id=877;
        e.name="Salil";
        e.salary=40000;
        e.display();
    }
}*/



/*import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;

    int area(){
        return length*breadth;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();

        Rectangle r=new Rectangle();
        r.length=l;
        r.breadth=b;
        System.out.println(r.area());

    }
}*/



/*import java.util.Scanner;
class Bank{
    Scanner sc=new Scanner(System.in);
    int balance;

    void deposit(){
        int value=sc.nextInt();
        balance+=value;
        System.out.println(balance);
    }

    void withdraw(){
        int value=sc.nextInt();
        balance-=value;
        System.out.println(balance);
    }

    void check(){
        System.out.println(balance);
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int bal=1000;
        Bank b=new Bank();
        b.balance=bal;

        while(true){
            System.out.println("choose: 1->check 2->deposit 3->withdraw 0->exit:");
            int choice=sc.nextInt();
            if(choice==0)break;
            else if(choice==1)b.check();
            else if(choice==2)b.deposit();
            else if(choice==3)b.withdraw();
            else{System.out.println("invalid input!!");}
        }
    }
}*/



/*class Balance{
    private double balance;

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println(balance);
        }else if(amount<0){
            balance+=amount;
            System.out.println(balance);
        }
    }

    double getter(){
        return balance;
    }
}
class Main{
    public static void main(String args[]){
        Balance b=new Balance();
        b.deposit(1000);
        b.deposit(-500);
        b.deposit(0);
        System.out.println("get: "+b.getter());
    }
}*/



/*import java.util.Scanner;
class Student{
    String name;
    int age;

    Student(String n, int a){
        this.name=n;
        this.age=a;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();

        Student s=new Student(name, age);
        s.display();
    }
}*/