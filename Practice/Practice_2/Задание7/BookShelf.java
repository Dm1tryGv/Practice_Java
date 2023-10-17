package Practice.Practice_2.Задание7;

public class BookShelf {
    public static Book[] append(Book[] myArray, Book book) {
        int i;

        Book[] newArray = new Book[myArray.length + 1];

        for (i = 0; i < myArray.length; i++)
            newArray[i] = myArray[i];

        newArray[myArray.length] = book;
        return newArray;
    }

    public static Book[] delete(Book[] myArray, int index) {
        int i;

        myArray[index] = null;

        Book[] newArray = new Book[myArray.length - 1];

        for (i = 0; i < myArray.length; i++)
            if (myArray[i] != null) {
                newArray[i] = myArray[i];
            }

        return newArray;
    }

    Book[] shelf;

    public BookShelf(){
        shelf = new Book[0];
    }

    public void addBook(Book book){
        shelf = append(shelf, book);
    }

    public void delBook(int index){
        shelf = delete(shelf, index);
    }

    public Book findNew(){
        int year = -1000000000;

        Book answer = null;

        for (Book book : shelf){
            if (book.year > year){
                year = book.year;
                answer = book;
            }
        }

        return answer;
    }

    public Book findOld(){
        int year = 1000000000;

        Book answer = null;

        for (Book book : shelf){
            if (book.year < year){
                year = book.year;
                answer = book;
            }
        }

        return answer;
    }

    private void swap(Book[] array, int ind1, int ind2) {
        Book tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void shelfSort(){
        for (int i = 1; i < shelf.length; i++) {
            if (shelf[i].year < shelf[i - 1].year) {
                swap(shelf, i, i-1);
            }
        }
    }
}
