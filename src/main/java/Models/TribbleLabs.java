package Models;

public class TribbleLabs {
    public int id;
    public String name;

    public TribbleLabs() {
        this.id = 0;
        this.name = "";
    }

    public TribbleLabs(int id, String name){
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
        return "TribbleLabs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
