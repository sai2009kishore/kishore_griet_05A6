import java.util.*;
import java.text.*;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) throws Exception
	{
		int id;
		String name;
		String dob;
		double avg;
		Scanner sc = new Scanner(System.in);
		DateFormat format = new SimpleDateFormat("dd/mm/yyyy");
		int n= 5;
		Student s[] = new Student[n];

/*		for(int i=0;i<n;i++)
		{
			id = sc.nextInt();
			sc.nextLine();
			name = sc.nextLine();
			dob = sc.next();
			avg = sc.nextDouble();
			Date date = format.parse(dob);
			s[i] = new Student(id, name, date, avg);
		}
*/
		s[0] = new Student(10, "Sai", format.parse("10/10/1996"), 90.1);
		s[1] = new Student(20, "Sai", format.parse("11/10/1996"), 90.1);
		s[2] = new Student(30, "Sai", format.parse("12/10/1996"), 90.1);
		s[3] = new Student(40, "Sai", format.parse("13/10/1996"), 90.1);
		s[4] = new Student(50, "Sai", format.parse("14/10/1996"), 90.1);

		StudentGroup sg = new StudentGroup(n);
		sg.setStudents(s);
		
		Student ret[] = sg.getStudents();
		for(int i=0;i<ret.length;i++)
			System.out.println(ret[i].getId()+" "+ret[i].getFullName()+" "+ret[i].getBirthDate()+" "+ret[i].getAvgMark());

		System.out.println();

		Student temp = new Student(10, "Sai", format.parse("10/10/1996"), 90.1);

		sg.removeFromIndex(3);

		ret = sg.getStudents();

		for(int i=0;i<ret.length;i++)
			System.out.println(ret[i].getId()+" "+ret[i].getFullName()+" "+ret[i].getBirthDate()+" "+ret[i].getAvgMark());
		
	}
}