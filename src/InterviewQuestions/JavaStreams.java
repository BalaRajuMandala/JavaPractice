package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreams {

	public static void main(String args[]) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("198", "Donald", "OConnell", "50"));
		employeeList.add(new Employee("199", "Douglas", "Grant", "50"));
		employeeList.add(new Employee("200", "Jennifer", "Whalen", "10"));
		employeeList.add(new Employee("201", "Michael", "Hartstein", "20"));
		employeeList.add(new Employee("202", "Pat", "Fay", "20"));
		employeeList.add(new Employee("203", "Susan", "Mavris", "40"));
		employeeList.add(new Employee("204", "Hermann", "Baer", "70"));
		employeeList.add(new Employee("205", "Shelley", "Higgins", "110"));
		employeeList.add(new Employee("206", "William", "Gietz", "110"));
		employeeList.add(new Employee("100", "Steven", "King", "90"));
		employeeList.add(new Employee("101", "Neena", "Kochhar", "90"));
		employeeList.add(new Employee("102", "Lex", "De Haan", "90"));
		employeeList.add(new Employee("103", "Alexander", "Hunold", "60"));
		employeeList.add(new Employee("104", "Bruce", "Ernst", "60"));
		employeeList.add(new Employee("105", "David", "Austin", "60"));
		employeeList.add(new Employee("106", "Valli", "Pataballa", "60"));
		employeeList.add(new Employee("107", "Diana", "Lorentz", "60"));
		employeeList.add(new Employee("108", "Nancy", "Greenberg", "100"));
		employeeList.add(new Employee("109", "Daniel", "Faviet", "100"));
		employeeList.add(new Employee("110", "John", "Chen", "100"));
		employeeList.add(new Employee("111", "Ismael", "Sciarra", "100"));
		employeeList.add(new Employee("112", "Jose", "Manuel", "100"));
		employeeList.add(new Employee("113", "Luis", "Popp", "100"));
		employeeList.add(new Employee("114", "Den", "Raphaely", "30"));
		employeeList.add(new Employee("115", "Alexander", "Khoo", "30"));
		employeeList.add(new Employee("116", "Shelli", "Baida", "30"));
		employeeList.add(new Employee("117", "Sigal", "Tobias", "30"));
		employeeList.add(new Employee("118", "Guy", "Himuro", "30"));
		employeeList.add(new Employee("119", "Karen", "Colmenares", "30"));
		employeeList.add(new Employee("120", "Matthew", "Weiss", "50"));
		employeeList.add(new Employee("121", "Adam", "Fripp", "50"));
		employeeList.add(new Employee("122", "Payam", "Kaufling", "50"));
		employeeList.add(new Employee("123", "Shanta", "Vollman", "50"));
		employeeList.add(new Employee("124", "Kevin", "Mourgos", "50"));
		employeeList.add(new Employee("125", "Julia", "Nayer", "50"));
		employeeList.add(new Employee("126", "Irene", "Mikkilineni", "50"));
		employeeList.add(new Employee("127", "James", "Landry", "50"));
		employeeList.add(new Employee("128", "Steven", "Markle", "50"));
		employeeList.add(new Employee("129", "Laura", "Bissot", "50"));
		employeeList.add(new Employee("130", "Mozhe", "Atkinson", "50"));
		employeeList.add(new Employee("131", "James", "Marlow", "50"));
		employeeList.add(new Employee("132", "TJ", "Olson", "50"));
		employeeList.add(new Employee("133", "Jason", "Mallin", "50"));
		employeeList.add(new Employee("134", "Michael", "More", "50"));
		employeeList.add(new Employee("135", "Ki", "Gee", "50"));
		employeeList.add(new Employee("136", "Hazel", "Philtanker", "50"));
		employeeList.add(new Employee("137", "Renske", "Ladwig", "50"));
		employeeList.add(new Employee("138", "Stephen", "Stiles", "50"));
		employeeList.add(new Employee("139", "John", "Seo", "50"));
		employeeList.add(new Employee("140", "Joshua", "Patel", "50"));

		System.out.println("total number of records : " + employeeList.stream().count());

		Map<String, List<Employee>> result = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentid));

	}
}

class Employee {

	public Employee(String eid, String firstname, String lastname, String departmentid) {
		this.eid = eid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.departmentid = departmentid;
	}

	String eid;
	String firstname;
	String lastname;
	String departmentid;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstname=" + firstname + ", lastname=" + lastname + ", departmentid="
				+ departmentid + "]";
	}
}
