package ToyShop.model;

public class Buyer {

    private int id;
    public int getId() {
        return id;
    }
    private String name;
    public String getName() {
        return name;
    }
    private String surname;
    public String getSurname() {
        return surname;
    }
    private int checkNumber;
    public int getCheckNumber() {
        return checkNumber;
    }
    private int phoneNumber;

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public Buyer(int id, String name, String surname, int checkNumber, int phoneNumber){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.checkNumber = checkNumber;

    }
            @Override
    public String toString() {
        return "\nПокупатель " +
                "№ " + id +
                ", '" + name + '\'' +
                ", '" + surname + '\'' +
                ", чек: " + checkNumber +
                ", телефон: " + phoneNumber;
    }
    
}
