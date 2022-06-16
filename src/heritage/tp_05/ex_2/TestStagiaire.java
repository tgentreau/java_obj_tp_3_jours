package heritage.tp_05.ex_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestStagiaire {
    public static void main(String[] args) throws IOException {
        List<Stagiaire> stagiaires = new ArrayList<>();
        Stagiaire stagiaire = new Stagiaire("Gentreau", "Thomas", Matiere.JAVA, "10/06/2022", 15, "Bien");
        Stagiaire stagiaire2 = new Stagiaire("Marcel", "Roger", Matiere.JAVA, "25/05/2022", 11.5f, "Moyen");
        Stagiaire stagiaire3 = new Stagiaire("Gentreau", "Thomas", Matiere.ANGULAR, "05/05/2022", 18, "Très bien");
        stagiaires.add(stagiaire);
        stagiaires.add(stagiaire2);
        stagiaires.add(stagiaire3);

        Path path = Paths.get("src/heritage/tp_05/ex_2/stagiaire.txt");
        Path pathDestination = Paths.get("src/heritage/tp_05/ex_2/stagiaires.txt");
        Files.deleteIfExists(pathDestination);
        Files.write(pathDestination, "".getBytes());
        for (Stagiaire ceStagiaire : stagiaires) {
            StringBuilder sb = new StringBuilder();
            sb
                 .append("\n")
                 .append(ceStagiaire.getNom())
                 .append(" ")
                 .append(ceStagiaire.getPrenom())
                 .append(" ")
                 .append(ceStagiaire.getMatiere())
                 .append(" ")
                 .append(ceStagiaire.getDateEvaluation())
                 .append(" ")
                 .append(ceStagiaire.getNoteEvaluation())
                 .append(" ")
                 .append(ceStagiaire.getCommentaire());
            Files.writeString(pathDestination, sb, StandardOpenOption.APPEND);
        }
//        "\n" + ceStagiaire.getNom() + " - " + ceStagiaire.getPrenom() + " - " + ceStagiaire.getMatiere() + " - " + ceStagiaire.getDateEvaluation() + " - " + ceStagiaire.getNoteEvaluation() + " - " + ceStagiaire.getCommentaire()
    }
}
