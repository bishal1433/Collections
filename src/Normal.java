import java.util.Objects;

public class Normal {
    private int id;
    private String name;

    public Normal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Normal normal = (Normal) o;
        return id == normal.id && Objects.equals(name, normal.name);
    }


    public int getId(){
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
