package projLecteurFichiers;

public abstract class LecteurFichierAbstrait implements LecteurDeFichiers {
    protected String cheminFichier;

    public LecteurFichierAbstrait(String chemin) {
        this.cheminFichier = chemin;
    }

    @Override
    public abstract void lireFichier();

    @Override
    public void afficherContenu() {
        System.out.println("Affichage du contenu du fichier.");

    }

    @Override
    public void afficherContenuInverse() {
        System.out.println("Affichage du contenu du fichier à l'envers.");
        // Logique pour inverser le contenu
    }

    @Override
    public void afficherContenuPalindromique() {
        System.out.println("Affichage du contenu du fichier en mode palindromique.");
        // pour afficher palindromique
    }
}
