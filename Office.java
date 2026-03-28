class OfficeIn{

    public static void main(String[] args) {

        String officeName;
        double monthlyExpense;
        char officeGrade;
        boolean isHeadOffice;
        int officeId;

        officeName = "Tech Solutions";
        monthlyExpense = 75000.50;
        officeGrade = 'A';
        isHeadOffice = true;
        officeId = 601;

        System.out.println("Office Name: " + officeName);
        System.out.println("Monthly Expense: " + monthlyExpense);
        System.out.println("Office Grade: " + officeGrade);
        System.out.println("Head Office: " + isHeadOffice);
        System.out.println("Office ID: " + officeId);

        officeName = "Branch Office";
        monthlyExpense = 42000.75;
        officeGrade = 'B';
        isHeadOffice = false;
        officeId = 602;

        System.out.println("---- After Changing Values ----");

        System.out.println("Office Name: " + officeName);
        System.out.println("Monthly Expense: " + monthlyExpense);
        System.out.println("Office Grade: " + officeGrade);
        System.out.println("Head Office: " + isHeadOffice);
        System.out.println("Office ID: " + officeId);
    }
}