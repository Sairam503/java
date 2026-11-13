package workout.work_nov12;

class Address {
    String city = "Chennai";
}

class Student {
    String name = "Sai";
    Address address = new Address();

    Student deepCopy() {
        Student copy = new Student();

        copy.name = this.name;
        copy.address = new Address();
        copy.address.city = this.address.city;

        return copy;
    }
}

public class deep_copy {
    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = s1.deepCopy();

        s1.address.city = "Bangalore";

        System.out.println(s1.address.city);
        System.out.println(s2.address.city);
    }
}