/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Project;

/**
 *
 * @author xuant
 */
public class ProjectDAO extends DBcontext{
    public List<Project> getALL(){
        List<Project> list = new ArrayList<>();
        String sql = "SELECT * FROM DE170791";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String id = rs.getString("ProjectID");
                String name = rs.getString("Name");
                int quality = rs.getInt("Quality");
                boolean feature = rs.getBoolean("Feature");
                Project newProject = new Project(id, name, quality, feature);
                list.add(newProject);
            }
        } catch (Exception e) {
            e.printStackTrace(); // print the exception stack trace for debugging
        }
        return list;
    }
    
    public static void main(String[] args) {
        ProjectDAO pd = new ProjectDAO();
        System.out.println(pd.getALL());
    }
}
