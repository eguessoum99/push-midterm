package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo employee1=new EmployeeInfo("Hamza",005);


		employee1.setDateOfBirth("(04/03/1999)");
		employee1.setSsn("087-45-1354");
		employee1.setSalary(120000);
		employee1.setPhoneNumber("347-876-456");
		employee1.setDepartment("Accounting");
		employee1.employeeId();
	}

}