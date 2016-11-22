package CompositePatternFamily.copy;




public class notParent implements Person{   
  
    private String name;     
  
    public notParent(String name){   
        this.name = name;     
    }   
    public void add(Person person) {   
        //this is leaf node so this method is not applicable to this class.   
    }   
  
    public Person getChild(int i) {   
        //this is leaf node so this method is not applicable to this class.   
        return null;   
    }   
  
    public String getName() {   
        return name;   
    }   
   
  
    public void print() {   
        System.out.println("-------------");   
        System.out.println("Name ="+getName());      
        System.out.println("-------------");   
    }   
  
    public void remove(Person person) {   
        //this is leaf node so this method is not applicable to this class.   
    }
	}   
  

