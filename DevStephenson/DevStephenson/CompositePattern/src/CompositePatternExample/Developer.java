package CompositePatternExample;




public class Developer implements Person{   
  
    private String name;   
    private double salary;   
  
    public Developer(String name,double salary){   
        this.name = name;   
        this.salary = salary;   
    }   
    public void add(Person employee) {   
        //this is leaf node so this method is not applicable to this class.   
    }   
  
    public Person getChild(int i) {   
        //this is leaf node so this method is not applicable to this class.   
        return null;   
    }   
  
    public String getName() {   
        return name;   
    }   
  
    public double getSalary() {   
        return salary;   
    }   
  
    public void print() {   
        System.out.println("-------------");   
        System.out.println("Name ="+getName());   
        System.out.println("Salary ="+getSalary());   
        System.out.println("-------------");   
    }   
  
    public void remove(Person employee) {   
        //this is leaf node so this method is not applicable to this class.   
    }   
  
}
