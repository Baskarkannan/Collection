package Stream.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseStudent {
	public static void main(String[]args) {
		Student s1=new Student("bas",12,"male","6th",true,12000);
		Student s2=new Student("pooja",12,"female","6th",false,25000);
		Student s3=new Student("Bharathi",17,"male","12th",true,12000);
		Student s4=new Student("Abi",18,"female","11th",true,12000);
		Student s5=new Student("anbu",15,"male","10th",false,30000);
		ArrayList<Student>stu=new ArrayList<>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		
//		List<Student> gender=stu.stream().filter(x->x.getGender().equals("female")).collect(Collectors.toList());
//		for(Student x:gender) {
//		System.out.println(x);
//		}
//		long maxCount=stu.stream().filter(y->y.getGender()=="female").count();
//		System.out.println(maxCount);
		
//		List<Student> fees=stu.stream().filter(x->x.getFees()>12000).collect(Collectors.toList());
//		for(Student x:fees) {
//		System.out.println(x);
//		}
//		long maxCount=stu.stream().filter(y->y.getFees()>12000).count();
//		System.out.println(maxCount);
		
//		List<Student> age=stu.stream().filter(x->x.getAge()>12).collect(Collectors.toList());
//		for(Student x:age) {
//		System.out.println(x);
//		}
//		long maxCount=stu.stream().filter(y->y.getAge()>12).count();
//		System.out.println(maxCount);
		
	List<String> stuName=stu.stream().map(x->x.getName()).collect(Collectors.toList());
	System.out.println(stuName);
		
//		List<Integer> value=stu.stream().map(x->x.getAge()).collect(Collectors.toList());
//		System.out.println(Collections.max(value));
		
//	List<String>value=stu.stream().map(x->x.getName()).collect(Collectors.toList());
//	System.out.println(Collections.max(value));
//		
//		List<String>value=stu.stream().map(x->x.getName()).collect(Collectors.toList());
//		System.out.println(Collections.min(value));
		

		
		
	}
}

		
		
		
	
	
	