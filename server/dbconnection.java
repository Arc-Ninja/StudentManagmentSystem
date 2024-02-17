package server;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class dbconnection {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student",username,password);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("desc info;");
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2));
            }
            st.close();
            conn.close();


        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}
