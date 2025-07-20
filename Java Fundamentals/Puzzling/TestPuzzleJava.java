public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        System.out.println("=== getTenRolls ===");
        System.out.println(generator.getTenRolls());

        System.out.println("\n=== getRandomLetter ===");
        System.out.println(generator.getRandomLetter());

        System.out.println("\n=== generatePassword ===");
        System.out.println(generator.generatePassword());

        System.out.println("\n=== getNewPasswordSet(5) ===");
        System.out.println(generator.getNewPasswordSet(5));

        System.out.println("\n=== shuffleArray ===");
        int[] arr = {1, 2, 3, 4, 5, 6};
        generator.shuffleArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
