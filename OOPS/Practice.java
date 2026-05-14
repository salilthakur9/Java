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