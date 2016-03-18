package com.betomorow.codingdojos.exercices.exo1;

public class Exo1 {

    /**
     * Match :
     * "abcdefg"
     * "abcde"
     * "abc"
     *
     * Do not match :
     * "123"
     * "aaa"
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
     */
    public String matchWords() {
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
     * in the U.S.A., people often
     * John?", he often thought, but
     * weighed 17.5 grams
     * well ... they'd better not
     * A.I. has long been a very
     * like that", he thought
     * but W. G. Grace never had much
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


    // Pour ceux qui ont fini : https://regexcrossword.com/
}
