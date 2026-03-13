package ro.cts.factoryMethod.model.factory;

import ro.cts.factoryMethod.model.ACourse;
import ro.cts.factoryMethod.model.CursLimbiStraine;

public class CursLimbiStraineFactory implements ICourseFactory{
    @Override
    public ACourse createCourse(String denumire) {
        return new CursLimbiStraine(denumire);
    }
}
