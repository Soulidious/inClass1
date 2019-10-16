package inClass;

public class Student extends Person implements Comparable<Student>{
	private String className;
	private Integer rating;	
	
	public Student() throws NameException {
		super();
		rating = 0;
	}


	

	@Override
	public int compareTo(Student o) {
		
		return 0;
	}
	

	

	public Integer getRating() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
