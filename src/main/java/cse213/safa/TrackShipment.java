package cse213.safa;

public class TrackShipment {

    private String name;
    private int id;
    private int time;
    private int date;

    public TrackShipment() {
    }

    public TrackShipment(String name, int id, int time, int date) {
        this.name = name;
        this.id = id;
        this.time = time;
        this.date = date;
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TrackShipment{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", time=" + time +
                ", date=" + date +
                '}';
    }
}
