package be.ehb.multec.client;

public class Client {
    private int id;
    private String name;
    private String lastname;
    private String address;
    private String number;

    public Client( String name, String lastname, String address, String number ) {
        this(-1, name, lastname, address, number);
    }

    public Client( int id, String name, String lastname, String address, String number ) {
        if( name == null || name.trim().length() == 0 ) throw new IllegalArgumentException("client's name cannot be blank");
        if( lastname == null || lastname.trim().length() == 0 ) throw new IllegalArgumentException("client's lastname cannot be blank");

        this.id = id;
        this.name = name;
        this.lastname = lastname;
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
        return "Client: " + name + " " + lastname;
    }

    public String getClientInfo() {
        return getFullName() + ", " + address + ", " + number;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
