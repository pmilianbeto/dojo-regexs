package com.betomorow.codingdojos.exercices.regexs;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.common.io.Resources;

import java.io.File;
import java.util.List;

public class Exo1 {

    /*
     * Pour vous aider à composer vos regexs :
     * https://regex101.com/
     * En haut à droite de la page, vous avez l'explication littérale de la regex.
     * En bas à droite de la page, vous avez l'ensemble des éléments que vous pouvez inclure dans votre regex.
     */


    /**
     * Match :
     * "abcdefg"
     * "abcde"
     * "abc"
     *
     * Do not match :
     * "123"
     * "aaa"
     *
     */
    public String matchLetters() {
        return "abc.*";
    }

    /**
     * Match :
     * "abde"
     * "12op"
     *
     * Do not match :
     * "abcde"
     * "Cdb"
     *
     */
    public String matchWithoutLetter() {
        return "[^cC]*";
    }

    /**
     * Match :
     * "123"
     * "35"
     * "67.89"
     *
     * Do not match :
     * "67.89.67"
     * "abc"
     */
    public String matchNumbers() {
        return "\\d+(.\\d+)?";
    }

    /**
     * Match :
     * "a quick brown fox"
     * "Something went wrong"
     * "hello"
     *
     * Do not match :
     * "My idententification is a201"
     * "Something went wrong "
     * "I have 10 pennies"
     * ""
     *
     * tip: \w also matches numbers
     */
    public String matchWords() {
        return "[a-zA-Z]+( [a-zA-Z]+)*";
    }

    /**
     * Match :
     * "HELP?"
     * "eztezytzegf.HELP!!hgerergbregh"
     * "eztezytzegf?HELP hgerergbregh"
     *
     * Do not match:
     * "eztezytzegfHELPhgerergbregh"
     * "HELPP"
     * "09HELP"
     *
     * tip: boundaries are important
     */
    public String matchWord() {
        return ".*\\bHELP\\b.*";
    }

    /**
     * Match :
     * "bb"
     * "abdbc"
     * "CdbC"
     *
     * Do not match :
     * "abc"
     * "Cdbc"
     * "11"
     *
     * tip: match subpattern
     */
    public String matchDoubleLetterOccurence() {
        return ".*([a-zA-Z]).*\\1.*";
    }

    /**
     * Match :
     * "the forbidden word isn't here"
     * "nor here"
     *
     * Do not match :
     * "this is the forbidden word"
     * "can't touch this"
     *
     * tip: use a lookahead / lookbehind
     */
    public String matchDoesntContainWord() {
        return "(?!.*this).*";
    }

    /**
     * Match :
     * "hello can come before this"
     * "hello this is dog"
     * "this is fine"
     *
     * Do not match :
     * "this cannot come before hello"
     */
    public String wordCannotBeFollowedByAnother() {
        return "(?!.*this.*hello).*";
    }

    /**
     * Match :
     * "therefezffzeu space  efghghghireh"
     * "therefezffzeu sPacE  efghghghireh afafa fa fze  "
     * "                  	SPACe   "
     *
     * Do not match :
     * "space gruhreiguh rhigueh g"
     * "grehigeh uzhgireugh eSPACEezgr"
     *
     * tip: how to match case insensitive ?
     */
    public String hasSpecialWordSurroundedBySpace() {
        return "(?i).*\\sspace\\s.*";
    }

    /**
     * Match :
     * "assumes word senses. Within"
     * "does the clustering. In the"
     * "but when? It was hard to tell"
     * "he arrive." After she had"
     * "mess! He did not let it"
     * "it wasn't hers!' She replied"
     * "always thought so.) Then"
     *
     * Do not match :
     * "in the U.S.A., people often"
     * "John?", he often thought, but"
     * "weighed 17.5 grams"
     * "well ... they'd better not"
     * "A.I. has long been a very"
     * "like that", he thought"
     * "but W. G. Grace never had much"
     *
     */
    public String matchesSentenceEnd() {
        return
            "(?=.*[.?!])" + // make sure there is an end of sentence character in the string
            "(" +
                "[^.!?]" + // either match a non end of sentence character
                "|" +
                "(?<!\\b[A-Z]|\\s)[.!?][\"')]?\\s[A-Z]" + // or match an end of sentence character that is
                // not preceded by an abbreviation type String (A.B. or A. for instance) nor by a space
                // and that is followed by a space and an uppercase letter
            ")+";
    }

    /**
     * Match :
     * "contact@betomorrow.com"
     * "my.name@some.sub.domain.com"
     * "some+email@betomorrow.com"
     *
     * Do not match :
     * "foo.bar@a.a"
     * "foo$.bar@aaaa.fr"
     * "foo.bar@aaaa.frfrfrf"
     * "@aaaa.frfrfrf"
     * "foobar@aaaa"
     * "foobar@"

     */
    public String isEmail() {
        return "\\w+((\\.|\\+)\\w+)*@(\\w+\\.)+\\w{3,6}";
    }

    /**
     * Count how many "good" strings there are in the file strings_input.txt ?
     *
     * A good string has the following properties :
     *  - it contains at least three vowels (aeiou only)
     *  - it contains at least one letter that appears twice in a row, like "xx", "abcdde"
     *  - it does not contain the strings "ab", "cd", "pq" or "xy"
     */
    public int solve() throws Exception {
        List<String> strings = Files.readLines(new File(Resources.getResource("strings_input.txt").toURI()), Charsets.UTF_8);
        return (int) strings.stream()
            .filter(s -> s.matches(".*([aeiou].*){3,}.*")) // has at least three vowels
            .filter(s -> s.matches(".*(.)\\1.*")) // has a double letter
            .filter(s -> !s.matches(".*(ab|cd|pq|xy)+.*")) // does not contain certain strings
            .count();
    }

    // Pour ceux qui ont fini : https://regexcrossword.com/
}
