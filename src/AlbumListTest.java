
public class AlbumListTest {
    
    public static void add1DefaultConstructor(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding = new Album("Michael Jackson", "BAD");
        test.add(adding);
    }

    
    public static void addMany(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
    }

    //----remove----
    
    public static void removeOneByNumber(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        test.remove(2);

    }

    
    public static void removeOneByNumber_correct(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        Album actual = test.remove(2);

    }

    
    public static void removeOneByName(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        test.remove(adding2);

    }

    //----set() and get()----
    
    public static void checkGet(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding = new Album("Michael Jackson","BAD");
        test.add(adding);

    }
    
    public static void checkSet(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.set(0,adding3);

    }

    //----resize()----
    
    public static void CheckResizeDefaultConstructor(){
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
    }

    
    public static void addDuplicates(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding = new Album("Michael Jackson", "BAD");
        test.add(adding);
        test.add(adding);
        test.add(adding);
        test.add(adding);
        test.add(adding);
    }

    
    public static void removeManyByNumber(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        test.remove(2);
        test.remove(1);
    }

    
    public static void removeManyByName(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        test.remove(adding2);
        test.remove(adding1);

    }

    
    public static void removeManyByName_correct(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);
        Album removedFirst = test.remove(adding2);
        Album removedSecond = test.remove(adding1);

    }

    //----outside range----
    
    public static void removeIndexOutOfRange(){
        AlbumArrayList test = new AlbumArrayList();
        Album adding1 = new Album("Michael Jackson", "BAD");
        Album adding2 = new Album("Doja Cat", "Planet Her");
        Album adding3 = new Album("Tyler, the Creator","IGOR");
        test.add(adding1);
        test.add(adding2);
        test.add(adding3);

    }
    public static void main(String[] args) {
        
        removeIndexOutOfRange();
        removeManyByName_correct();
        removeManyByName();
        removeManyByNumber();
        addDuplicates();
        CheckResizeDefaultConstructor();
        checkSet();
        checkGet();
        removeOneByName();
        removeOneByNumber_correct();
        removeOneByNumber();
        addMany();
        add1DefaultConstructor();
        System.out.println("All tests passed");


    }

}
