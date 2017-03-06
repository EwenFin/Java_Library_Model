import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest{

  Library library;
  Book book1;
  Book book2;
  Book book3;

  @Before
  public void before(){
    library = new Library("Edinburgh Central");
    book1 = new Book("Lord of the Rings");
    book2 = new Book("The Wasp Factory");
    book3 = new Book("The Old Man and the Sea");
  } 

  @Test
  public void hasTitle(){
    assertEquals("Lord of the Rings", book1.getTitle());
    assertEquals("The Old Man and the Sea", book3.getTitle());
  }

// 2 assertions in one test return as one test pass

  @Test
  public void hasTitle2(){
    assertEquals("The Wasp Factory", book2.getTitle());
  }

// and the tests need distinct names

  @Test
  public void hasName() {
    assertEquals("Edinburgh Central", library.getName() );
  }

  @Test
  public void stockStartsEmpty(
    ) {
    assertEquals(0, library.stockCount());
  }

  @Test
  public void insertToStock() {
    library.insert(book1);
    assertEquals(1, library.stockCount());
  }

  @Test
  public void libraryIsFull(){
    for (int i = 0; i < 10; i++){
      library.insert(book1);
    }
    assertEquals(true, library.isStockFull());
  }
 
 @Test
 public void cannotAddToStockWhenFull(){
  for (int i = 0; i < 12; i ++){
    library.insert(book1);
  }
  assertEquals(10, library.stockCount());
 }

  // @Test
  // public void borrowFromStock() {
  //   library.insert(book1);
  //   library.insert(book2);
  //   library.borrow(book1);
  //   assertEquals(1, library.stockCount());
  // }


}