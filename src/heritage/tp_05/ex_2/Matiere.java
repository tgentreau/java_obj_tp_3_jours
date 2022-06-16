package heritage.tp_05.ex_2;

public enum Matiere {
    JAVA("Java"),
    JAVASCRIPT("Javascript"),
    HTML("HTML"),
    CSS("CSS"),
    ANGULAR("Angular"),
    SPRING("Spring");

    private String libelle;

    Matiere(String libelle) {
        this.libelle = libelle;
    }

}
