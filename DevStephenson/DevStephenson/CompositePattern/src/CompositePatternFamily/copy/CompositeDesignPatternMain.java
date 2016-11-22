package CompositePatternFamily.copy;


 
  
public class CompositeDesignPatternMain {   
  
 public static void main(String[] args) {   
	 
	 // NAME PEOPLE
  Person person1=new Parent("John");   
  Person person2=new notParent("Mark");   
  Person person3=new Parent("Cuthbert"); 
  Person person4=new notParent("Emily");   
  Person person5=new notParent("Cuthbert. Jr");   
  Person person6=new notParent("Milton"); 
  
  
  // ASSIGN TREE
  person1.add(person2);
  person1.add(person3);
  person3.add(person4);
  person3.add(person5);
  person3.add(person6);

  // MILTON IS DISOWNED
  person3.remove(person6);
 
  
  // PRINT CUTHBERT AND HIS OWNED CHILDREN
  
  person3.print();
 }   
}  


