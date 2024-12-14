package cse213.safa.user6;

public class ReportProductionDefects {
    private String name;
    private int id;
    private String comment;

    public ReportProductionDefects() {
    }

    public ReportProductionDefects(String name, int id, String comment) {
        this.name = name;
        this.id = id;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ReportProductionDefects{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", comment='" + comment + '\'' +
                '}';
    }
}
