import java.util.Objects;

public class Actor extends Person {

    protected int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }


    @Override
    public String toString() {
        return super.toString() + " (" + height + ")";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return (Objects.equals(otherActor.name, name) && Objects.equals(otherActor.surname, surname)
                && Objects.equals(otherActor.gender, gender));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender) * 31;
    }
}

