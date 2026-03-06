import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestAlbum{

    @Test
    public void checkEquals_twoStringsInput_areEqual(){
        Album firstAlbum = new Album("Michael Jackson","BAD");
        Album secondAlbum = new Album("Michael Jackson","BAD");
        assertTrue("Dual-string Album constructor should acknowledge muliple instances of the same album as equal",firstAlbum.equals(secondAlbum));
    }

    @Test
    public void checkEquals_oneStringInput_areEqual(){
        Album firstAlbum = new Album("Michael Jackson - BAD");
        Album secondAlbum = new Album("Michael Jackson - BAD");
        assertTrue("Single-string Album constructor should acknowledge muliple instances of the same album as equal",firstAlbum.equals(secondAlbum));
    }
    
    @Test //this shouldn't fail
    public void checkEquals_oneOfEach_areEqual(){
        Album firstAlbum = new Album("Michael Jackson - BAD");
        Album secondAlbum = new Album("Michael Jackson","BAD");
        assertTrue("Using different Album constructors shouldn't keep 2 instances of the same album from being considered equal", firstAlbum.equals(secondAlbum));
    }

    @Test
    public void checkEquals_twoStringsInput_notEqual(){
        Album firstAlbum = new Album("Michael Jackson","BAD");
        Album secondAlbum = new Album("Doja Cat", "Planet Her");
        assertFalse("Non-identical albums shouldn't be considered equal (Dual-string constructor)",firstAlbum.equals(secondAlbum));
    }

    @Test
    public void checkEquals_oneStringInput_notEqual(){
        Album firstAlbum = new Album("Michael Jackson - BAD");
        Album secondAlbum = new Album("Doja Cat - Planet Her");
        assertFalse("Non-identical albums shouldn't be considered equal (Single-string constructor)",firstAlbum.equals(secondAlbum));
    }

    @Test //since the other one failed, this passed for the wrong reasons
    public void checkEquals_oneOfEach_notEqual(){
        Album firstAlbum = new Album("Michael Jackson","BAD");
        Album secondAlbum = new Album("Doja Cat - Planet Her");
        assertFalse("Non-identical albums shouldn't be considered equal",firstAlbum.equals(secondAlbum));
    }

    @Test 
    public void checkToString_singleStringConstrcuctor(){
        Album album = new Album("Michael Jackson - BAD");
        String albumString = "Michael Jackson - BAD";
        assertEquals("Single-string Album constructor doesn't operate properly with toString()",albumString,album.toString());
    }
    @Test 
    public void checkToString_twoStringConstrcuctor(){
        Album album = new Album("Michael Jackson","BAD");
        String albumString = "Michael Jackson - BAD";
        assertEquals("Dual-string Album constructor doesn't operate properly with toString()",albumString,album.toString());
    }
}