package cse213.safa;

public class MaintainSupplierRelationship {
    private String name;
    private String description;
    private String schedule;
    private int date;

    public MaintainSupplierRelationship() {
    }

    public MaintainSupplierRelationship(String name, String description, String schedule, int date) {
        this.name = name;
        this.description = description;
        this.schedule = schedule;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MaintainSupplierRelationship{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", schedule='" + schedule + '\'' +
                ", date=" + date +
                '}';
    }
}
