/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

/**
 *
 * @author sethu
 */
import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Book> books;
    
    public LibraryManager(){
        books = new ArrayList<>();
    }
    
    public void addBook(Book b){
        books.add(b);
    }
    
    public ArrayList<Book> getAllBooks(){
        return books;
    }
    
    public String generateReport(){
        StringBuilder report = new StringBuilder("===Library Report===\n");
        for(Book b : books){
            report.append(b.getReport()).append("\n");
        }
        return report.toString();
    }
}
