class College {

    static void startCollege() {
        System.out.println("College Started");
        attendLecture("Computer Science");
    }

    static void attendLecture(String subject) {
        System.out.println("Attending Lecture: " + subject);
        int students = viewStudents();
        System.out.println("Total Students in Lecture: " + students);
    }

    static int viewStudents() {
        System.out.println("Viewing Students");
        return 60;
    }
}

