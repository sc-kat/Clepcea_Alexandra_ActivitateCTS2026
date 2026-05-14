package proxy.Ex2.implementare;

public class Biblioteca implements IBiblioteca {


    @Override
    public void permiteAcces(Student student) {
        System.out.println("Accesul permis in biblioteca studentului " + student.getNume());
    }
}
