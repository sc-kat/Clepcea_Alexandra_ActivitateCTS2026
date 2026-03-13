package ro.cts.factoryMethod.model;

import ro.cts.factoryMethod.model.factory.CursMatematicaFactory;
import ro.cts.factoryMethod.model.factory.CursProgramareFactory;
import ro.cts.factoryMethod.model.factory.ICourseFactory;

public class Main {
    public static void main(String[] args) {
        ICourseFactory creatorCursMatematica = new CursMatematicaFactory();
        ICourseFactory creatorCursProgramare = new CursProgramareFactory();

       ACourse curs1 = creatorCursMatematica.createCourse("Matematica 1");
       ACourse curs2 = creatorCursProgramare.createCourse("Java");

        System.out.println("Curs 1: " + curs1);
        System.out.println("Curs 2: " + curs2);
    }

}
