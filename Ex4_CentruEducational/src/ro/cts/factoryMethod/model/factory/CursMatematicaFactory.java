package ro.cts.factoryMethod.model.factory;

import ro.cts.factoryMethod.model.ACourse;
import ro.cts.factoryMethod.model.CursMatematica;

public class CursMatematicaFactory implements ICourseFactory{
    @Override
    public ACourse createCourse(String denumire) {
        return new CursMatematica(denumire);
    }
}
