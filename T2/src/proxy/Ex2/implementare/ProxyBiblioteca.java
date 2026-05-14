package proxy.Ex2.implementare;

import java.util.ArrayList;

public class ProxyBiblioteca implements IBiblioteca {
    private IBiblioteca biblioteca;
    private ArrayList<Student> listaStudenti;

    public ProxyBiblioteca(IBiblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.listaStudenti = new ArrayList<>();
    }


    @Override
    public void permiteAcces(Student student) {
        if(!student.isPermisAcces()) {
            System.out.println("Accesul refuzat pentru studentul " + student.getNume() + ". Nu are permis de acces.");
            return;
        }
        listaStudenti.add(student);
        System.out.println("Studentul " + student.getNume() + " a fost adaugat in lista de asteptare pentru acces.");

        if(listaStudenti.size() >= 4) {
            listaStudenti.forEach(student1 -> {
                student1.setEsteEchipat(true);
                System.out.println("Studentul " + student1.getNume() + " este echipat pentru acces.");
                biblioteca.permiteAcces(student1);
            });

            listaStudenti.clear();
        }
    }
}
