package Stream.com;

public class Employee {
	private String name;
private	int age;
private	int salary;
private	String gender;
private	int taxPercentage;
private	int netPrice;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getTaxPercentage() {
	return taxPercentage;
}
public void setTaxPercentage(int taxPercentage) {
	this.taxPercentage = taxPercentage;
}
public int getNetPrice() {
	return netPrice;
}
public void setNetPrice(int salary,int taxPercentage) {
	this.netPrice = netPrice;
}
public Employee(String name, int age, int salary, String gender, int taxPercentage,int netPrice) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.gender = gender;
	this.taxPercentage = taxPercentage;
	this.netPrice = netPrice;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", gender=" + gender + ", taxPercentage="
			+ taxPercentage + ", netPrice=" + netPrice + "]";
}

}