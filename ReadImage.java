package com.org;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadImage {	
	public static void main(String[] args){

		/*try{
			// Loading driver manager
			Class.forName("org.postgresql.Driver");
			//connection object creation with help of Driver manager
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
			System.out.println("Welcome");
			System.out.println("connections" +con);
			//con.
			Statement stmt=con.createStatement();
			  
		   int i=	stmt.executeUpdate("UPDATE EMPLOYEE set designation='lead' where age=16");
		   if(i>0){
			   System.out.println( i +" rows Updated successfully");
		   }else{
			   System.out.println("Updated failed");

		   }
			stmt.close();
			con.close();
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
*/
		String query = "SELECT img, LENGTH(img) FROM images WHERE id = 3";

		 try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
				 PreparedStatement pst = con.prepareStatement(query);
				 ResultSet rs = pst.executeQuery()) {
	            rs.next(); 
	            //image name to create on which path
	            File img = new File("D:/image_new_download.jpg");

	            try  {
	            	FileOutputStream fos = new FileOutputStream(img);
	            	// reading image length
	                int len = rs.getInt(2);
	                //reading the bytes from table from the image column
	                byte[] buf = rs.getBytes("img");
	                //wrting the bytes data to specified location
	                fos.write(buf, 0, len);
	                System.out.println("Image download completed");
	                fos.close();
	            } catch (IOException ex) {
	    			ex.printStackTrace();

	            }

	        } catch (SQLException ex) {
				ex.printStackTrace();

	        }
		
	}



}
