import java.sql.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* 7 Steps for JDBC
 * 1. import ---> java.sql;
 * 2. Load & Register the driver ("com.mysql.cj.jdbc.Driver");
 * 3. Create Connection
 * 4. Create Statement
 * 5. Execute query
 * 6. process Result
 * 7. close;
 */
public class JDBC{

    public static void main(String args[]){
        FileInputStream fis=null;
        Properties props=new Properties();
        try{
           fis =new FileInputStream("config.properties");
            props.load(fis);

            String url=props.getProperty("DB_URL");
            String uName=props.getProperty("DB_USER");
            String pass=props.getProperty("DB_PASSWORD");


            String query="SELECT Name FROM student WHERE RollNo=1";
            String query2="SELECT * FROM student";
            String query3="INSERT INTO student VALUES(5,'Anurag',22)";

            // Dynamic Query
            int rollNo=7;
            String name="Shashank";
            int age=22;
            String query4="INSERT INTO student VALUES(?,?,?)";



            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(url,uName,pass);
            Statement st=con.createStatement();

            // Prepared Statement for Dynamic Query
            PreparedStatement pst= con.prepareStatement(query4);
            pst.setInt(1,rollNo);
            pst.setString(2,name);
            pst.setInt(3,age);

            // ResultSet rs= st.executeQuery(query2);   //returns the result set object
            // int count= st.executeUpdate(query3);   // Returns the count of rows affected

            // Executing Dynamic Query
            int count=pst.executeUpdate();

            // while(rs.next()){
            //     int rollNo=rs.getInt("RollNo");
            //     String name= rs.getString("Name");
            //     int age=rs.getInt("Age");
            //     System.out.println(rollNo+" "+name+" "+age);
            // }

            System.out.println(count+" row/s affected");

            

            st.close();
            pst.close();
            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                if(fis!=null){
                    fis.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
        
    }
}