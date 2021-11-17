/* Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getter methods  for all the member variables. */


class Book
{
    private int qtyInStock;
    private final String name,author;
    private  double price;

    Book(int qtyInStock, String name, String author, double price)
    {
        this.qtyInStock = qtyInStock;
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    public String getName()
    {
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }

}

public class BookStock {
    public static void main(String[] args) {
        Book b1 = new Book(340,"Java is Easy","HK Verma",550.50);
        System.out.println("Book's Name: " + b1.getName());
        System.out.println("Author's Name: " + b1.getAuthor());
        System.out.println("Stock: " + b1.getQtyInStock());
        System.out.println("Price: " + b1.getPrice());
    }
}

