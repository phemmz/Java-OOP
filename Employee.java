/* In Object-oriented programming, abstraction is a process of hiding the implementation details from the user, only the functionality will be provided to the user. In Java, abstraction is achieved using Abstract classes and interfaces.
*/
public abstract class Employee {
  // To achieve encapsulation in Java, you declare the variables of a class as private
  private String firstName;
  private String lastName;
  private String address;
  private int age;
  
  // constructor
  public Employee(String firstName, String lastName, String address, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.age = age;
  }

  // Public setter and getter methods to modify and view the private variables values
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getAddress() {
    return address;
  }
  
  public int getAge() {
    return age;
  }

  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }
  
  public void setLastName(String newLastName) {
    lastName = newLastName;
  }
  
  public void setAddress(String newAddress) {
    address = newAddress;
  }
  
  public void setAge(String newAge) {
    firstName = newAge;
  }
  
  public void sendMail() {
    System.out.println("Employee mail");
    System.out.println("Sending mail to " + this.firstName + " " + this.address);
  }
}