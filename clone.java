package workout.work_nov12;
//Object Cloning in Java

class s implements Cloneable {
    String name;
    int rollno;

    s(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
    public class clone {
        static void main() {

            try {
                s s1 = new s("Sai", 101);
                s s2 = (s)s1.clone();
                System.out.println(s1.rollno+" "+s1.name);
                System.out.println(s2.rollno+" "+s2.name);
            } catch (CloneNotSupportedException c) {
                System.out.println(c.getMessage());

            }
        }
    }
