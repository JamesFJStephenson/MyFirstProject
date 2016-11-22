package CompositePatternExample;




 

import java.util.ArrayList;   
import java.util.Iterator;   
import java.util.List;   
  
public class Manager implements Person{   
  
 private String name;   
 private double salary;   
  
 public Manager(String name,double salary){   
  this.name = name;   
  this.salary = salary;   
 }   
 // constructor to set the salary and name of the manager employee
    
 List<Person> employees = new ArrayList<Person>();   
 public void add(Person employee) {   
    employees.add(employee);   
 }   
 
 // method to add employee to a list of employees
 
 public Person getChild(int i) {   
  return employees.get(i);   
 }   
 
 // method to get information about children 
  
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
     
  Iterator<Person> employeeIterator = employees.iterator();   
    while(employeeIterator.hasNext()){   
     Person employee = employeeIterator.next();   
     employee.print();   
    }   
 }   
  // method to print all information about employees in a list 
 
 
 public void remove(Person employee) {   
  employees.remove(employee);   
 }   
  
}  

