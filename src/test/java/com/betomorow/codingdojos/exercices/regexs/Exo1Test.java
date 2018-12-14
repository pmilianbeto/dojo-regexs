package com.betomorow.codingdojos.exercices.regexs;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class Exo1Test {
    @Test
    public void matchLetters() {
        String regex = new Exo1().matchLetters();
        assertTrue("abcdef".matches(regex));
        assertTrue("abcde".matches(regex));
        assertTrue("abc".matches(regex));

        assertFalse("123".matches(regex));
        assertFalse("aaa".matches(regex));
    }

    @Test
    public void matchWithoutLetter() {
        String regex = new Exo1().matchWithoutLetter();
        assertTrue("abde".matches(regex));
        assertTrue("12op".matches(regex));

        assertFalse("abcde".matches(regex));
        assertFalse("Cdb".matches(regex));
    }

    @Test
    public void matchNumbers() {
        String regex = new Exo1().matchNumbers();

        assertTrue("123".matches(regex));
        assertTrue("35".matches(regex));
        assertTrue("67.89".matches(regex));

        assertFalse("67.89.67".matches(regex));
        assertFalse("abc".matches(regex));
    }

    @Test
    public void matchWords() {
        String regex = new Exo1().matchWords();
        assertTrue("a quick brown fox".matches(regex));
        assertTrue("Something went wrong".matches(regex));
        assertTrue("hello".matches(regex));

        assertFalse("My idententification is a201".matches(regex));
        assertFalse("I have 10 pennies".matches(regex));
        assertFalse("Something went wrong ".matches(regex));
        assertFalse("".matches(regex));
    }

    @Test
    public void matchWord() {
        String regex = new Exo1().matchWord();

        assertTrue("HELP?".matches(regex));
        assertTrue("eztezytzegf.HELP!!hgerergbregh".matches(regex));
        assertTrue("eztezytzegf?HELP hgerergbregh".matches(regex));

        assertFalse("eztezytzegfHELPhgerergbregh".matches(regex));
        assertFalse("HELPP".matches(regex));
        assertFalse("09HELP".matches(regex));
    }

    @Test
    public void matchDoubleLetterOccurence() {
        String regex = new Exo1().matchDoubleLetterOccurence();
        assertTrue("bb".matches(regex));
        assertTrue("abdbc".matches(regex));

        assertFalse("abc".matches(regex));
        assertFalse("Cdbc".matches(regex));
        assertFalse("11".matches(regex));
    }

    @Test
    public void matchDoesntContainWord() {
        String regex = new Exo1().matchDoesntContainWord();
        assertTrue("the forbidden word isn't here".matches(regex));
        assertTrue("nor here".matches(regex));

        assertFalse("this is the forbidden word".matches(regex));
        assertFalse("can't touch this".matches(regex));
    }

    @Test
    public void wordCannotBeFollowedByAnother() {
        String regex = new Exo1().wordCannotBeFollowedByAnother();
        assertTrue("hello can come before this".matches(regex));
        assertTrue("hello this is dog".matches(regex));
        assertTrue("this is fine".matches(regex));

        assertFalse("this cannot come before hello".matches(regex));
    }

    @Test
    public void hasSpecialWordSurroundedBySpace() {
        String regex = new Exo1().hasSpecialWordSurroundedBySpace();
        assertTrue("therefezffzeu space  efghghghireh".matches(regex));
        assertTrue("therefezffzeu sPacE  efghghghireh afafa fa fze  ".matches(regex));
        assertTrue("                  	SPACe   ".matches(regex));

        assertFalse("space gruhreiguh rhigueh g".matches(regex));
        assertFalse("grehigeh uzhgireugh eSPACEezgr".matches(regex));
    }

    @Test
    public void isEmail() {
        String regex = new Exo1().isEmail();
        assertTrue("contact@betomorrow.com".matches(regex));
        assertTrue("my.name@some.sub.domain.com".matches(regex));
        assertTrue("some+email@betomorrow.com".matches(regex));

        assertFalse("foo.bar@a.a".matches(regex));
        assertFalse("foo$.bar@aaaa.fr".matches(regex));
        assertFalse("foo.bar@aaaa.frfrfrf".matches(regex));
        assertFalse("@aaaa.frfrfrf".matches(regex));
        assertFalse("foobar@aaaa".matches(regex));
        assertFalse("foobar@".matches(regex));
    }

    @Test
    public void matchesSentenceEnd() {
        String regex = new Exo1().matchesSentenceEnd();
        assertTrue("assumes word senses. Within".matches(regex));
        assertTrue("does the clustering. In the".matches(regex));
        assertTrue("but when? It was hard to tell".matches(regex));
        assertTrue("he arrive.\" After she had".matches(regex));
        assertTrue("mess! He did not let it".matches(regex));
        assertTrue("it wasn't hers!' She replied".matches(regex));
        assertTrue("always thought so.) Then".matches(regex));

        assertFalse("in the U.S.A., people often".matches(regex));
        assertFalse("John?\", he often thought, but".matches(regex));
        assertFalse("weighed 17.5 grams".matches(regex));
        assertFalse("well ... they'd better not".matches(regex));
        assertFalse("A.I. has long been a very".matches(regex));
        assertFalse("like that\", he thought".matches(regex));
        assertFalse("but W. G. Grace never had much".matches(regex));
    }

    @Test
    public void solved() throws Exception {
        int count = new Exo1().solve();
        assertEquals(258, count);
    }
}