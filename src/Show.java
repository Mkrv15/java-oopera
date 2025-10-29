import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors ;


    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }
    public void printListOfActors(){
        System.out.println("'"+title+"', cписок актеров:");
        for (Actor actor : listOfActors) {
            System.out.println( actor.toString());
        }
        System.out.println("-".repeat(20));
    }
    public void addNewActors(Actor newActor){
        for (Actor actor: listOfActors){
            if (newActor.equals(actor)){
                System.out.println("Актер не может быть добавлен. "+newActor+" уже есть в списке актеров.");
                return;
            }
        }
        listOfActors.add(newActor);
        System.out.println(newActor+"  в списке актеров.");
    }
    public void replaceActor(Actor newActor,String surname){
        for (Actor actor : listOfActors) {
            if (surname.equals(actor.getSurname())) {
                listOfActors.remove(actor);
                listOfActors.add(newActor);
                System.out.println(surname + " заменен на " + newActor + ".");
                return;
            }
        }
        System.out.println("Невозможно заменить актера. "+surname+" отсутствует в списке актеров.");

    }
}
