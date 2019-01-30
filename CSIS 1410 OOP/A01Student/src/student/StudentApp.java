/* Aaron Templeton
 * CSIS 1410
 * A01 - Students
 */

package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int choice = 0;

		List<Student> students = new ArrayList<Student>();
		Student student1 = new Student("Aaron", "templeton", "Computer Science", 3.8);
		Student student2 = new Student("Mike", "Smith", "Business", 3.5);
		Student student3 = new Student("Abby", "George", "Electrical Engineering", 3.6);
		students.add(student1);
		students.add(student2);
		students.add(student3);

		while (choice != 6) {

			System.out.println("1. Add a student");
			System.out.println("2. Find a student");
			System.out.println("3. Delete a student");
			System.out.println("4. Display all students");
			System.out.println("5. Display the total number of students");
			System.out.println("6. Exit");
			System.out.print("Enter your selection: ");

			choice = input.nextInt();

			switch (choice) {

			case 1:
				System.out.println("enter first name: ");
				String fName = input.next();
				System.out.println("enter last name: ");
				String lName = input.next();
				System.out.println("enter major: ");
				String maj = input.next();
				System.out.println("enter gpa: ");
				double gpa = input.nextDouble();

				Student newStudent = new Student(fName, lName, maj, gpa);
				students.add(newStudent);

				break;

			case 2:
				System.out.println("Enter student number to search: ");
				int sNumber = input.nextInt();
				boolean found = false;
				for (Student st : students) {
					if (st.getsNumber() == sNumber) {
						System.out.println(st);
						found = true;
					}
				}
				if (!found) {
					System.out.println("no student found with given number");
				}

				break;

			case 3:
				System.out.println("Enter student number to delete: ");
				int sid = input.nextInt();
				Student ds = null;
				boolean found2 = false;
				for (Student stu : students) {
					if (stu.getsNumber() == sid) {
						ds = stu;
						found2 = true;
					}
				}
				if (ds != null) {
					students.remove(ds);
					System.out.println(ds.getFirstName() + " " + ds.getLastName() + " was removed");
				}
				if (!found2) {
					System.out.println("no student found with given number");
				}
				break;

			case 4:
				if (students.size() > 0) {
					for (Student st : students) {
						System.out.println(st);
					}
				} else {
					System.out.println("no students");
				}

				break;

			case 5:
				System.out.println("Total number of students: " + students.size());

				break;
			case 6:
				System.out.println("Good bye");

				break;

			default:
				System.out.println("Invalid input. please try again");

			}
		}

	}

}
