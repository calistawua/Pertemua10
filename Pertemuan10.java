/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan10;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author 2201010294calista
 * TGL :2024-05-20
 */
public class Pertemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
       list_all(); 
    }
    
    private static void list_all() throws SQLException{
        Connection cnn = koneksi.getKoneksi();
        
    }
}
