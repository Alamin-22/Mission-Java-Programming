package SimpleProject;

import java.util.Scanner;

public class HospitalManagement {

    public static class Doctor {
        private int id;
        private String name;
        private String specialty;
        private double fee;

        private static int idCounter = 1;

        public Doctor(String name, String specialty, double fee) {

            this.id = idCounter;
            idCounter++;
            this.name = name;
            this.specialty = specialty;
            this.fee = fee;

        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSpecialty() {
            return specialty;
        }

        public double getFee() {
            return fee;
        }

        public void setFee(double fee) {
            if (fee > 0) {
                this.fee = fee;
            } else {
                System.out.println("You can not enter Negative values");
            }
        }

        public void getFullDetails() {
            System.out.println("Doc Name is => " + this.name);
            System.out.println("His ID is => " + this.id);
            System.out.println("His Strength is => " + this.specialty);
            System.out.println("Fee is  => " + this.fee);
        }
    }

    public static class Patient {

        private int id;
        private String name;
        private int age;
        private String gender;
        private String disease;
        private static int patientIdCounter = 1;

        Patient(String name, int age, String gender, String disease) {
            this.id = patientIdCounter;
            patientIdCounter++;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.disease = disease;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String getGender() {
            return this.gender;
        }

        public String getDisease() {
            return this.disease;
        }

        public void getFullPatientDetails() {
            System.out.println("Patient Name is => " + this.name);
            System.out.println("Patient ID is => " + this.id);
            System.out.println("Patient Age is  => " + this.age);
            System.out.println("Gender of Patent is  => " + this.gender);
            System.out.println("Patient is affected by  => " + this.disease);
        }

    }

    // just like int[] arr = new int[5] on this case we are creating an array of
    // object so the Doctor itself is type of that object
    static Doctor[] doctors = new Doctor[10];
    static Patient[] patients = new Patient[10];

    static int docCount = 0;
    static int patCount = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {

            System.out.println(" \n Welcome Hospital Management Dashboard \n");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. View Doctors");
            System.out.println("4. View Patients");
            System.out.println("5. Exit");
            System.out.print("Choose an option by entering number as shown on instruction =>  ");
            int choice;

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (docCount >= 10) {
                        System.out.println("Memory Full. Can not add more than 10 Doctors \n");

                        break;
                    }

                    System.out.print("Enter Doctor name => ");
                    String docName;
                    docName = scanner.nextLine();
                    System.out.print("Enter Doctor Specialty => ");
                    String docSpecialty;
                    docSpecialty = scanner.nextLine();

                    System.out.print("Enter Doctor Specialty => ");
                    int docFee;
                    docFee = scanner.nextInt();

                    Doctor doc = new Doctor(docName, docSpecialty, docFee);
                    doctors[docCount] = doc;
                    docCount++;

                    System.out.println(docName + " added as a Doctor ");
                    break;

                case 2:

                    if (patCount >= 10) {
                        System.out.println("Memory Full. Can not add more than 10 Patients");
                        break;
                    }

                    System.out.print("Enter Patient name => ");
                    String patName;
                    patName = scanner.nextLine();
                    System.out.print("Enter Patient Age => ");
                    int patAge;
                    patAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Gender => ");
                    String patGender;
                    patGender = scanner.nextLine();

                    System.out.print("Enter Patient Disease => ");
                    String patDisease;
                    patDisease = scanner.nextLine();

                    Patient patient = new Patient(patName, patAge, patGender, patDisease);
                    patients[patCount] = patient;
                    patCount++;

                    System.out.println(patient + " is admitted for  " + patDisease);
                    break;

                case 3:
                    if (docCount == 0) {
                        System.out.println(" \n No Doctor joined Yet!! \n ");
                        break;
                    }
                    System.out.println("Here is the Doctors List we have");
                    for (int i = 0; i < docCount; i++) {
                        doctors[i].getFullDetails();
                    }
                    System.out.println("Thanks No more data Available at this moment");
                    break;

                case 4:

                    if (patCount == 0) {
                        System.out.println("\n" + " No patient Admitted Yet!! \n");
                        break;
                    }

                    System.out.println("Here is the Patient List we have");
                    for (int i = 0; i < patCount; i++) {
                        patients[i].getFullPatientDetails();
                    }
                    System.out.println("Thanks No more data Available at this moment");
                    break;

                case 5:
                    isRunning = false;

            }
        }

    }

}