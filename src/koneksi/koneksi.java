package koneksi;
import java.sql.*;
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        } catch (ClassNotFoundException ex){
            System.out.println("Gagal koneksi"+ex);  
        }
        String url ="jdbc:mysql://localhost/klinik";
        try {
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil Koneksi Database");
        } catch (Exception ex){
            System.out.println("Gagal koneksi Database"+ex);
        }
        return koneksi;
    }
}
