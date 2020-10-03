package codingtest;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import codingtest.MyModel.Person;
public class ObserverDesignPattern {


	    public static void main(String[] args) {
	        MyModel model = new MyModel();
	        MyObserver observer = new MyObserver(model);
	        // we change the last name of the person, observer will get notified
	        for (Person person : model.getPersons()) {
	            person.setLastName(person.getLastName() + "1");
	        }
	        // we change the name of the person, observer will get notified
	        for (Person person : model.getPersons()) {
	            person.setFirstName(person.getFirstName() + "1");
	        }
	    }
}


class MyObserver implements PropertyChangeListener {
    public MyObserver(MyModel model) {
        model.addChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("Changed property: " + event.getPropertyName() + " [old -> "
            + event.getOldValue() + "] | [new -> " + event.getNewValue() +"]");
    }
}


class MyModel {
    public static final String FIRSTNAME = "firstName";
    public static final String LASTNAME = "lastName";

    private List<Person> persons = new ArrayList<Person>();
    private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();

    class Person {

        private String firstName;

        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {

            return firstName;
        }

        public void setFirstName(String firstName) {
            notifyListeners(
                    this,
                    FIRSTNAME,
                    this.firstName,
                    this.firstName = firstName);

        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            notifyListeners(
                    this,
                    LASTNAME,
                    this.lastName,
                    this.lastName = lastName);
        }
    }

    public List<Person> getPersons() {
        return persons;
    }

    public MyModel() {
        
        persons.add(new Person("Lars", "Vogel"));
        persons.add(new Person("Jim", "Knopf"));
    }

    private void notifyListeners(Object object, String property, String oldValue, String newValue) {
        for (PropertyChangeListener name : listener) {
            name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
        }
    }

    public void addChangeListener(PropertyChangeListener newListener) {
        listener.add(newListener);
    }

}