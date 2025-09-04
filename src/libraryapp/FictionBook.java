/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapp;

/**
 *
 * @author sethu
 */
public class FictionBook extends Book {

    private String genre;
    
    public FictionBook(String isbn, String title, String author, int year, String genre){
        super(isbn, author, author, year);
        this.genre = genre;
    }
    
    @Override
    public String getReport(){
        return super.getReport() + "[Fiction, Genre: " + genre + "]";
    }


}
