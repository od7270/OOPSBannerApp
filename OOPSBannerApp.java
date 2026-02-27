import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void renderBanner(BannerCharacter[] bannerWord) {
        int rows = bannerWord[0].getPattern().length;
        for (int row = 0; row < rows; row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < bannerWord.length; col++) {
                if (col > 0) line.append(" ");
                line.append(bannerWord[col].getPattern()[row]);
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, BannerCharacter> patternMap = new HashMap<>();

        patternMap.put('O', new BannerCharacter('O', new String[]{
            "  .***.  ",
            " *     * ",
            "**     **",
            "**     **",
            " *     * ",
            "   ***   "
        }));

        patternMap.put('P', new BannerCharacter('P', new String[]{
            "*******. ",
            "**     **",
            "**     **",
            "*******  ",
            "**       ",
            "**       "
        }));

        patternMap.put('S', new BannerCharacter('S', new String[]{
            " .*****. ",
            "**     **",
            " **.     ",
            "    ^**. ",
            "**     **",
            "  *****  "
        }));

        String word = "OOPS";
        BannerCharacter[] bannerWord = new BannerCharacter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            bannerWord[i] = patternMap.get(word.charAt(i));
        }

        renderBanner(bannerWord);

    }
}