/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webscrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author SHIVAM GOYAL
 */
public class Webscrape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String url="https://www.mohfw.gov.in/";
        
        try{
             final Document document = Jsoup.connect(url).get();
             
             for (Element row : document.select(
                "div.data-table.table-responsive tr")){
                  final String Sno = 
                           row.select("td:nth-of-type(1)").text();
                     
                     final String Name = 
                           row.select("td:nth-of-type(2)").text();
            
                     final String Con = 
                           row.select("td:nth-of-type(3)").text();
                     
                     final String Cured = 
                           row.select("td:nth-of-type(4)").text();
                     
                     final String Death = 
                           row.select("td:nth-of-type(5)").text();
                   
                 System.out.println(Sno + " " + Name + " " + Con + " " + Cured + " " + Death);
             }
        }
            
        catch (Exception ex) {
            ex.printStackTrace();
    }
    
 }
}
