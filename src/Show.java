
import java.util.ArrayList;


public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printDirector() {
        System.out.println("Режиссер пьесы '" + title + "':");
        System.out.println(director.toString());
    }

    public void printListOfActors() {
        System.out.println("'" + title + "', cписок актеров:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
        System.out.println("-".repeat(20));
    }

    public void addNewActors(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Актер не может быть добавлен. " + newActor + " уже есть в списке актеров.");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println(newActor + "  в списке актеров.");
    }

    public void replaceActor(Actor newActor, String surname) {
        int countActor = 0;
        Actor oldActor = null;
        for (Actor actor : listOfActors) {
            if (surname.equals(actor.getSurname())) {
                countActor++;
                oldActor = actor;
            }
        }
        if (countActor > 1) {
            System.out.println("Невозможно заменить актера. В списке актеров несколько человек с указанной фамилией.");
        } else if (countActor < 1) {
            System.out.println("Невозможно заменить актера. " + surname + " отсутствует в списке актеров.");
        } else {
            listOfActors.remove(oldActor);
            listOfActors.add(newActor);
            System.out.println(surname + " заменен на " + newActor + ".");
        }

    }
}
