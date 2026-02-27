public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create instances for each character
        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
            "  .***.  ",
            " *     * ",
            "**     **",
            "**     **",
            " *     * ",
            "   ***   "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
            "*******. ",
            "**     **",
            "**     **",
            "*******  ",
            "**       ",
            "**       "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
            " .*****. ",
            "**     **",
            " **.     ",
            "    ^**. ",
            "**     **",
            "  *****  "
        });

        // Array initialization uses instances to populate banner lines
        String[] bannerLines = new String[oPattern.getPattern().length];
        for (int i = 0; i < bannerLines.length; i++) {
            bannerLines[i] = oPattern.getPattern()[i] + " "
                            + oPattern.getPattern()[i] + " "
                            + pPattern.getPattern()[i] + " "
                            + sPattern.getPattern()[i];
        }

        // Loop prints the assembled banner
        for (String line : bannerLines) {
            System.out.println(line);
        }

    }
}