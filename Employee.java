public class Employee {
    int EmployeeId = 12345;
    String EmployeeName = "Kavita";
    String EmployeeAddress = "Dehradun";


    public void Trainning(){
        System.out.println(EmployeeName  + " is learning Java");
    }

    public void showInfo() {
        System.out.println("My name is " + EmployeeName);
        System.out.println("My id is " + EmployeeId);
        System.out.println("My city is " + EmployeeAddress);
    }
    

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.Trainning();
        obj.showInfo();
    }

    
}

