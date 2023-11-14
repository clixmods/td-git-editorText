package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;


public class DocumentTest extends TestCase {

    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Bonjour ");
        document.ajouter("le monde!");

        assertEquals("Bonjour le monde!", document.getTexte());
    }

    @Test
    public void testRemplacer() {
        Document document = new Document();
        document.setTexte("Hello, world!");

        document.remplacer(7, 12, "Universe");

        assertEquals("Hello, Universe!", document.getTexte());
    }

    @Test
    public void testMajuscules() {
        Document document = new Document();
        document.setTexte("hello, world!");

        document.majuscules(0, 5);

        assertEquals("HELLO, world!", document.getTexte());
    }

    @Test
    public void testEffacer() {
        Document document = new Document();
        document.setTexte("Hello, world!");

        document.effacer(7, 12);

        assertEquals("Hello, !", document.getTexte());
    }

    @Test
    public void testClear() {
        Document document = new Document();
        document.setTexte("Some text");

        document.clear();

        assertEquals("", document.getTexte());
    }

    @Test
    public void testInserer() {
        Document document = new Document();
        document.setTexte("Hello!");

        document.inserer(5, ", world");

        assertEquals("Hello, world!", document.getTexte());
    }

    @Test
    public void testMinuscules() {
        Document document = new Document();
        document.setTexte("HELLO, WORLD!");

        document.minuscules(7, 12);

        assertEquals("HELLO, world!", document.getTexte());
    }

    @Test
    public void testToString() {
        Document document = new Document();
        document.setTexte("Testing toString method");

        assertEquals("Testing toString method", document.toString());
    }
}
