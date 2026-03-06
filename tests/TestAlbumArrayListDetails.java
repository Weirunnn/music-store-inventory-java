import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAlbumArrayListDetails{
    
    //----Custom Constructor----
    @Test
    public void add1CustomConstructor(){
        AlbumArrayList test = new AlbumArrayList(7);
        Album adding = new Album("Michael Jackson", "BAD");
        test.add(adding);
        assertEquals("Custom constructor should be able to properly add 1 album",1, test.size());
    }

    @Test
    public void CheckResizeCustumConstructor(){
        AlbumArrayList test = new AlbumArrayList(7);
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
        assertTrue("Custom constructor did not resize when album count exceeded intial capacity",7 < test.size());
    }
}