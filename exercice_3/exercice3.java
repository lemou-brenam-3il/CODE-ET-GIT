public class StockManager {

    private int stock;

    // Constructeur pour initialiser le stock
    public StockManager(int stockInitial) {
        this.stock = stockInitial;
    }

    /**
     * Gère le stock en fonction du type d'opération (ajout ou retrait).
     * 
     * @param typeOperation Type d'opération à effectuer ("ajout" ou "retrait").
     * @param produit Le nom du produit concerné.
     * @param quantite La quantité à ajouter ou à retirer du stock.
     */
    public void gererStock(String typeOperation, String produit, int quantite) {
        switch (typeOperation) {
            case "ajout":
                ajouterStock(produit, quantite);
                break;
            case "retrait":
                retirerStock(produit, quantite);
                break;
            default:
                System.out.println("Opération inconnue pour le produit : " + produit);
        }
    }

    /**
     * Ajoute une quantité donnée au stock.
     * 
     * @param produit Le nom du produit concerné.
     * @param quantite La quantité à ajouter.
     */
    private void ajouterStock(String produit, int quantite) {
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
    }

    /**
     * Retire une quantité donnée du stock si possible.
     * 
     * @param produit Le nom du produit concerné.
     * @param quantite La quantité à retirer.
     */
    private void retirerStock(String produit, int quantite) {
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }
    }

    /**
     * Retourne le stock actuel.
     * 
     * @return Le stock actuel.
     */
    public int getStock() {
        return stock;
    }
}
