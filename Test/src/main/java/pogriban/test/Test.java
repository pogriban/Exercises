/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.test;

/**
 *
 * @author ThinkPad
 */
public class Test {
     public static void main(String... args) {
        String str1 = "abc#ef";
        String str2 = "abc#c";
        String str3 = "abcef#";
        StringBuilder sb1 = new StringBuilder("abc#ef");
        StringBuilder sb2 = new StringBuilder("abc#c");
        System.out.println(str1 + " " + checkForEquality(str1));
        System.out.println(str2 + " " + checkForEquality(str2));
        System.out.println(str3 + " " + checkForEquality(str3));
        System.out.println(sb1.toString() + " " + checkForEquality(sb1));
        System.out.println(sb2.toString() + " " + checkForEquality(sb2));
        System.out.println(dublicateCharactersV1("abc"));
        System.out.println(dublicateCharactersV2("def"));
        System.out.println(dublicateCharactersV3("ghi"));
    }
    /**
     * Checks that the character before <code>#</code> matches the character
     * after <code>#</code>.
     *
     * @param str The string to be checked.
     * @return <code>true</code> if the character before <code>#</code> matches
     * the character after <code>#</code>, <code>false</code> otherwise.
     */
    static boolean checkForEquality(String str) {
        int hashIndex = str.indexOf('#');
        if (hashIndex > -1 && hashIndex < str.length() - 1) {
            char charBefore = str.charAt(hashIndex - 1);
            char charAfter = str.charAt(hashIndex + 1);
            return charBefore == charAfter;
        }
        return false;
    }
    // abc#cba  |  abc#def
    static boolean checkForEquality(StringBuilder str) {
        int hashIndex = str.indexOf("#");
        String sub = str.substring(hashIndex - 1, hashIndex + 2); // c#c
        StringBuilder sb = new StringBuilder(sub);
        return sb.reverse().toString().equals(sub);
        // c#c                     // c#c
    }
    static String dublicateCharactersV1(String str) {
        char originalCharacters[] = str.toCharArray();
        String duplicatedCharacters[] = new String[str.length() * 2];
        int dublicatedIndex = -1;
        for (int index = 0; index < originalCharacters.length; index++) {
            char c = originalCharacters[index];
            duplicatedCharacters[++dublicatedIndex] = String.valueOf(c);
            duplicatedCharacters[++dublicatedIndex] = String.valueOf(c);
        }
        return String.join("", duplicatedCharacters);
    }
    static String dublicateCharactersV2(String str) {
        StringBuilder sb = new StringBuilder();
        char originalCharacters[] = str.toCharArray();
        for (int index = 0; index < originalCharacters.length; index++) {
            sb.append(originalCharacters[index]).append(originalCharacters[index]);
        }
        return sb.toString();
    }
    static String dublicateCharactersV3(String str) {
        StringBuilder sb = new StringBuilder(str);
        char originalCharacters[] = str.toCharArray();
        int dublicatedIndex = 1;
        for (int index = 0; index < originalCharacters.length; index++) {
            sb.insert(dublicatedIndex, originalCharacters[index]);
            dublicatedIndex+=2;
        }
        return sb.toString();
    }
    
}
