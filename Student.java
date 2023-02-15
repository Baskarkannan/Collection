package Stream.com;

public class Student {
private	String name;
private	int age;
	private String gender;
  private   String standard;
  private   boolean isGoverment;
   private  int fees;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public boolean isGoverment() {
		return isGoverment;
	}
	public void setGoverment(boolean isGoverment) {
		this.isGoverment = isGoverment;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Student(String name, int age, String gender, String standard, boolean isGoverment, int fees) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.standard = standard;
		this.isGoverment = isGoverment;
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", standard=" + standard
				+ ", isGoverment=" + isGoverment + ", fees=" + fees + "]";
	}
	
     
	
	

}
