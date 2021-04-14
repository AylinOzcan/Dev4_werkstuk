package be.ehb.multec.model;
import be.ehb.multec.data.Target;

public class Client implements Target {
    private int id;
    private String name;
    private String lastname;
    //maybe age isn't necessary
    private int age;
    private String address;
    private int number;

    public Client() {
    }

    public Client( String name, String lastname, int age, String address, int number ) {
        this(-1, name, lastname, age, address, number);
    }

    public Client( int id, String name, String lastname, int age, String address, int number ) {
        if( name == null || name.trim().length() == 0 ) throw new IllegalArgumentException("client's name cannot be blank");
        if( lastname == null || lastname.trim().length() == 0 ) throw new IllegalArgumentException("client's lastname cannot be blank");

        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.number = number;
    }



    public int getId() {
        return id;
    }

    public void setId( int id ) {
        if( this.id == -1 ){
            this.id = id;
        }
    }

    public String getFullName() {
        String res = name + " " + lastname;
        return res;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public String getClientInfo() {
        String res = getFullName() + '\n' + address + '\n' + number;
        return res;
    }

    @Override
    public void request() {
        System.out.println("behavior performed 1.0");
    }
}
