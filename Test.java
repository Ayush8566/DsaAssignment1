import java.util.Scanner;
import java.util.Arrays;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        // Create an employee database
	        Employee[] employees = new Employee[500];
	        // Initialize employees with sample data (you can modify it with your own data)
	        for (int i = 0; i < 500; i++) {
	            String name = "Employee " + (i + 1);
	            int empId = i + 1;
	            double salary = Math.random() * 500000 + 100000; // Random salary between 100000 and 600000
	            Date hireDate = new Date((int) (Math.random() * 31 + 1), (int) (Math.random() * 12 + 1), 2023);
	            String jobPosition = "Manager"; // Sample job position
	            String contactNumber = "+1-1234567890"; // Sample contact number
	            Address address = new Address("Street " + (i + 1), "City", "State", "Country"); // Sample address
	            employees[i] = new Employee(name, empId, salary, hireDate, jobPosition, contactNumber, address);
	        }

	        // Arrange employees by salary in descending order
	        arrangeEmployeeBySalary(employees);

	        // Display employees whose jobPosition is manager
	        getEmployeesByJobPosition(employees, "Manager");

	        // Display employees whose hireDate is between 01-04-2022 to 31-03-2023
	        Date startDate = new Date(1, 4, 2022);
	        Date endDate = new Date(31, 3, 2023);
	        getEmployeesByHireDate(employees, startDate, endDate);

	        // Find the number of foreign employees
	        int foreignEmployeeCount = foreignEmployeeCount(employees);
	        System.out.println("Number of foreign employees: " + foreignEmployeeCount);

	        // Display employees whose salary is in the range 150000 INR to 300000 INR
	        getEmployeesBySalary(employees, 150000, 300000);
	    }

	    private static void getEmployeesBySalary(Employee[] employees, int i, int j) {
	    }

	    private static int foreignEmployeeCount(Employee[] employees) {
	        return 0;
	    }

	    public static void arrangeEmployeeBySalary(Employee[] employees) {
	        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
	        System.out.println("Employees arranged by salary (descending order):");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
	    }

	    public static void getEmployeesByJobPosition(Employee[] employees, String jobPosition) {
	        System.out.println("Employees with job position: " + jobPosition);
	        for (Employee employee : employees) {
	            if (employee.getJobPosition().equals(jobPosition)) {
	                System.out.println(employee);
	            }
	        }
	    }

	    public static void getEmployeesByHireDate(Employee[] employees, Date startDate, Date endDate) {
	        System.out.println("Employees hired between " + startDate + " and " + endDate + ":");
	        for (Employee employee : employees) {
	            Date hireDate = employee.getHireDate();
	            if (isBetweenDates(hireDate, startDate, endDate)) {
	                System.out.println(employee);
	            }
	        }
	    }
	    private static boolean isBetweenDates(Date date, Date startDate, Date endDate) {
	        if (date.getYear() > startDate.getYear() && date.getYear() < endDate.getYear()) {
	            return true;
	        } else if (date.getYear() == startDate.getYear() && date.getYear() == endDate.getYear()) {
	            if (date.getMonth() > startDate.getMonth() && date.getMonth() < endDate.getMonth()) {
	                return true;
	            } else if (date.getMonth() == startDate.getMonth() && date.getMonth() == endDate.getMonth()) {
	                if (date.getDay() >= startDate.getDay() && date.getDay() <= endDate.getDay()) {
	                    return true;
	                }
	            } else if (date.getMonth() == startDate.getMonth()) {
	                if (date.getDay() >= startDate.getDay()) {
	                    return true;
	                }
	            } else if (date.getMonth() == endDate.getMonth()) {
	                if (date.getDay() <= endDate.getDay()) {
	                    return true;
	                }
	            }
	        } else if (date.getYear() == startDate.getYear()) {
	            if (date.getMonth() > startDate.getMonth()) {
	                return true;
	            } else if (date.getMonth() == startDate.getMonth()) {
	                if (date.getDay() >= startDate.getDay()) {
	                    return true;
	                }
	            }
	        } else if (date.getYear() == endDate.getYear()) {
	            if (date.getMonth() < endDate.getMonth()) {
	                return true;
	            } else if (date.getMonth() == endDate.getMonth()) {
	                if (date.getDay() <= endDate.getDay()) {
	                    return true;
	                }
	            }
	        }
	    
	        return false;
	    }
	

	}


 class Employee {
	 private String name;
	    private int empId;
	    private double salary;
	    private Date hireDate;
	    private String jobPosition;
	    private String contactNumber;
	    private Address address;

	    public Employee(String name, int empId, double salary, Date hireDate, String jobPosition,
	                    String contactNumber, Address address) {
	        this.name = name;
	        this.empId = empId;
	        this.salary = salary;
	        this.hireDate = hireDate;
	        this.jobPosition = jobPosition;
	        this.contactNumber = contactNumber;
	        this.address = address;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public Date getHireDate() {
	        return hireDate;
	    }

	    public String getJobPosition() {
	        return jobPosition;
	    }

	    public String getContactNumber() {
	        return contactNumber;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "name='" + name + '\'' +
	                ", empId=" + empId +
	                ", salary=" + salary +
	                ", hireDate=" + hireDate +
	                ", jobPosition='" + jobPosition + '\'' +
	                ", contactNumber='" + contactNumber + '\'' +
	                ", address=" + address +
	                '}';
	    }
	}

	class Date {
	    private int day;
	    private int month;
	    private int year;

	    public Date(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    public int getDay() {
	        return day;
	    }

	    public int getMonth() {
	        return month;
	    }

	    public int getYear() {
	        return year;
	    }

	    @Override
	    public String toString() {
	        return day + "-" + month + "-" + year;
	    }
	}

	class Address {
	    private String street;
	    private String city;
	    private String state;
	    private String country;

	    public Address(String street, String city, String state, String country) {
	        this.street = street;
	        this.city = city;
	        this.state = state;
	        this.country = country;
	    }

	    public String getStreet() {
	        return street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getState() {
	        return state;
	    }

	    public String getCountry() {
	        return country;
	    }

	    @Override
	    public String toString() {
	        return street + ", " + city + ", " + state + ", " + country;
	    }
	}
	