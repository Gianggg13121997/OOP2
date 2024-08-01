package Manager;

import Object.Book;

import java.util.ArrayList;

public class BookManger implements IManager<Book> {
    private ArrayList<Book> books = new ArrayList<Book>();

    @Override
    public void add(Book book) {
        books.add(book);

    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
            }
        }


    }

    @Override
    public void findByIndex(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return;
            }
        }

    }

    @Override
    public ArrayList<Book> getAll() {
        return new ArrayList<>(books);
    }


}
