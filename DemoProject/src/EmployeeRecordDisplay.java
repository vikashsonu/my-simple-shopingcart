
public class EmployeeRecordDisplay {
	public static void main(String[] args) {
		
		emp e1=new emp();
		e1.empId=1001;
		e1.empName="verma ji";
		System.out.println("employee id=" + e1.empId);
		System.out.println("name="+ e1.empName);
		e1.doProject();
		
	}
}
class emp
{
	int empId;
	String empName;
	
	public  void doProject()
	{
		System.out.println("doning project");
	}
}
