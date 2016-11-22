package CompositePatternFamily.copy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Parent implements Person {

	private String name;

	// CONSTRUCTOR FOR PARENT NAME
	public Parent(String name) {
		this.name = name;
	}

	// ADD EMPLOYEES TO LIST OF EMPLOYEES

	List<Person> persons = new ArrayList<Person>();

	public void add(Person person) {
		persons.add(person);
	}

	public Person getChild(int i) {
		return persons.get(i);
	}

	// RETURN CHILD NAME

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("-------------");
		System.out.println("Name =" + getName());
		System.out.println("-------------");

		Iterator<Person> personIterator = persons.iterator();
		while (personIterator.hasNext()) {
			Person person = personIterator.next();
			person.print();
		}
	}

	// PRINT NAME OF COMPONENT AND CORRESPONDING COMPOSITES/LEAF(S)

	public void remove(Person person) {
		System.out.print(person.getName() + " IS DISOWNED");
		persons.remove(person);
		// REMOVE PERSON
	}

}
