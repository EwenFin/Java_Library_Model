public class Library {

  private String name;
  private Book[] stock;

  public Library(String name){
    this.name = name;
    this.stock = new Book[10];
  }

  public String getName() {
    return this.name;
  }

  public int stockCount() {
    int count = 0;
    for (Book book : stock)
      {
        if (book != null) {
          count++;
        }
      }
      return count;
  }

  public void insert(Book book) {
    int index = stockCount();
    stock[index] = book;
  }

  public boolean isStockFull() {
    return stockCount() == stock.length;
  }


  // public void borrow(Book book) {
  //   if(stockCount()) = 0 {
  //     return;
  //   }

  // }

}


