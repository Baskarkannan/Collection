package Stream.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[]args) { 
		Employee e1=new Employee("bas",24,25000,"male",10,25000-(25000*10/100));
		Employee e2=new Employee("Ari",26,30000,"male",20,30000-(30000*20/100));
		Employee e3=new Employee("Abi",27,27000,"female",5,27000-(27000*5/100));
		Employee e4=new Employee("pooj",35,20000,"female",7,20000-(20000-35/100));
		Employee e5=new Employee("Bharthi",28,15000,"male",10,15000-(15000-10/100));
		Employee e6=new Employee("Anbu",23,23000,"male",8,23000-(23000-8/100));
		Employee e7=new Employee("Kavi",30,24000,"female",10,24000-(24000-10/100));
		
		ArrayList<Employee>emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		emps.add(e7);
	//List<Employee>highTaxPaidEmployee=emps.stream().filter(x->x.getTaxPercentage()>=8).collect(Collectors.toList());
		//System.out.println(highTaxPaidEmployee);
		long maxCount=emps.stream().filter(x->x.getTaxPercentage()>=8).count();
		//emps.forEach(y->System.out.println(y));
		for(Employee y:emps) {
			System.out.println(y);
		}
		System.out.println(maxCount);
		
//		List<Employee>highSalary=emps.stream().filter(x->x.getSalary()>30000).collect(Collectors.toList());
//	System.out.println(highSalary);
		
		
//		List<Employee>age=emps.stream().filter(x->x.getAge()<30).collect(Collectors.toList());
//		System.out.println(age);
		
//		List<Employee>female=emps.stream().filter(x->x.getGender().equals("female")).collect(Collectors.toList());
//		System.out.println(female);
		
	}
		

}
