import java.util.*;
 
class Company  {
  static String companyName;
  int size = 0;
  Company() {
    companyName="Amazon";
    size++;
  }
  String getCompanyName() {
   return companyName;
  }
  void show() {
    System.out.println("Total Employees are : "+size);
  }
}
 
class Employee {
  int empId;
  String name;
  //String cName;
  Employee() {
    
    //this.cName = str;
  }
  void set(int empId, String name) {
    this.empId =empId;
    this.name = name;
  }
  void show() {
    Company c = new Company();
    System.out.println("Name of Employees is : "+name);
    System.out.println("ID of Employees is : "+empId);
      System.out.println("COmpany name: "+c.getCompanyName());
    c.show();
  }
}
 
class Tonmoy {
  public static void main(String[] args) {
    String s1 = "Tonmoy Dhar";
    int id1 = 3;
    String s2 = "Ram Datla";
    int id2 = 2;
    String s3 = "Tanay";
    int id3 = 5;
    String s4 = "Gourab Biswas";
    int id4 = 7;
    String s5 = "Sharan";
    int id5 = 6;
    Employee e1 = new Employee();
    Employee e2 = new Employee();
    Employee e3 = new Employee();
    Employee e4 = new Employee();
    Employee e5 = new Employee();
    e1.set(id1,s1);
    e2.set(id2,s2);
    e3.set(id3,s3);
    e4.set(id4,s4);
    e5.set(id5,s5);
    e1.show();
    e2.show();
    e3.show();
    e4.show();
    e5.show();
  }
}
 