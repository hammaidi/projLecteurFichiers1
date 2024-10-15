package projLecteurFichiers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecteurTxt extends LecteurFichierAbstrait {

    public LecteurTxt(String chemin) {
        super(chemin);
    }

    @Override
    public void lireFichier() {
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
