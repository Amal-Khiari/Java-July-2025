import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        // Création du HashMap avec les titres comme clés et les paroles comme valeurs
        HashMap<String, String> trackList = new HashMap<>();

        // Ajout de 4 chansons
        trackList.put("Starlight", "Hold you in my arms, I just want to hold you in my arms");
        trackList.put("Supermassive Black Hole", "You set my soul alight");
        trackList.put("Time Is Running Out", "I think I'm drowning, asphyxiated");
        trackList.put("Uprising", "They will not force us, they will stop degrading us");

        // Récupération d'une chanson
        String lyrics = trackList.get("Uprising");
        System.out.println("Lyrics of 'Uprising': " + lyrics);

        // Affichage de toutes les chansons et leurs paroles
        System.out.println("\nFull track list:");
        for (String track : trackList.keySet()) {
            System.out.println(track + ": " + trackList.get(track));
        }
    }
}
