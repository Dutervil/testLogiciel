package test;

import com.wadson.app.Rarray;
import com.wadson.app.RarrayError;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
public class RarrayTest extends TestCase {

    @Test
    public void testRarray()   {
        Rarray list= null;
        try {
            list = new Rarray(0);
        } catch (RarrayError e) {
           fail();
        }
        assertNotNull(list);

    }
    @Test
    public void testAdd() throws RarrayError {
        Rarray list=new Rarray(0);
        list.add("Lundi");
        list.add("Mardi");
        list.add("Mercredi");
        list.add("Jeudi");
        list.add("Vendredi");
        list.add("Samedi");

        Assert.assertTrue( list.size()==6);
        Assert.assertTrue(  list.contains("Jeudi"));



    }

    @Test
    public void testRemove() throws RarrayError {
        Rarray list=new Rarray(0);
        list.add("Lundi");
        list.add("Mardi");
        list.add("Mercredi");
        list.add("Jeudi");
        list.add("Vendredi");
        list.add("Samedi");
        Assert.assertTrue(list.remove("Vendredi"));
    }
    @Test
    public void testRemoveAll() throws RarrayError {
        Rarray list=new Rarray(0);
        list.add("Lundi");
        list.add("Mardi");
        list.add("Mercredi");
        list.add("Jeudi");
        list.add("Vendredi");
        list.add("Samedi");
        list.add("Vendredi");
        list.add("Vendredi");
        Assert.assertTrue(list.remove("Vendredi"));
    }
    @Test
    public void testClear() throws RarrayError {
        Rarray list=new Rarray(0);
        list.add("Lundi");
        list.add("Mardi");
        list.add("Mercredi");
        list.add("Jeudi");
        list.add("Vendredi");
        list.add("Samedi");
        list.add("Vendredi");
        list.add("Vendredi");
        list.clear();
        Assert.assertTrue(list.size() == 0);
    }

    @Test
    public void testContains() throws RarrayError {
        Rarray list=new Rarray(0);
        list.add("Lundi");
        list.add("Mardi");
        list.add("Mercredi");
        list.add("Jeudi");
        list.add("Vendredi");
        list.add("Samedi");
        list.add("Vendredi");
        list.add("Vendredi");
        Assert.assertTrue(list.contains("Vendredi"));
    }

    @Test
    public void testNbOcc() throws RarrayError {
        Rarray list=new Rarray(0);
        list.add("Lundi");
        list.add("Mardi");
        list.add("Mercredi");
        list.add("Jeudi");
        list.add("Vendredi");
        list.add("Samedi");
        list.add("Vendredi");
        list.add("Vendredi");
        Assert.assertTrue(list.nbOcc("Vendredi") ==3);
    }

    @Test
    public void testSize() throws RarrayError {
        Rarray list=new Rarray(0);
        list.add("Lundi");
        list.add("Mardi");
        list.add("Mercredi");
        list.add("Jeudi");
        list.add("Vendredi");
        list.add("Samedi");
        list.add("Vendredi");
        list.add("Vendredi");
        Assert.assertTrue(list.size() ==8);
    }
}