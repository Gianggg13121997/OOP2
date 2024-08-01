package view;

import Manager.BookManger;
import Object.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBook {
    BookManger bookManger = new BookManger();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("=======MenuBook=======");
            System.out.println("1.Them san pham \n2.Xoa san pham \n3.Sua san pham\n4.Hien thi tat ca \n0.Exit :");
            System.out.println("Nhap lua chon");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    showMenuAdd();
                    break;
                case 4:
                    showAll();
                    break;
                case 3:
                    showMainMenu();
                    break;

            }

        } while (choice != 0);
    }

    public void showMenuAdd() {
        System.out.println("menu add");
        System.out.println("Nhap id san pham :");
        int id = inputInt.nextInt();
        System.out.println("Nhap ten sach :");
        String name = inputString.nextLine();
        System.out.println("Nhap gia san pham :");
        int price = inputInt.nextInt();
        Book book = new Book(id, name, price);
        bookManger.add(book);
        System.out.println("them thanh cong !");
    }

    public void showAll() {
        System.out.println("danh sach san pham :");
        ArrayList<Book> books = bookManger.getAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showMenuRemove() {
        System.out.println("Nhap id san pham can xoa :");
        int id = inputInt.nextInt();
        bookManger.remove(id);
        System.out.println("xoa thanh cong !");
    }
}
