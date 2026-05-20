/*import java.util.ArrayList;
class Student{
    private int id;
    private String name;
    private int age;
    static int count=0;

    Student(int id, String name, int age){
        this.name=name;
        this.id=id;
        this.age=age;
        count+=1;
    }

    void display(){
        System.out.println(name+" of age "+age+" have id: "+id);
    }

    int get_id(){
        return id;
    }
}

class Practice {
    public static void main(String args[]){
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1, "a",21));
        students.add(new Student(2, "b",22));
        students.add(new Student(3, "c",23));

        for(Student s:students){
            s.display();
            System.out.println(s.get_id());
        }
        System.out.println("final count: "+ Student.count);
    }
}*/



/*class Bank{
    private double balance;

    Bank(double balance){
        this.balance=balance;
    }

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposited!!");
        }else{
            System.out.println("invalid input!!");
        }
    }

    void withdraw(double amount){
        if(amount>0 && amount<balance){
            balance-=amount;
            System.out.println("withdrawn!!");
        }else{
            System.out.println("invalid input!!");
        }
    }

    double get_balance(){
        return balance;
    }
}

class Practice{
    public static void main(String args[]){
        Bank b=new Bank(999.99);

        b.deposit(0.1);
        b.withdraw(0.09);

        System.out.println(b.get_balance());
    }
}*/



/*abstract class Employee{
    protected String name;
    protected double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    abstract void calculate();
}
class Developer extends Employee{

    Developer(String name, double salary){
        super(name, salary);
    }

    @Override
    void calculate(){
        salary+=20000;
        System.out.println("Developer complete salary after bonus is: "+ salary);
    }
}
class Manager extends Employee{

    Manager(String name, double salary){
        super(name, salary);
    }

    @Override
    void calculate(){
        salary+=40000;
        System.out.println("Manager salary after adding bonus: "+salary);
    }
}

class Practice{
    public static void main(String args[]){
        Employee e1=new Developer("Salil", 50000); 
        Employee e2=new Manager("Thakur", 60000); 

        e1.calculate();
        e2.calculate();
    }
}*/



/*import java.util.ArrayList;
class Book{
    int id;
    String name;
    boolean isIssued;

    Book(int id, String name){
        this.id=id;
        this.name=name;
        this.isIssued=false;
    }

    void display(){
        System.out.println("id: "+id+", name: "+name+", isIssued: "+isIssued);
    }
}

class Library{
    ArrayList<Book> books=new ArrayList<>();

    void addBook(Book b){
        books.add(b);
    }

    void issue(int id){
        for(Book b:books){
            if(b.id==id && !b.isIssued){
                b.isIssued=true;
                System.out.println("Book issued of id: "+b.id);
            }
        }
    }

    void display(){
        for(Book b:books){
            b.display();
        }
    }
}

class Practice{
    public static void main(String args[]){
        Library l=new Library();

        l.addBook(new Book(1, "book1"));
        l.addBook(new Book(2, "book2"));
        l.addBook(new Book(3, "book3"));

        l.issue(2);
        l.issue(2);
        l.display();
    }
}*/



/*abstract class Account{
    protected double balance;

    Account(double balance){
        this.balance=balance;
    }

    abstract void withdraw(double amount);

    void display(){
        System.out.println(balance);
    }
}
class Savings extends Account{
    Savings(double balance){
        super(balance);
    }

    @Override
    void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
            System.out.println("withdraw successful");
        }else{
            System.out.println("invalid amount");
        }
    }
}

class Practice{
    public static void main(String args[]){
        Account a=new Savings(1000);

        a.display();
        a.withdraw(500);
        a.display();
    }
}*/



/*interface Shape{
    void area();
    void perimeter();
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void area() {
        double area=Math.PI*radius*radius;
        System.out.println("radius: "+radius);
    }
    @Override
    public void perimeter(){
        double perimeter=2*Math.PI*radius;
        System.out.println("perimeter: "+perimeter);
    }
}
class Practice{
    public static void main(String args[]){
        Shape s=new Circle(200);
        s.area();
        s.perimeter();
    }
}*/



interface pay{
    void paid();
}
class Gpay implements pay{
    double amount;

    public Gpay(double amount){
        this.amount=amount;
    }
    @Override
    public void paid(){
        System.out.println(amount+" paid by Gpay!");
    }
}
class Phonepay implements pay{
    double amount;

    public Phonepay(double amount){
        this.amount=amount;
    }
    @Override
    public void paid(){
        System.out.println(amount+" paid by Phonepay!");
    }
}

class Practice{
    public static void main(String args[]){
        Gpay g=new Gpay(100);
        Phonepay p=new Phonepay(200);

        g.paid();
        p.paid();
    }
}