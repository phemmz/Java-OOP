/* extends is the keyword used to inherit the properties of a class. Here Salary is inheriting from Employee */
public class Salary extends Employee {
  private double salary;

  public Salary(String firstName, String lastName, String address, int age, double salary) {
    super(firstName, lastName, address, age);
    setSalary(salary);
  }
  
  public void setSalary(double newSalary) {
    salary = newSalary;
  }

  public void sendMail() {
    System.out.println("Employee salary mail");
    System.out.println("Sending mail to " + getFirstName() + " with salary of " + salary);
  }
  
  /* Method overloading is the action of defining multiple methods with the same name, but with different parameters.*/
  public void calculateSalary() {
    System.out.println(getFirstName() + " 1 month salary is " + salary);
  }
  
  public void calculateSalary(int months) {
    System.out.println(getFirstName() + " " + months + " months salary is " + salary * months);
  }
  
  public static void main(String [] args) {
    Salary s = new Salary("Phemmz", "Adetunji", "Maryland, Lagos", 81, 33600.00);
    Employee e = new Salary("Joel", "Adams", "Maryland, Lagos", 61, 22400.00);
    s.sendMail();
    s.calculateSalary();
    s.calculateSalary(12);
    e.sendMail();
  }
}