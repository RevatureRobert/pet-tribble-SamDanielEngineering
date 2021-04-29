package Models;

public class Tribble {
    public int id;
    public String name;

    public Tribble() {
        this.id = 0;
        this.name = "";
    }

    public Tribble(int id, String name){
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Tribble{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
