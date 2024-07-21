public class CharacterFunctions {


    public void main() {

        char c=' ';

        System.out.println(Character. isWhitespace(c));

        System.out.println(Character.isDigit(c));
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isAlphabetic(6));
        System.out.println(Character.isEmoji(191));

        c= 'J';
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isDigit(c));

        c=123;
        System.out.println(Character.isLetter(c));
        System.out.println(Character.isDigit(c));
        System.out.println(Character.isUpperCase(c));


    }
}




