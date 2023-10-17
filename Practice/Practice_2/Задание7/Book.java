package Practice.Practice_2.Задание7;

public class Book {

    public String author;
    public String name;
    public int year;

    public Book(String author, String name, int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
