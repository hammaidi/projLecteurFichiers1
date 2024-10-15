package projLecteurFichiers;

public class FileReaderMain {

    public static void main(String[] args) {

        try {
            LecteurDeFichiers lecteur = new LecteurTxt("path-to-file.txt");
            lecteur.lireFichier();
            lecteur.afficherContenu();
            lecteur.afficherContenuInverse();
            lecteur.afficherContenuPalindromique();
        } catch (Exception e) {
            System.out.println("Erreur dans la lecture du fichier.");  // Message d'erreur
            e.printStackTrace();
        }
    }
}
