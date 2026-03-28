class College{

    public static void main(String[] args) {

        String collegeName;
        int totalStudents;
        char collegeGrade;
        boolean isGovernment;
        int collegeId;

        collegeName = "ABC College";
        totalStudents = 1200;
        collegeGrade = 'A';
        isGovernment = true;
        collegeId = 201;

        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("College Grade: " + collegeGrade);
        System.out.println("Government College: " + isGovernment);
        System.out.println("College ID: " + collegeId);

        collegeName = "XYZ College";
        totalStudents = 900;
        collegeGrade = 'B';
        isGovernment = false;
        collegeId = 202;

        System.out.println("---- After Changing Values ----");

        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("College Grade: " + collegeGrade);
        System.out.println("Government College: " + isGovernment);
        System.out.println("College ID: " + collegeId);
    }
}