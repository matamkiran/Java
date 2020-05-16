package com.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ImageInsert {	
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
		 String query = "INSERT INTO images(img) VALUES(?)";

		 try (Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
				 PreparedStatement pst = con.prepareStatement(query)) {

	            File img = new File("D:/image1.jpg");

	            try (FileInputStream fin = new FileInputStream(img)) {

	                pst.setBinaryStream(1, fin, (int) img.length());
	               int i= pst.executeUpdate();
	               
	               System.out.println(i+" Images inserted succcessfully ");
	            } catch (IOException ex) {
	    			ex.printStackTrace();

	            }

	        } catch (SQLException ex) {
				ex.printStackTrace();

	        }
		
	}



}
