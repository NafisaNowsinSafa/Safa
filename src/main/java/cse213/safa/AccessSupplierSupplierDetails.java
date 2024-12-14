package cse213.safa;

public class AccessSupplierSupplierDetails {
    private String name;
    private int contact;
    private String email;
    private int id;
    private String address;

    public AccessSupplierSupplierDetails() {
    }

    public AccessSupplierSupplierDetails(String name, int contact, String email, int id, String address) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "AccessSupplierSupplierDetails{" +
                "name='" + name + '\'' +
                ", contact=" + contact +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
