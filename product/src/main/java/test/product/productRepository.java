package test.product;

import java.util.*;


import java.sql.*;  

public class productRepository {
	
	List<product> products;
	
	Connection con = null;
	
	public productRepository()
	{
		
		String url = "jdbc:mysql://localhost:3306/product_data";
		String username = "root";
		String password = "password";
	
		try
		{
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(url,username,password);
			 System.out.println("connection sucessfull");
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
	}
	
	public List<product> getitems()
	{
		List<product> products = new ArrayList<>();
		String sql ="select * from product_list";
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			while(record.next())
			{
				product p =new product();
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(6)));
	                p.setDiscount((record.getInt(7)));
	                p.setNo_of_Items((record.getInt(8)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return products;
	}
	

	
	public product getOne()
	{
		String sql ="select * from product_list where Product='AP1'";
		
		product p =new product();
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			if(record.next())
			{	
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(6)));
	                p.setDiscount((record.getInt(7)));
	                p.setNo_of_Items((record.getInt(8)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return p;
		
	}
	
	public product getOneItem(String pid)
	{
		String al="select * from product_list where Product='"+pid+"'";
		String sql =al;
		
		product p =new product();
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			if(record.next())
			{	
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(6)));
	                p.setDiscount((record.getInt(7)));
	                p.setNo_of_Items((record.getInt(8)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return p;
		
	}
	
	public product getStockItem(String pid)
	{
		String al="select Category, Comapny, Product, Price, No_of_Item from product_list where Product='"+pid+"'";
		String sql =al;
		
		product p =new product();
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			if(record.next())
			{	
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	          
	                p.setPrice((record.getInt(4)));
	               
	                p.setNo_of_Items((record.getInt(5)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return p;
		
	}
	
	public List<product> getByCategory(String pid)
	{
		List<product> products = new ArrayList<>();
		String al="select * from product_list where Category='"+pid+"'";
		String sql =al;
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			while(record.next())
			{
				product p =new product();
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(6)));
	                p.setDiscount((record.getInt(7)));
	                p.setNo_of_Items((record.getInt(8)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return products;
	}
	
	public List<product> getByCategoryMinPrice(String pid, int min)
	{
		List<product> products = new ArrayList<>();
		String al="select * from product_list where Category='"+pid+"'"+"and Price <='"+min+"'";
		String sql =al;
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			while(record.next())
			{
				product p =new product();
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(6)));
	                p.setDiscount((record.getInt(7)));
	                p.setNo_of_Items((record.getInt(8)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return products;
	}
	
	public List<product> getByCategoryMaxPrice(String pid, int max)
	{
		List<product> products = new ArrayList<>();
		String al="select * from product_list where Category='"+pid+"'"+"and Price >='"+max+"'";
		String sql =al;
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			while(record.next())
			{
				product p =new product();
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(6)));
	                p.setDiscount((record.getInt(7)));
	                p.setNo_of_Items((record.getInt(8)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return products;
	}
	
	public List<product> getByCompany(String pid)
	{
		List<product> products = new ArrayList<>();
		String al="select * from product_list where Comapny='"+pid+"'";
		String sql =al;
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			while(record.next())
			{
				product p =new product();
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(6)));
	                p.setDiscount((record.getInt(7)));
	                p.setNo_of_Items((record.getInt(8)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return products;
	}
	
	public List<product> getByCompanyMinPrice(String pid, int min)
	{
		List<product> products = new ArrayList<>();
		String al="select * from product_list where Comapny='"+pid+"'"+"and Price <='"+min+"'";
		String sql =al;
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			while(record.next())
			{
				product p =new product();
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(6)));
	                p.setDiscount((record.getInt(7)));
	                p.setNo_of_Items((record.getInt(8)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return products;
	}
	
	public List<product> getByCompanyMaxPrice(String pid, int max)
	{
		List<product> products = new ArrayList<>();
		String al="select * from product_list where Comapny='"+pid+"'"+"and Price >='"+max+"'";
		String sql =al;
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			while(record.next())
			{
				product p =new product();
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(6)));
	                p.setDiscount((record.getInt(7)));
	                p.setNo_of_Items((record.getInt(8)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return products;
	}
	
	
	public List<product> getByDiscountCategory()
	{
		List<product> products = new ArrayList<>();
		String sql ="SELECT Category,Comapny,Product,Color,Description,Discount,No_of_Item,Price-Price*(Discount/100) FROM product_list";
		try {
			Statement st = con.createStatement();
			ResultSet record = st.executeQuery(sql);
			while(record.next())
			{
				product p =new product();
				  	p.setCategory(record.getString(1));
	                p.setCompany(record.getString(2));
	                p.setProduct(record.getString(3));
	                p.setColor(record.getString(4));
	                p.setDescription(record.getString(5));
	                p.setPrice((record.getInt(8)));
	                p.setDiscount((record.getInt(6)));
	                p.setNo_of_Items((record.getInt(7)));
	                
	            products.add(p);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return products;
	}
	
	
	
	

	/*
	 * public void create(product p1) { String
	 * sql="insert into product_data.order_list values (?,?,?,?,?,?,?,?)"; try {
	 * PreparedStatement st=con.prepareStatement(sql);
	 * st.setString(1,p1.getCategory()); st.setString(2,p1.getCompany());
	 * st.setString(3, p1.getProduct()); st.setString(4, p1.getColor());
	 * st.setString(5, p1.getDescription()); st.setInt(6, p1.getPrice());
	 * st.setInt(7, p1.getDiscount()); st.setInt(8, p1.getNo_of_Items());
	 * st.executeUpdate(); } catch(Exception e) { System.out.println(e); } }
	 */
	
	
	
	
 
}
