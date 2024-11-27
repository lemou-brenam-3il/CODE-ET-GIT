public class GestionnaireNotes {

    /**
     * Affiche les notes d'un étudiant ainsi que la moyenne calculée.
     * 
     * @param nomEtudiant Le nom de l'étudiant dont les notes sont affichées.
     * @param notes Un tableau contenant les notes de l'étudiant.
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        // Vérification de la validité du tableau de notes
        if (notes == null || notes.length == 0) {
            System.out.println("Aucune note disponible pour l'étudiant " + nomEtudiant + ".");
            return;
        }

        // Affichage des notes de l'étudiant
        afficherNotes(nomEtudiant, notes);

        // Calcul et affichage de la moyenne des notes
        double moyenne = calculerMoyenne(notes);
        double moyenne = calculerMoyenne(notes);

        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * Affiche les notes d'un étudiant.
     * 
     * @param nomEtudiant Le nom de l'étudiant.
     * @param notes Un tableau contenant les notes de l'étudiant.
     */
    private void afficherNotes(String nomEtudiant, int[] notes) {
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    /**
     * Calcule la moyenne des notes données.
     * 
     * @param notes Un tableau contenant les notes.
     * @return La moyenne des notes.
     */
    private double calculerMoyenne(int[] notes) {
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }
        return (double) somme / notes.length;
    }
}
