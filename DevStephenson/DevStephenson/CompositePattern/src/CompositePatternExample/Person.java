package CompositePatternExample;


public interface Person {   
  
     public void add(Person employee);   
     public void remove(Person employee);   
     public Person getChild(int i);   
     public String getName();   
     public double getSalary();   
     public void print();   
}  

