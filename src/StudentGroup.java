import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	public StudentGroup(int length) 
	{
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() 
	{
		return students;
	}

	@Override
	public void setStudents(Student[] students) 
	{
		for(int i=0;i<students.length;i++)
			this.students[i] = new Student(students[i].getId(), students[i].getFullName(), students[i].getBirthDate(), students[i].getAvgMark());
	}

	@Override
	public Student getStudent(int index) 
	{
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) 
	{
		if(student == null)
			throw new IllegalArgumentException("Illegal argument");
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException("Illegal argument");
		
		students[index] = student;
	}

	@Override
	public void addFirst(Student student) 
	{
		if(student == null)
			throw new IllegalArgumentException("Illegal argument");

		Student temp[] = new Student[students.length+1];

		temp[0] = student;
		for(int i=0;i<students.length;i++)
			temp[i+1] = students[i];
		students = temp;
	}

	@Override
	public void addLast(Student student) 
	{
		if(student == null)
			throw new IllegalArgumentException("Illegal argument");
		
		Student temp[] = new Student[students.length+1];
		for(int i=0;i<students.length;i++)
			temp[i] = students[i];
		temp[students.length] = student;
		students = temp;
	}

	@Override
	public void add(Student student, int index) 
	{
		if(student == null)
			throw new IllegalArgumentException("Illegal argument");
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException("Illegal argument");
		
		Student temp[] = new Student[students.length+1];

		for(int i=0;i<index;i++)
			temp[i] = students[i];

		temp[index] = student;

		for(int i=index;i<students.length;i++)
			temp[i+1] = students[i];
		
		students = new Student[temp.length];
		students = temp;
	}

	@Override
	public void remove(int index) 
	{
		if(index<0 || index>=students.length)
			throw new IllegalArgumentException("Invalid length");
		Student temp[] = new Student[students.length-1];
		int count = 0;
		for(int i=0;i<students.length;i++)
			if(i!=index)
				temp[count++] = students[i];
			
		students = temp;
	}

	@Override
	public void remove(Student student) 
	{
		Student temp[] = new Student[students.length-1];
		
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
