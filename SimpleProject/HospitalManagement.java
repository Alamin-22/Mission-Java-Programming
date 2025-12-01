package SimpleProject;

public class HospitalManagement {

    public class Doctor {
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

    public static void main(String[] args) {

    }

}