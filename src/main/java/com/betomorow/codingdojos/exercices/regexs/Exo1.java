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
        return "";
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
        return "";
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
        return "";
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
        return "";
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
        return "";
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
        return "";
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
        return "";
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
        return "";
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
        return "";
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
        return "";
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
        return "";
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
        return 0;
    }

    // Pour ceux qui ont fini : https://regexcrossword.com/
}
