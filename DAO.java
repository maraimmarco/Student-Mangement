package casestudy;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Resal
 */
public class DAO {
    private final static String BD_URL="jdbc:oracle:thin:@localhost:1521:XE";
    private final static String BD_User="casestudy";
    private final static String DB_password="root";
   /*public static int addstudent(DtoStudent student) {
    int result = 0;
    try {
        System.out.println("enter in method");
        Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password);
        System.out.println("connected");

        if (student != null) {
            PreparedStatement statement = con.prepareCall("insert into student (national_id, first_name, last_name, user_name, date_of_birth,phone,TRACK_ID) "
                    + "values (?, ?, ?, ?, ?, ?,?)");

            statement.setLong(1, (int) student.getNationalId());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.setString(4, student.getUserName());
            statement.setDate(5, student.getDateOfBirth());
            System.out.println("inserted");
            statement.setString(6, student.getPhone());
             System.out.println("inserted");
            statement.setInt(7, student.getTrackId());
             System.out.println("inserted");

            result = statement.executeUpdate();

            // Close resources
            statement.close();
        } else {
            System.out.println("Error: Student object is null");
        }

        // Close connection
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
}*/
public static int addInstructor(DtoInstructor instructor){
    int result=0;
    try {
        System.out.println("enter in method");
        Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password);
        System.out.println("connected");

        if (instructor != null) {
            PreparedStatement statement = con.prepareCall("INSERT INTO instructor (national_id, first_name, last_name, year_of_experince,CIRTAFICATE,track_id) values(?,?,?,?,?,?)");

            statement.setInt(1,instructor.getNationalId());
            statement.setString(2, instructor.getFirstName());
            statement.setString(3, instructor.getLastName());
            statement.setDate(4, instructor.getYearOfExperience());
            //statement.setInt(5, instructor.getSalary());
            statement.setString(5, instructor.getCirtifate());
            statement.setInt(6,instructor.getTrackId());
            System.out.println("inserted");
            result = statement.executeUpdate();
            statement.close();
        } else {
            System.out.println("Error: Instructor object is null");
        }
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
}
public static int addStudent(DtoStudent student){
    int result=0;
    try {
        System.out.println("enter in method");
        Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password);
        System.out.println("connected");

        if (student != null) {
            PreparedStatement statement = con.prepareCall( "insert into student(national_id,first_name,last_name,user_name,phone,date_of_birth,track_id)values (?,?,?,?,?,?,?)");
            statement.setInt(1,student.getNationalId());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.setString(4, student.getUserName());
            //statement.setInt(5, instructor.getSalary());
            statement.setDate(5, student.getDateOfBirth());
            statement.setString(6,student.getPhone());
            statement.setInt(7, student.getTrackId());
            System.out.println("inserted");
            result = statement.executeUpdate();
            statement.close();
        } else {
            System.out.println("Error: Instructor object is null");
        }
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
}
public static int addTrack(DtoTrack track){
    int result=0;
    try{
        Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password);
        System.out.println("connected"); 
        if(track != null){
            PreparedStatement statement=con.prepareCall("insert into track(track_id,track_name)values(track_id.nextVal,?)");
            statement.setString(1,track.getTrackNameTrack());
            result = statement.executeUpdate();
        statement.close();
        } else {
            System.out.println("Error: Instructor object is null");
        }
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
    
}
public static int addBranch(DtoBranch branch){
    int result = 0;
    try{
        Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password);
        System.out.println("connected"); 
        if(branch != null){
            PreparedStatement statement = con.prepareCall("insert into branch(branch_id,address,city) values(branch_id.nextVal, ?, ?)");

            statement.setString(1, branch.getAddress()); 
            statement.setString(2, branch.getCity()); 
            result = statement.executeUpdate();
            statement.close();
        } else {
            System.out.println("Error: Branch object is null");
        }
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
}
public static int addSubject(DtoSubject subject){
    int result = 0;
    try{
        Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password);
        System.out.println("connected"); 
        if(subject != null){
            PreparedStatement statement = con.prepareCall("insert into subject(subject_code,subject_name) values(subject_code.nextVal, ?)");

            statement.setString(1, subject.getSubjectName()); 
            result = statement.executeUpdate();
            statement.close();
        } else {
            System.out.println("Error: Branch object is null");
        }
        // Close connection
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return result;
}
public static List<DtoInstructor>selectInstructor(){
    System.out.println("instructor will be selected from DAO");
    List<DtoInstructor> instructors=new ArrayList<>();
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)){
        System.out.println("Connected");
        System.out.println("select instructor method in dao");
        PreparedStatement statement=con.prepareStatement("select national_id,first_name||' '||last_name as Name,YEAR_OF_EXPERINCE,CIRTAFICATE,salary, track_name\n" +
                                                "from instructor , track \n" +
                                                "where INSTRUCTOR.TRACK_ID=TRACK.TRACK_ID" );
        ResultSet result = statement.executeQuery();
        while(result.next()){
            int nationalId=result.getInt("national_id");
            String firstName=result.getString("Name");
            Date yearOfexp=result.getDate("YEAR_OF_EXPERINCE");
            String cirtifacte=result.getString("CIRTAFICATE");
            int salary=result.getInt("salary");
            String trackName=result.getString("track_name");
            DtoInstructor instructor=new DtoInstructor(nationalId,firstName,yearOfexp,cirtifacte,salary,trackName);
            instructors.add(instructor);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return instructors;
}    

public static List<DtoStudent> selectAll() {
    List<DtoStudent> students = new ArrayList<>();
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        System.out.println("Connected");
        System.out.println("select method in dao");
        PreparedStatement statement = con.prepareStatement("SELECT student.national_id,student.first_name,student.last_name,student.track_id,student.date_of_birth,track.track_name,trunc(months_between(sysdate,date_of_birth)/12)  FROM student\n" +
" JOIN track ON student.track_id = track.track_id ");
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            long nationalId = result.getLong("national_id");
            String firstName = result.getString("first_name");
            String lastName = result.getString("last_name");
            int trackId = result.getInt("track_id");
            Date dateOfBirth = result.getDate("date_of_birth");
            String trackName = result.getString("track_name");
            int age =result.getInt("trunc(months_between(sysdate,date_of_birth)/12)");
            DtoStudent student = new DtoStudent((int)nationalId, firstName, lastName, trackId, age,trackName);
            students.add(student);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return students;
}

public static List<DtoTrack> selectTrack() {
    List<DtoTrack> Track = new ArrayList<>();
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        System.out.println("Connected");
        System.out.println("select method in dao");
        PreparedStatement statement = con.prepareStatement("select track_id,track_name from track ");
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            int TrackId = result.getInt("track_id");
            String TrackName = result.getString("track_name");
            DtoTrack Trackk = new DtoTrack(TrackId,TrackName);
            Track.add(Trackk);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return Track;
}

public static List<DtoSubject> selectSubjects() {
    List<DtoSubject> subjects = new ArrayList<>();
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
       PreparedStatement statement = con.prepareStatement("select subject_code,subject_name from subject");
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            int subjectId = result.getInt("subject_code");
            String subjectName = result.getString("subject_name");
             DtoSubject subjectt = new DtoSubject(subjectId,subjectName);
            subjects.add(subjectt);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return subjects;
}

public static List<DtoBranch> selectBranch() {
    List<DtoBranch> Branch = new ArrayList<>();
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
       PreparedStatement statement = con.prepareStatement("select branch_id,city,address from branch");
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            int BranchId = result.getInt("branch_id");
            String City = result.getString("City");
            String Address=result.getString("address");
            DtoBranch Branchs = new DtoBranch(BranchId,City,Address);
            Branch.add(Branchs);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return Branch;
}

public static int deleteStudent(DtoStudent student) throws SQLException {
    int result = 0;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        System.out.println("Connected");
        System.out.println("Delete method in DAO");
        // Delete from sub_grade table first
        PreparedStatement statamentTwo = con.prepareStatement("DELETE FROM student_faculty_grade WHERE student_id = ?");
        statamentTwo.setLong(1, student.getNationalId());
        result = statamentTwo.executeUpdate();
        System.out.println("delete from table one");
        PreparedStatement statementThree=con.prepareStatement("delete from learning where student_id=?");
        statementThree.setLong(1,student.getNationalId());
        result=statementThree.executeUpdate();
        System.out.println("delete from table two");
        PreparedStatement statement = con.prepareStatement("DELETE FROM student WHERE national_id = ?");
        statement.setLong(1, student.getNationalId());
        System.out.println("delete from table three");
        result = statement.executeUpdate();
        if (result > 0) {
            System.out.println("Student with national_id " + student.getNationalId() + " deleted successfully.");
        } else {
            System.out.println("No matching student found with national_id " + student.getNationalId());
        }
    } catch (SQLException e) {
        System.err.println("Error during deleteStudent operation: " + e.getMessage());
        throw e; 
    }
    return result;
}

//////////done also in data base /////////
public static int deleteInsructor(DtoInstructor instructor) throws SQLException{
    int result =0;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        System.out.println("Connected");
        System.out.println("Delete method in DAO");
        PreparedStatement statementOne=con.prepareStatement("delete from working where instructor_id=?");
        statementOne.setInt(1,instructor.getNationalId());        
       PreparedStatement statementThree = con.prepareStatement("delete from instructor where SUPERVISOR_ID=?");
        statementThree.setInt(1, instructor.getNationalId());
        PreparedStatement statement=con.prepareStatement("delete from instructor where national_id=?");
        statement.setInt(1,instructor.getNationalId());
        result=statement.executeUpdate();
}catch (SQLException e) {
        System.err.println("Error during deleteStudent operation: " + e.getMessage());
        throw e; 
    }
    return result;
}

public static int deleteTrack(DtoTrack track) throws SQLException {
    int result = 0;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        System.out.println("Connected");
        System.out.println("Delete method in DAO");
        PreparedStatement statmentOne =con.prepareCall("delete from allocation  where track_id=?");
        statmentOne.setInt(1,track.getTrackId());
        PreparedStatement statementTwo=con.prepareCall("delete from instructor where track_id=?");
        statementTwo.setInt(1,track.getTrackId());
        PreparedStatement statementThree =con.prepareCall("delete from student where track_id=?");
        statementThree.setInt(1,track.getTrackId());
        PreparedStatement statementFour=con.prepareCall("delete from taken_tab where track_id=?");
        statementFour.setInt(1,track.getTrackId());
        PreparedStatement statement = con.prepareStatement("DELETE FROM track WHERE track_id = ?");
        statement.setInt(1, track.getTrackId());
        result = statement.executeUpdate();
        if (result > 0) {
            System.out.println("Track with track_id " + track.getTrackId() + " deleted successfully.");
        } else {
            System.out.println("No matching track found with track_id " + track.getTrackId());
        }
    } catch (SQLException e) {
        System.err.println("Error during deleteTrack operation: " + e.getMessage());
        throw e; 
    }
    return result;
}

public static int deleteBranch(DtoBranch branch) throws SQLException {
    int result = 0;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        PreparedStatement statamentTwo = con.prepareStatement("DELETE FROM branch WHERE branch_id = ?");
        statamentTwo.setLong(1, branch.getBranchId());
        result = statamentTwo.executeUpdate();  
          result = statamentTwo.executeUpdate();
        if (result > 0) {
            System.out.println("branch with branch_id " + branch.getBranchId()+ " deleted successfully.");
        } else {
            System.out.println("No matching student found with national_id " + branch.getBranchId());
        }
    } catch (SQLException e) {
        System.err.println("Error during deleteStudent operation: " + e.getMessage());
        throw e; 
    }
    return result;
}

public static int deleteSubject(DtoSubject subject) throws SQLException{
    int result=0;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        PreparedStatement statamentOne = con.prepareStatement("DELETE FROM learning WHERE subject_code = ?");
        statamentOne.setInt(1, subject.getSubjectCode());
        result = statamentOne.executeUpdate();  
        PreparedStatement statementTwo=con.prepareCall("delete from taken_tab where subject_id=?");
        statementTwo.setInt(1, subject.getSubjectCode());
        result =statementTwo.executeUpdate();
        PreparedStatement statement=con.prepareCall("delete from subject where subject_code=?");
        statement.setInt(1, subject.getSubjectCode());
        result=statement.executeUpdate();
        if (result > 0) {
            System.out.println("branch with branch_id " + subject.getSubjectCode()+ " deleted successfully.");
        } else {
            System.out.println("No matching student found with national_id " + subject.getSubjectCode());
        }
    } catch (SQLException e) {
        System.err.println("Error during deleteStudent operation: " + e.getMessage());
        throw e; 
    }
    return result;
}
    

public static int update(DtoInstructor instructor) throws SQLException {
    int result = 0;
    try (Connection connection = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        String procedure = "{CALL CASESTUDY.updating_info(?)}"; 
        CallableStatement callableStatement = connection.prepareCall(procedure);
        callableStatement.setInt(1, instructor.getNationalId());
        callableStatement.execute();
        result = 1; 
    } catch (SQLException e) {
        throw e;
    }
    return result;
}


public static boolean selectNationalId(DtoStudent student) throws SQLException {
    boolean result = false;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        System.out.println("Connected");
        System.out.println("Selected national Id for user");
        PreparedStatement statement = con.prepareStatement("SELECT * FROM student WHERE national_id = ?");
        statement.setLong(1, student.getNationalId());
        System.out.println(student.getNationalId());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            result = true; 
        }
    } catch (SQLException e) {
        throw e;
    }
    return result;
}

public static boolean selectNationalIdInstructor(DtoInstructor instructor) throws SQLException {
    boolean result = false;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        System.out.println("Connected");
        System.out.println("Selected national Id for user");
        PreparedStatement statement = con.prepareStatement("SELECT * FROM instructor WHERE national_id = ?");
        statement.setLong(1, instructor.getNationalId());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            result = true; 
        }
    } catch (SQLException e) {
        throw e;
    }
    return result;
}

public static boolean selectTrackId(DtoTrack track) throws SQLException {
    boolean result = false;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        System.out.println("Connected");
        System.out.println("Selected national Id for user");
        PreparedStatement statement = con.prepareStatement("SELECT * FROM track WHERE track_id = ?");
        statement.setInt(1, track.getTrackId());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            result = true; 
        }
    } catch (SQLException e) {
        throw e;
    }
    return result;
}
public static int selectSubName(DtoSubject subject) throws SQLException {
    int result = 0;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {

        PreparedStatement statement = con.prepareStatement("SELECT subject_code FROM subject WHERE subject_name = ?");
        statement.setString(1, subject.getSubjectName());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            result = resultSet.getInt("subject_code");
            System.out.println(resultSet.getInt("subject_code"));
            System.out.print(result);
        }
    } catch (SQLException e) {
        throw e;
    }
    return result;
}
public static int selectTrackName(DtoTrack track) throws SQLException {
    int result = 0;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {

        PreparedStatement statement = con.prepareStatement("SELECT track_id FROM track WHERE track_name = ?");
        statement.setString(1, track.getTrackNameTrack());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            result = resultSet.getInt("track_id");
        }
    } catch (SQLException e) {
        throw e;
    }
    return result;
}


public static boolean selectBranchId(DtoBranch branch) throws SQLException {
    boolean result = false;
    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        System.out.println("Connected");
        System.out.println("Selected branch Id for user");
        PreparedStatement statement = con.prepareStatement("SELECT * FROM branch WHERE branch_id = ?");
        statement.setInt(1, branch.getBranchId());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            result = true; 
        }
    } catch (SQLException e) {
        throw e;
    }
    return result;
}

public static boolean selectSubjectId(DtoSubject subject) throws SQLException{
    boolean result =false;
    try(Connection con=DriverManager.getConnection(BD_URL, BD_User, DB_password)){
        PreparedStatement statement =con.prepareCall("select * from subject where subject_code=?");
        statement.setInt(1,subject.getSubjectCode());
        ResultSet resultSet=statement.executeQuery();
        if (resultSet.next()) {
            result = true; 
        }
    } catch (SQLException e) {
        throw e;
    }
    return result;
    }
public static boolean selectTrack(DtoTrack track)throws SQLException{
    boolean result=false;
        try(Connection con=DriverManager.getConnection(BD_URL, BD_User, DB_password)){
        PreparedStatement statement =con.prepareCall("select track_id from track where track_name=?");
        statement.setString(1,track.getTrackNameTrack());
        ResultSet resultSet=statement.executeQuery();
        if (resultSet.next()) {
            result = true; 
        }
    } catch (SQLException e) {
        throw e;
    }
    return result;
    }
public static boolean selectSubject(DtoSubject subject)throws SQLException{
     boolean result=false;
        try(Connection con=DriverManager.getConnection(BD_URL, BD_User, DB_password)){
        PreparedStatement statement =con.prepareCall("select subject_code from subject where subject_name=?");
        statement.setString(1,subject.getSubjectName());
        ResultSet resultSet=statement.executeQuery();
        if (resultSet.next()) {
            result = true; 
        }
    } catch (SQLException e) {
        throw e;
    }
    return result;
}
/*public static double Cal(DtoStudent student) throws SQLException {
    double gpa = -1; // Default value indicating an error

    try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password)) {
        String procedure =
            "DECLARE " +
            "    result NUMBER(8,2); " +
            "    exception_value NUMBER := 0; " +
            "    grade_array grade_array_type := grade_array_type(); " +
            "    CURSOR student_cursor IS " +
            "        SELECT grade " +
            "        FROM learning, student, grade " +
            "        WHERE learning.student_id = student.national_id " +
            "        AND learning.grade_id = grade.grade_id " +
            "        AND student.national_id = ?; " +
            "BEGIN " +
            "    FOR student_rec IN student_cursor LOOP " +
            "        grade_array.EXTEND; " +
            "        grade_array(grade_array.LAST) := student_rec.grade; " +
            "    END LOOP; " +
            "    result := calculate_gpa(grade_array); " +
            "    ? := result; " + // Assigning the result to the OUT parameter
            "EXCEPTION " +
            "    WHEN OTHERS THEN " +
            "        exception_value := -1; " + // Assigning an error value if an exception occurs
            "        ? := exception_value; " +
            "END;";

        CallableStatement callableStatement = con.prepareCall(procedure);
        callableStatement.setLong(1, student.getNationalId());
        callableStatement.registerOutParameter(2, Types.DOUBLE); // Registering the OUT parameter
        callableStatement.registerOutParameter(3, Types.DOUBLE); // Registering the OUT parameter for exception handling
        callableStatement.execute();

        // Retrieving the result
        gpa = callableStatement.getDouble(2);
        double exceptionValue = callableStatement.getDouble(3);
        if (exceptionValue == -1) {
            System.out.println("An error occurred while calculating GPA.");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return gpa;
}*/
public static double calc_subject(int track, int subject) {
        double result = 0.0;
        try (Connection con = DriverManager.getConnection(BD_URL, BD_User, DB_password);
             CallableStatement callableStatement = con.prepareCall("{ ? = CALL calc_subject(?, ?) }")) {

            callableStatement.registerOutParameter(1, Types.NUMERIC);
            callableStatement.setInt(2, track);
            callableStatement.setInt(3, subject);
            callableStatement.execute();
            result = callableStatement.getDouble(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

}