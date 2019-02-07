public abstract class AbstractEmployee {
    private final int ID;
    private final String name;
    private final String  surname;

    public AbstractEmployee(int ID,String name,String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }
    public abstract void getSalary();
    public abstract void getTax();

}
