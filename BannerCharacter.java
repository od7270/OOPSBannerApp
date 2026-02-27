public class BannerCharacter {

    private char character;
    private String[] pattern;

    public BannerCharacter(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}