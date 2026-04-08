class Company {

    static void startWork() {
        System.out.println("Company Work Started");
        employeeLogin("Srinivasa");
    }

    static void employeeLogin(String empName) {
        System.out.println("Employee Login: " + empName);
        int tasks = viewTasks();
        System.out.println("Total Tasks Assigned: " + tasks);
    }

    static int viewTasks() {
        System.out.println("Viewing Tasks");
        return 20;
    }
}
