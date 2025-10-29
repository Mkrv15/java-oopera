public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван","Борисов",Gender.MALE,185);
        Actor actor2 = new Actor("Илья","Шабельников",Gender.MALE,177);
        Actor actor3 = new Actor("Ольга","Пересильд",Gender.FEMALE,160);

        Director director1 = new Director("Олег","Пирожков",Gender.MALE,3);
        Director director2 = new Director("Евгений","Бондарчук",Gender.MALE,15);

        Person musicAuthor = new Person("Дмитрий", "Шостакович",Gender.MALE);
        Person choreographer = new Person("Алла", "Сигалова",Gender.FEMALE);

        Show show = new Show("Вот так и живем!",110,director1);

        Ballet ballet = new Ballet("Щелкунчик",134,director2,musicAuthor," Действие I\n" +
                "Дети доктора Штальбаума, Мари и Фриц, как и другие дети, с нетерпением ждут подарков." +
                " Последний из гостей — Дроссельмейер. Его способность оживлять игрушки не только забавляет " +
                "детей, но и пугает их. Дроссельмейер снимает маску. Мари и Фриц узнают своего любимого крёстного." +
                " Мари хочет поиграть с куклами, но с огорчением узнаёт, что они все убраны.",choreographer);

        Opera opera = new Opera("Кармэн",160,director2,musicAuthor,"Действие первое\n" +
                "В Севилье, возле табачной фабрики, остановился драгунский эскадрон. Солдаты любуются красивыми" +
                " девушками — работницами фабрики и прохожими. В поисках драгуна Хозе появляется Микаэла," +
                " но солдат Моралес говорит ей, что Хозе в другом эскадроне, который скоро придёт к ним на смену," +
                " и предлагает вместе провести время. Микаэла отказывается и уходит (сцена «Sur la place, chacun" +
                " passe»). Вскоре происходит смена эскадрона, появляется Дон Хозе, которого" +
                " встречает хор мальчиков. ",15);

        show.addNewActors(actor1);
        show.addNewActors(actor3);

        ballet.addNewActors(actor2);
        ballet.addNewActors(actor3);
        ballet.addNewActors(actor1);

        opera.addNewActors(actor2);
        opera.addNewActors(actor3);

        show.printListOfActors();
        ballet.printListOfActors();
        opera.printListOfActors();

        show.replaceActor(actor2,"Борисов");
        show.printListOfActors();

        ballet.replaceActor(actor2,"Безруков");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
