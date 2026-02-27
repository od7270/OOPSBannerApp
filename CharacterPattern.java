public class CharacterPattern {

    // Instance fields
    private char character;
    private String[] pattern;

    // Constructor
    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    // Getters
    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}