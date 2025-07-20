
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();

    // Génère une liste de 10 nombres aléatoires entre 1 et 20
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rolls.add(randMachine.nextInt(20) + 1);
        }
        return rolls;
    }

    // Renvoie une lettre aléatoire de l'alphabet
    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int randomIndex = randMachine.nextInt(26);
        return alphabet[randomIndex];
    }

    // Génère un mot de passe aléatoire de 8 lettres
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }

    // Renvoie une liste de mots de passe aléatoires de longueur définie
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

    // Mélange les éléments d’un tableau d'entiers
    public void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int j = randMachine.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
