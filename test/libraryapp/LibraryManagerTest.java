/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package libraryapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sethu
 */
public class LibraryManagerTest {
    

    @Test
    public void testAddBook() {
        LibraryManager manager = new LibraryManager();
        manager.addBook(new Book("B001", "Test Book", "Test Author", 2021));
        
        assertEquals(1, manager.getAllBooks().size());
    }

    @Test
    public void testReportContainsBookTitle() {
        LibraryManager manager = new LibraryManager();
        manager.addBook(new Book("B001", "Test Book", "Test Author", 2021));
        
        String report = manager.generateReport();
        assertTrue(report.contains("Test Book"));
        
    }

    @Test
    public void testMultipleBooksAdded() {
        LibraryManager manager = new LibraryManager();
        manager.addBook(new Book("B001", "Test Book", "Test Author", 2021));
        manager.addBook(new FictionBook("F002", "Fiction Test", "Author X", 2000, "Mystery"));
        
        assertEquals(2, manager.getAllBooks().size());
    }
    
}
