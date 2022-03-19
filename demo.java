import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.Scanner;
public class demo {
	
	private static String url="jdbc:mysql://localhost:3306/book?serverTimezone=GMT%2B8&useSSL=false";
	private static String user="root";
	private static String password="root";
	
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("图书管理系统，mysql");
	int flag=scan.nextInt();
	while(flag!=4) {
		
		
		
		
		
		
		
		
		select();
		System.out.println("图书管理系统，mysql");
		flag=scan.nextInt();
		
	}
	
	


	
	
		
  }
public static void select()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO 自动生成的 catch 块
		e1.printStackTrace();
	}
	Connection conn=null;
	PreparedStatement ps=null;
	Statement stat=null;
	ResultSet rs=null;
try {
	   conn=DriverManager.getConnection(url, user, password);
	String sql="SELECT * FROM book where book_id=2 ";
     ps=conn.prepareStatement(sql);
 	ps.setObject(1, 8);
 	ps.execute();
  rs=ps.executeQuery();
  while(rs.next()) {
	 String bookId= rs.getString("book_id");
	 String bookName= rs.getString("book_name");
	 String authorName= rs.getString("author_name");
	 String price= rs.getString("price");
	 book b=new book(Integer.parseInt(bookId),bookName,authorName,Double.parseDouble(price));
	 System.out.println(b);
	 
	 
	 
  }
     
	
	

} catch (SQLException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}finally
{try 
{
	conn.close();
} catch (SQLException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}

try {
	rs.close();
} catch (SQLException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}
}
}

public static void delete(book b) {//删
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO 自动生成的 catch 块
		e1.printStackTrace();
	}
	Connection conn=null;


	PreparedStatement ps=null;
	   try {
		conn=DriverManager.getConnection(url, user, password);
		String sql="DELETE FROM book WHERE book_id=?;";
          ps=conn.prepareStatement(sql);
          ps.setInt(1, b.getBookId());
          ps.executeUpdate();
          
	} catch (SQLException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}finally
	   {try 
	   {
	   	conn.close();
	   } catch (SQLException e) {
	   	// TODO 自动生成的 catch 块
	   	e.printStackTrace();
	   }
	   try {
	   	ps.close();
	   } catch (SQLException e) {
	   	// TODO 自动生成的 catch 块
	   	e.printStackTrace();
	   }	
	   
	 
	   }

	
	
}

public static void insert(book b) {//增
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO 自动生成的 catch 块
		e1.printStackTrace();
	}
	Connection conn=null;


	PreparedStatement ps=null;
	   try {
		conn=DriverManager.getConnection(url, user, password);
		String sql="INSERT INTO book(book_id,book_name,author_name,price) VALUES(?,?,?,?)";
          ps=conn.prepareStatement(sql);
          ps.setInt(1, b.getBookId());
          ps.setString(2, b.getBookName());
          ps.setString(3, b.getAuthorName());
          ps.setDouble(4, b.getPrice());
          ps.executeUpdate();
          
	} catch (SQLException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}finally
	   {try 
	   {
	   	conn.close();
	   } catch (SQLException e) {
	   	// TODO 自动生成的 catch 块
	   	e.printStackTrace();
	   }
	   try {
	   	ps.close();
	   } catch (SQLException e) {
	   	// TODO 自动生成的 catch 块
	   	e.printStackTrace();
	   }	
	   
	 
	   }

	 
	
}
public static void change()//改
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO 自动生成的 catch 块
		e1.printStackTrace();
	}
	Connection conn=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
try {
	   conn=DriverManager.getConnection(url, user, password);
	String sql="update book set book_name=? where book_id=?";
 ps=conn.prepareStatement(sql);
	ps.setObject(1, "莫扎特");
	ps.setObject(2, 1);
	ps.execute();
	
	
	

} catch (SQLException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}finally
{try 
{
	conn.close();
} catch (SQLException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}
try {
	ps.close();
} catch (SQLException e) {
	// TODO 自动生成的 catch 块
	e.printStackTrace();
}

}
}
}
