/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

/**
 *
 * @author sethu
 */
public class NonFictionBook extends Book{
    private String subject;
    
    public NonFictionBook(String isbn, String title, String author, int year, String subject){
        super(isbn, title, author, year);
        this.subject = subject;
    }
    
    @Override
    public String getReport(){
        return super.getReport() + " [Non-Fiction, Subject: " + subject + "]";
    }
}
