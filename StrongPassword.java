import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/strong-password/
public class StrongPassword {

    // Return the minimum number of characters to make the password strong
    static int minimumNumber(int n, String password) {
        int minimumNumber = 0;
        if (!isContainsDigit(password)) minimumNumber++;
        if (!isContainsLowercaseLetter(password)) minimumNumber++;
        if (!isContainsUppercaseLetter(password)) minimumNumber++;
        if (!isContainsSpecialCharacter(password)) minimumNumber++;
        if (n + minimumNumber < 6) minimumNumber = 6 - n;
        return minimumNumber;
    }

    private static boolean isContainsDigit(String str) {
        int digitStartIndex = 48; // 0
        int digitEndIndex = 57; // 9
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            if (currentCharacter >= digitStartIndex && currentCharacter <= digitEndIndex)
                return true;
        }
        return false;
    }

    private static boolean isContainsLowercaseLetter(String str) {
        int lowercaseLetterStartIndex = 97; // letter 'a'
        int lowercaseLetterEndIndex = 122; // letter 'z'
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            if (currentCharacter >= lowercaseLetterStartIndex && currentCharacter <= lowercaseLetterEndIndex)
                return true;
        }
        return false;
    }

    private static boolean isContainsUppercaseLetter(String str) {
        int uppercaseLetterStartIndex = 65; // letter 'A'
        int uppercaseLetterEndIndex = 90; // letter 'z'
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            if (currentCharacter >= uppercaseLetterStartIndex && currentCharacter <= uppercaseLetterEndIndex)
                return true;
        }
        return false;
    }

    private static boolean isContainsSpecialCharacter(String str) {
        List<String> specialCharacters = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+");
        for (int i = 0; i < str.length(); i++) {
            if (specialCharacters.contains(String.valueOf(str.charAt(i)))) return true;
        }
        return false;
    }

}
