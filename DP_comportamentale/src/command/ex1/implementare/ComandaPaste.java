package command.ex1.implementare;

public class ComandaPaste implements IComanda {
    private String numePaste;
    private Bucatar bucatar;

    public ComandaPaste(String numePaste, Bucatar bucatar) {
        this.numePaste = numePaste;
        this.bucatar = bucatar;
    }

    @Override
    public void prelucreaza() {
        this.bucatar.gatestePaste(numePaste);
    }
}
