package CompositePatternExample;


 
  
public class CompositeDesignPatternMain {   
  
 public static void main(String[] args) {   
  Person emp1=new Developer("John", 10000);   
  Person emp2=new Developer("David", 15000);   
  Person manager1=new Manager("Daniel",25000);   
  manager1.add(emp1);   
  manager1.add(emp2);   
  Person emp3=new Developer("Michael", 20000);   
  Manager generalManager=new Manager("Mark", 50000);   
  generalManager.add(emp3);   
  generalManager.add(manager1);   
 generalManager.print();   
 System.out.println(generalManager.getChild(1));
 }   
}  

// Read more at http://www.java2blog.com/2012/09/composite-design-pattern-in-java.html#fTrX6APzoAppby3e.99
