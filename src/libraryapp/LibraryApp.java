/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libraryapp;

/**
 *
 * @author sethu
 */
public class LibraryApp {

   
    public static void main(String[] args) {
        // TODO code application logic here
        LibraryManager manager = new LibraryManager();
        
        manager.addBook(new FictionBook("F101", "The Hobbit", "J.R.R Tolkien", 1937, "Fantasy"));
        manager.addBook(new NonFictionBook("NF202", "A Brief History Of Time", "Stephen Hawking", 1988, "Science"));
        manager.addBook(new Book("B303", "Generic Book", "Unknown Author", 2020));
        
        System.out.println(manager.generateReport());
    }
    
}
