class School {

    static void startSchool() {
        System.out.println("School Started");
        attendClass("10th Grade");
    }

    static void attendClass(String className) {
        System.out.println("Attending Class: " + className);
        int students = viewStudents();
        System.out.println("Total Students in Class: " + students);
    }

    static int viewStudents() {
        System.out.println("Viewing Students");
        return 45;
    }
}

