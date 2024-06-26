import java.util.Objects;

public class Player {
    protected int id;
    protected String name;
    protected int strength;

    public Player(int id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && strength == player.strength && name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, strength);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getStrength() {

        return strength;
    }
}

