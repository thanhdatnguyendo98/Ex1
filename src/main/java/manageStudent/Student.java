/**
 * 
 */
package manageStudent;

/**
 * @author ndtdat
 *
 */
public class Student {

	/**
	 * 
	 */
	private String name;
	private float rs1,rs2,rs3,GPA;
	
	public Student() {
		// TODO Auto-generated constructor stub	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRs1() {
		return rs1;
	}

	public void setRs1(float rs1) {
		this.rs1 = rs1;
	}

	public float getRs2() {
		return rs2;
	}

	public void setRs2(float rs2) {
		this.rs2 = rs2;
	}

	public float getRs3() {
		return rs3;
	}

	public void setRs3(float rs3) {
		this.rs3 = rs3;
	}

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float GPA) {
		this.GPA = GPA;
	}
	
	public float calculateGPA() {
		return (rs1 + rs2 +rs3)/3;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rs1=" + rs1 + ", rs2=" + rs2 + ", rs3=" + rs3 + ", GPA=" + GPA + "]";
	}

}
