import java.sql.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// Using JDBC with DAO (Data Acces Object);

public class JDBCDAO{
    // Class for student Data Access Object
    static class StudentDao{
        static Connection con=null;

        // Function to establish Connection with Database
        public static void connect(){
            FileInputStream fis=null;
            Properties props=new Properties();
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                fis= new FileInputStream("config.properties");
                props.load(fis);
                String DBURL=props.getProperty("DB_URL");
                String DB_U_NAME=props.getProperty("DB_USER");
                String DB_PASSWORD=props.getProperty("DB_PASSWORD");
                con=DriverManager.getConnection(DBURL,DB_U_NAME,DB_PASSWORD);
            }
            catch(Exception e){
                System.out.println(e);
            }
            finally{
                if(fis!=null){
                    try{
                        fis.close();

                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }
                
            }


        }

        // Function to fetch student data
        public static Student getStudent(int rollNo){
            try{

            Statement st=con.createStatement();

            // SELECT query to fetch name and age
            String query="SELECT Name,age FROM student WHERE RollNo="+rollNo;
            ResultSet rs=st.executeQuery(query);
            rs.next();
            String name=rs.getString(1);
            int age=rs.getInt(2);
            
            // creating a student object with rollno and fetched name and age
            Student s=new Student();
            s.rollNo=rollNo;
            s.name=name;
            s.age=age;
            
            // Closing resources
            st.close();
            con.close();
            
            // Returning student object
            return s;

            }
            catch(Exception e){
                System.out.println(e);

                return null;
            }
            

        }

        // Function to add a student
        public static void addStudent(Student s){
            try{
                // Creating INSERT query (Dynamic)
                String query="INSERT INTO student VALUES(?,?,?)";

                // Prepared Statement for Dynamic Query
                PreparedStatement pst=con.prepareStatement(query);

                // Setting rollNo, name, age
                pst.setInt(1,s.rollNo);
                pst.setString(2,s.name);
                pst.setInt(3,s.age);

                // Executing Query
                int count=pst.executeUpdate();

                // Closing Resources
                pst.close();
                con.close();

                // Printing Success Message
                System.out.println("Student Added Successfully....!");
            }
            catch(Exception e){
                System.out.println("Error in Adding Student");
                System.out.println(e);
            }
            

        }

        // Function to delete a student
        public static void deleteStudent (int rollNo){
            try{

                // Creating a DELETE Query
                String query="DELETE FROM student WHERE RollNo="+rollNo;
                Statement st= con.createStatement();

                // Executing Query
                st.executeUpdate(query);

                // Closing Resources
                st.close();
                con.close();

                // Printing Success Message
                System.out.println("Student Data deleted Successfully....!");
            }
            catch(Exception e){
                System.out.println("Error in Deleting Student data");
                System.out.println(e);
            }
           

        }

    }

    // student class encapsulating rollNo, name, age;
    static class Student {
        int rollNo;
        String name;
        int age;
    }


    public static void main(String args[]){

        // Creating Data Access Object of student
        StudentDao dao=new StudentDao();

        // Connecting with Database
        dao.connect();

        //Fetching data of student
        // Student s=dao.getStudent(1);
        // System.out.println(s.name+" "+s.age);

        // Adding a Student 
        // Student s=new Student();
        // s.rollNo=8;
        // s.name="Abhinav";
        // s.age=22;
        // ;
        // dao.addStudent(s);

        // Deleting a Student
        // dao.deleteStudent(8);

    }
}