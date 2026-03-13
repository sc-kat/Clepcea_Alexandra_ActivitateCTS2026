package ro.cts.factoryMethod.model.factory;

import ro.cts.factoryMethod.model.ACourse;
import ro.cts.factoryMethod.model.CursDesignGrafic;

public class CursDesignGraficFactory implements ICourseFactory{
    @Override
    public ACourse createCourse(String denumire) {
        return new CursDesignGrafic(denumire);
    }
}
