package heritage.tp_05.ex_2;

import java.time.LocalDate;

public class Stagiaire {
    private String nom;
    private String prenom;
    private Matiere matiere;
    private String dateEvaluation;
    private float noteEvaluation;
    private String commentaire;

    public Stagiaire(String nom, String prenom, Matiere matiere, String dateEvaluation, float noteEvaluation, String commentaire) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.matiere = matiere;
        this.setDateEvaluation(dateEvaluation);
        this.setNoteEvaluation(noteEvaluation);
        this.setCommentaire(commentaire);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(String dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public float getNoteEvaluation() {
        return noteEvaluation;
    }

    public void setNoteEvaluation(float noteEvaluation) {
        this.noteEvaluation = noteEvaluation;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stagiaire{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", prenom='").append(prenom).append('\'');
        sb.append(", matiere='").append(matiere).append('\'');
        sb.append(", dateEvaluation=").append(dateEvaluation);
        sb.append(", noteEvaluation=").append(noteEvaluation);
        sb.append(", commentaire='").append(commentaire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
