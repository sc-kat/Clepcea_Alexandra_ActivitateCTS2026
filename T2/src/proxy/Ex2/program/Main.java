package proxy.Ex2.program;

import proxy.Ex2.implementare.Biblioteca;
import proxy.Ex2.implementare.IBiblioteca;
import proxy.Ex2.implementare.ProxyBiblioteca;
import proxy.Ex2.implementare.Student;

public class Main {
    public static void main(String[] args) {
        IBiblioteca biblioteca = new ProxyBiblioteca(new Biblioteca());

        Student student = new Student("Ion", true);
        Student student2 = new Student("Ion2", true);
        Student student3 = new Student("Ion3", true);
        Student student4 = new Student("Ion4", true);

        biblioteca.permiteAcces(student);
        biblioteca.permiteAcces(student2);
        biblioteca.permiteAcces(student3);
        biblioteca.permiteAcces(student4);
    }
}
