public class Programme14_Person {

        String firstname, lastname;
        int age;

        public static void main(String[] args) {
            Programme14_Person programme14Person = new Programme14_Person();
            programme14Person.setFirstName(""); // firstName is set to empty string
            programme14Person.setLastName(""); // lastName is set to empty string
            programme14Person.setAge(10);
            System.out.println("fullName= " + programme14Person.getFullName());
            System.out.println("teen= " + programme14Person.isTeen());
            programme14Person.setFirstName("John"); // firstName is set to John
            programme14Person.setAge(18);
            System.out.println("fullName= " + programme14Person.getFullName());
            System.out.println("teen= " + programme14Person.isTeen());
            programme14Person.setLastName("Smith"); // lastName is set to Smith
            System.out.println("fullName= " + programme14Person.getFullName());

        }

        public String getFirstName() {
            return firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public int getAge() {
            return age;
        }

        public void setFirstName(String firstname) {
            this.firstname = firstname;
        }

        public void setLastName(String lastname) {
            this.lastname = lastname;
        }

        public void setAge(int age) {
            if (age > 0 && age <= 100) {
                this.age = age;
            } else {
                this.age = 0;
            }

        }

        public boolean isTeen() {
            if (age > 12 && age < 20) {
                return true;
            } else {
                return false;
            }
        }

        public String getFullName() {
            if (firstname.isEmpty() && lastname.isEmpty()) {
                return "";
            } else if (firstname.isEmpty()) {
                return lastname;
            } else if (lastname.isEmpty()) {
                return firstname;
            } else {
                return firstname + "" + lastname;
            }
        }
    }



