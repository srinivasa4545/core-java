class Hospital {

    static void openHospital() {
        System.out.println("Hospital is Open");
        patientCheckup("Ravi");
    }

    static void patientCheckup(String patientName) {
        System.out.println("Checking Patient: " + patientName);
        int patients = viewPatients();
        System.out.println("Total Patients Today: " + patients);
    }

    static int viewPatients() {
        System.out.println("Viewing Patients List");
        return 120;
    }
}

