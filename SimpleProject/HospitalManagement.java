package SimpleProject;

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

        public void getFullDetails() {
            System.out.println("Patient Name is => " + this.name);
            System.out.println("Patient ID is => " + this.id);
            System.out.println("Patient Age is  => " + this.age);
            System.out.println("Gender of Patent is  => " + this.gender);
            System.out.println("Patient is affected by  => " + this.disease);
        }

    }

    public static void main(String[] args) {

    }

}