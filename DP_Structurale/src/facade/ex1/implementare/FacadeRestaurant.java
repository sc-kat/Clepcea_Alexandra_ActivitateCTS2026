package facade.ex1.implementare;

public class FacadeRestaurant {
    private ColectieOspatari colectieOspatari = new ColectieOspatari();
    private ColectieBucatari colectieBucatari = new ColectieBucatari();

    public void addBucatar(Bucatar bucatar) {
        colectieBucatari.addBucatar(bucatar);
    }

    public void addOspatar(Ospatar ospatar) {
        colectieOspatari.addOspatar(ospatar);
    }

    public boolean verificaDisponibilitateRestData(String data, int nrPersoane) {

        int nrOspatariLiberi = colectieOspatari.getOspatariLiber(data);
        int nrBucatariLiberi = colectieBucatari.getBucatariLiberi(data);

        if (nrOspatariLiberi >= nrPersoane / 5 && nrBucatariLiberi >= nrPersoane / 20) {
            return true;
        }
        return false;
    }
}
