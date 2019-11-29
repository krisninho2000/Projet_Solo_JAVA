public abstract class Magic extends Character {
    private final String MainClass = "Magic User";

    public Magic(String name) {
        super(name);
    }

    // Partie de récupération des informations des personnages

    public String getMainClass() { return this.MainClass; }

    // Action en combat du personnage

    public abstract void actionCombat();

    // Partie d'affichage des informations des personnages

    public abstract String toString();

}
