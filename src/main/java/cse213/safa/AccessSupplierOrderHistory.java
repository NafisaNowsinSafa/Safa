package cse213.safa;

public class AccessSupplierOrderHistory {
    private String name;
    private int orderId;
    private String email;
    private String address;
    private int contact;

    public AccessSupplierOrderHistory() {
    }

    public AccessSupplierOrderHistory(String name, int orderId, String email, String address, int contact) {
        this.name = name;
        this.orderId = orderId;
        this.email = email;
        this.address = address;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "AccessSupplierOrderHistory{" +
                "name='" + name + '\'' +
                ", orderId=" + orderId +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                '}';
    }
}
