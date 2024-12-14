package cse213.safa;

public class InvoiceAndpayment {
    private int id;
    private String name;
    private String amount;
    private String details;

    public InvoiceAndpayment() {
    }

    public InvoiceAndpayment(int id, String name, String amount, String details) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "InvoiceAndpayment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
