
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LastEnteredStudentID {


    ArrayList<Integer> arrl = new ArrayList<Integer>();

    protected int verification() {

        int l = 0;

        if(arrl.size()>1){
            arrl.clear();
        }


        DBConnector db = new DBConnector();
        Connection con = db.connect();

        String sql = "SELECT MAX(StudentID) FROM `student`";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Maximum Student's ID : " + rs.getInt("MAX(StudentID)"));
                l = rs.getInt("MAX(StudentID)");
                for(int i = 1; i <= rs.getInt("MAX(StudentID)"); i++){
                    arrl.add(i);
                }
                System.out.println(arrl);
                Object arr[] = arrl.toArray();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return l;

    }


}

