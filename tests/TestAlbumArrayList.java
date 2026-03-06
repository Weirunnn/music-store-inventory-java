import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.IndexOutOfBoundsException;

public class TestAlbumArrayList{

    // ----constructor----
    @Test
    public void add1DefaultConstructor(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding = new Album("Michael Jackson", "BAD");
        test.add(adding);
        assertEquals("Default constructor should be able to properly add 1 album",1,test.size());
    }

    @Test
    public void addMany(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        assertEquals("Default constructor should be able to properly add multiple albums",3, test.size());
    }

    //----remove----
    @Test
    public void removeOneByNumber(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        test.remove(2);
        assertEquals("Single removal by number was unseccessful",2, test.size());
    }

    @Test
    public void removeOneByNumber_correct(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        Album actual = test.remove(2);
        assertEquals("Remove by number removed incorrect album",adding3, actual);
    }

    @Test
    public void removeOneByName(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        test.remove(adding2);
        assertEquals("Single removal by name was unsuccessful",2, test.size());
    }

    //----set() and get()----
    @Test
    public void checkGet(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding = new Album("Michael Jackson","BAD");
        test.add(adding);
        assertEquals("get() doesn't return proper album",adding,test.get(0));
    }
    @Test
    public void checkSet(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.set(0,adding3);
        assertEquals("set() doesn't properly reset Albums at specified index",adding3,test.get(0));
    }

    //----resize()----
    @Test
    public void CheckResizeDefaultConstructor(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        Album adding4 = new Album("Frank Ocean","In My Room");
        Album adding5 = new Album("Katy Perry","Hot n Cold");
        Album adding6 = new Album("Khalid","Free Spirit");
        Album adding7 = new Album("Harry Styles","Harry's House");
        Album adding8 = new Album("Harry Styles","Fine Line");
        Album adding9 = new Album("Glass Animals","How To Be A Human Being");
        Album adding10 = new Album("Khalid","Scenic Drive");
        Album adding11 = new Album("One Direction","Made in the A.M.");
        Album adding12 = new Album("One Direction","FOUR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        test.add(adding4);
        test.add(adding5);
        test.add(adding6);
        test.add(adding7);
        test.add(adding8);
        test.add(adding9);
        test.add(adding10);
        test.add(adding11);
        test.add(adding12);
        assertTrue("Default constructor did not resize when album count exceeded intial capacity",10 < test.size());
    }


    



    @Test
    public void addDuplicates(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding = new Album("Michael Jackson", "BAD");
        test.add(adding);
        test.add(adding);
        test.add(adding);
        test.add(adding);
        test.add(adding);
        assertEquals("Custom constructor should be able to properly add multiple albums",5, test.size());
    }

    @Test
    public void removeManyByNumber(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        test.remove(2);
        test.remove(1);
        assertEquals("Multiple removals with remove by number doesn't properly decrease list size",1, test.size());
    }

    @Test
    public void removeManyByName(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        test.remove(adding2);
        test.remove(adding1);
        assertEquals("Multiple removals by name was unsuccessful",adding3, test.get(0));
    }

    @Test
    public void removeManyByName_correct(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        Album removedFirst = test.remove(adding2);
        Album removedSecond = test.remove(adding1);
        assertEquals("Remove by name doesn't return proper Album",adding2, removedFirst);
        assertEquals("Remove by name doesn't return proper Album",adding1, removedSecond);
    }

    //----outside range----
    @Test
    public void removeIndexOutOfRange(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        try{
            test.remove(5);
            assertFalse("Program should throw IndexOutOfBoundsException when removing at invalid index", false);
        } catch (IndexOutOfBoundsException ioobe){

        }
    }
}