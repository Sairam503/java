package workout.work_nov12;

import com.sun.jdi.PathSearchingVirtualMachine;

class Emp implements Cloneable {
    int id;
    String dept;

    Emp(int id, String dept) {
        this.id = id;
        this.dept = dept;
    }

    // SHALLOW COPY
    protected Emp shallowClone() throws CloneNotSupportedException {
        return (Emp) super.clone();
    }

    // DEEP COPY
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Emp cloned = (Emp) super.clone();
        // Manually clone the nested mutable object

        return cloned;
    }
}
public class oc {
    static void main() {
        Emp emp = new Emp(101,"IT");
    }
}
