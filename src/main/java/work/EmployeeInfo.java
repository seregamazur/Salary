package work;

import java.io.Serializable;

public class EmployeeInfo implements Serializable {

    public int getID() {
        return ID;
    }

    private final int ID;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private final String name;
    private final String surname;


    public EmployeeInfo(int ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }

}
