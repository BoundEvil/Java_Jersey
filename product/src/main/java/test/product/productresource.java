package test.product;

import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("allitem")
public class productresource {
	
	productRepository repo = new productRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public  List<product>  getItems()
	{
		System.out.println("All ITEM CALLED"); 
		System.out.println(repo.getitems());
		return repo.getitems();
	}
	
	
	
	@GET
	@Path("item")
	@Produces(MediaType.APPLICATION_JSON)
	public product getItem()
	{
		System.out.println("All ITEM CALLED"); 
		System.out.println(repo.getOne());
		return repo.getOne();
	}
	
	@GET
	@Path("items/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public product getItems(@PathParam("id") String prod)
	{
		System.out.println("Single item called");
		System.out.println(prod);
		System.out.println(repo.getOneItem(prod));
		return repo.getOneItem(prod);
	}
	

	@GET
	@Path("stock/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public product getStock(@PathParam("id") String prod)
	{
		System.out.println("stock item called");
		System.out.println(prod);
		System.out.println(repo.getStockItem(prod));
		return repo.getStockItem(prod);
	}
	
	@GET
	@Path("category/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List <product> getbycategory(@PathParam("id") String prod)
	{
		System.out.println("category called");
		System.out.println(prod);
		System.out.println(repo.getByCategory(prod));
		return repo.getByCategory(prod);
	}
	
	@GET
	@Path("mincategory/{id}/{min}")
	@Produces(MediaType.APPLICATION_JSON)
	public List <product> getbycategoryminprice(@PathParam("id") String prod, @PathParam("min") int min)
	{
		System.out.println("category with minimum called");
		System.out.println(prod);
		System.out.println(repo.getByCategoryMinPrice(prod,min));
		return repo.getByCategoryMinPrice(prod,min);
	}
	
	@GET
	@Path("maxcategory/{id}/{max}")
	@Produces(MediaType.APPLICATION_JSON)
	public List <product> getbycategorymaxprice(@PathParam("id") String prod, @PathParam("max") int max)
	{
		System.out.println("category with minimum called");
		System.out.println(prod);
		System.out.println(repo.getByCategoryMaxPrice(prod,max));
		return repo.getByCategoryMaxPrice(prod,max);
	}
	
	@GET
	@Path("company/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List <product> getbycompany(@PathParam("id") String prod)
	{
		System.out.println("Company called");
		System.out.println(prod);
		System.out.println(repo.getByCompany(prod));
		return repo.getByCompany(prod);
	}
	
	@GET
	@Path("mincompany/{id}/{min}")
	@Produces(MediaType.APPLICATION_JSON)
	public List <product> getbycompanyminprice(@PathParam("id") String prod, @PathParam("min") int min)
	{
		System.out.println("company with minimum called");
		System.out.println(prod);
		System.out.println(repo.getByCompanyMinPrice(prod,min));
		return repo.getByCompanyMinPrice(prod,min);
	}
	
	@GET
	@Path("maxcompany/{id}/{max}")
	@Produces(MediaType.APPLICATION_JSON)
	public List <product> getbycompanymaxprice(@PathParam("id") String prod, @PathParam("max") int max)
	{
		System.out.println("company with maximum called");
		System.out.println(prod);
		System.out.println(repo.getByCompanyMaxPrice(prod,max));
		return repo.getByCompanyMaxPrice(prod,max);
	}

	@GET
	@Path("discountbycategory")
	@Produces(MediaType.APPLICATION_JSON)
	public List <product> getbydiscountcategory()
	{
		System.out.println("Discounted category called");
		System.out.println(repo.getByDiscountCategory());
		return repo.getByDiscountCategory();
	}
	

	/*
	 * @POST
	 * 
	 * @Path("insertproduct") public product createproduct(product p1) {
	 * System.out.println("Create called"); System.out.println(p1); repo.create(p1);
	 * 
	 * return p1; }
	 */
	

}
