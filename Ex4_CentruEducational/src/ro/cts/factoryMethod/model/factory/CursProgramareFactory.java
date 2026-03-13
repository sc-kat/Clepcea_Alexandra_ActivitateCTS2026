package ro.cts.factoryMethod.model.factory;

import ro.cts.factoryMethod.model.ACourse;
import ro.cts.factoryMethod.model.CursProgramare;

public class CursProgramareFactory implements ICourseFactory {
    @Override
    public ACourse createCourse(String denumire) {
        return new CursProgramare(denumire);
    }
}
