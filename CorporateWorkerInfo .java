class CorporateWorker {

    public static void main(String[] args) {

        String empName;
        double salary;
        char grade;
        boolean isPermanent;
        int empId;

        empName = "Rahul";
        salary = 55000.60;
        grade = 'A';
        isPermanent = true;
        empId = 401;

        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Employee ID: " + empId);
        empName = "Priya";
        salary = 63000.40;
        grade = 'B';
        isPermanent = false;
        empId = 402;
        
        System.out.println("---- After Changing Values ----");

        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Employee ID: " + empId);
    }
}