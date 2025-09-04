/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvseriesapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {
    private static ArrayList<SeriesModel> seriesList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void captureSeries(){
        System.out.println("Enter the series id: ");
        String id = scanner.nextLine();
        
        System.out.println("Enter the series name: ");
        String name = scanner.nextLine();
        
        int age = 0;
        while (true){
            try {
                System.out.println("Enter the series age restriction: ");
                age = Integer.parseInt(scanner.nextLine());
                if (age < 2 || age > 18){
                    System.out.println("You have entered an incorrect series age!!! Please re-enter the series age >>");
                }else {
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("INvalid input! Please enter the numbers only for age restriction.");
            }
        }
        System.out.println("Enter the number of episodes: ");
        int episodes = Integer.parseInt(scanner.nextLine());
        
        SeriesModel s = new SeriesModel(id, name, age, episodes);
        seriesList.add(s);
        System.out.println("Series processed successfully!");
    }
    
    //Search for series
    public static void searchSeries(){
        System.out.println("Enter the series id to search");
        String id = scanner.nextLine();
        
        for (SeriesModel s : seriesList){
            if (s.getSeriesId().equals(id)){
                System.out.println(s);
                return;
            }
        }
        System.out.println("Series with series ID: " + id + "was not found!");
    }
    public static void updateSeries(){
        System.out.println("Enter the series id to update: ");
        String id = scanner.nextLine();
        
        for (SeriesModel s : seriesList){
            if (s.getSeriesId().equals(id)) {
                System.out.println("Enter the new series name: ");
                s.setSeriesName(scanner.nextLine());
                
                System.out.println("Enter the new age restriction: ");
                s.setSeriesAge(Integer.parseInt(scanner.nextLine()));
                
                System.out.println("Enter the new number of episodes: ");
                s.setSeriesNumberOfEpisodes(Integer.parseInt(scanner.nextLine()));
                
                System.out.println("Series updated successfully!");
                return;
            }
        }
        System.out.println("Series with Series id: " + id + " was not found!");
    }
    
    //delete a series 
    public static void deleteSeries(){
        System.out.println("Enter the series id to delete: ");
        String id = scanner.nextLine();
        
        for (SeriesModel s : seriesList) {
            if (s.getSeriesId().equals(id)) {
                System.out.println("Are you sure you want to delete series " + id);
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("y")){
                    seriesList.remove(s);
                    System.out.println("Series with Series id: " + id+ " WAS deleted");
                }else {
                    System.out.println("Deletion cancelled");
                }
                return;
            }
        }
        System.out.println("Series with Series Id: " + id + " Was not found!");
        
    }
    public static void seriesReport(){
        if (seriesList.isEmpty()) {
            System.out.println("No seires found!");
            return;
        }
        
        int count = 1;
        for (SeriesModel s : seriesList){
            System.out.println("Series " + count++);
            System.out.println(s);
        }
    }
    
    public static void exitSeriesApplication(){
        System.out.println("Exiting application...Goodbye!");
        System.exit(0);
    }
}
