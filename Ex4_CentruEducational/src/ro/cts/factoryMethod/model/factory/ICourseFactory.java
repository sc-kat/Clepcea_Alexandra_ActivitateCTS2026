package ro.cts.factoryMethod.model.factory;

import ro.cts.factoryMethod.model.ACourse;

public interface ICourseFactory {
    ACourse createCourse(String denumire);
}
