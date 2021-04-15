package manageStudent;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String name;
		float rs1, rs2, rs3;
		String choice = null;
		boolean exit = false;
		/*
		 * int choice = 0; do { Student student = new Student();
		 * System.out.println("Enter the name:"); name = input.next();
		 * student.setName(name);
		 * 
		 * System.out.println("Enter result1:"); rs1 = input.nextFloat();
		 * student.setRs1(rs1);
		 * 
		 * System.out.println("Enter result2:"); rs2 = input.nextFloat();
		 * student.setRs2(rs2);
		 * 
		 * System.out.println("Enter result3:"); rs3 = input.nextFloat();
		 * student.setRs3(rs3);
		 * 
		 * System.out.println("Do you want to continue? Enter the number? 1- YES  2- NO"
		 * ); choice = input.nextInt(); student.setGPA(student.calculateGPA());
		 * studentList.add(student); } while (choice != 2);
		 */
		showMenu();
        while (true) {
            choice = input.nextLine();
            switch (choice) {
            case "1":
            	Student student = new Student();
                inputStudent(student);
                student.setGPA(student.calculateGPA());
                studentList.add(student);
                break;
            case "2":
            	showStudentList(studentList);
                break;
            case "3":
            	System.out.print("Largest student is:"+findLargestStudent(studentList).getName());
                break;
            case "4":
            	System.out.print("Lowest student is:"+findLowestStudent(studentList).getName());
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
	}

	/*
	 * show menu
	 */
	public static void showMenu() {
		System.out.println("-----------menu------------");
		System.out.println("1. Add student.");
		System.out.println("2. Show student.");
		System.out.println("3. Largest student.");
		System.out.println("4. Lowest student.");
		System.out.println("0. exit.");
		System.out.println("---------------------------");
		System.out.println("Please choose: ");
	}

	/*
	 * input name, exmaResult
	 */
	public static Student inputStudent(Student student) {
		Scanner input = new Scanner(System.in);
		String name;
		float rs1, rs2, rs3;
		System.out.println("Enter the name:");
		name = input.next();
		student.setName(name);

		System.out.println("Enter result1:");
		rs1 = input.nextFloat();
		student.setRs1(rs1);

		System.out.println("Enter result2:");
		rs2 = input.nextFloat();
		student.setRs2(rs2);

		System.out.println("Enter result3:");
		rs3 = input.nextFloat();
		student.setRs3(rs3);
		return student;
	}

	/*
	 * find lowest student in student list
	 */
	public static Student findLargestStudent(List<Student> studentList) {
		Student largestStudent = new Student();
		for (int i = 0; i < studentList.size(); i++) {
			if (i == 0) {
				largestStudent = studentList.get(i);
			} else if (largestStudent.getGPA() < studentList.get(i).getGPA()) {
				largestStudent = studentList.get(i);
			}
		}
		return largestStudent;
	}

	/*
	 * find lowest student in student list
	 */
	public static Student findLowestStudent(List<Student> studentList) {
		Student lowestStudent = new Student();
		for (int i = 0; i < studentList.size(); i++) {
			if (i == 0) {
				lowestStudent = studentList.get(i);
			} else if (lowestStudent.getGPA() > studentList.get(i).getGPA()) {
				lowestStudent = studentList.get(i);
			}
		}
		return lowestStudent;
	}

	/*
	 * Show list of student added
	 */
	public static void showStudentList(List<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student.toString());
		}
	}
}
