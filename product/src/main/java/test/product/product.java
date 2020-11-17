package test.product;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "product")
public class product {

	private String Category;
    private String Company;
    private String Product;
    private String Color;
    private String Description;
    private int Price;
    private int Discount;
    private int No_of_Items;
	
    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    public int getNo_of_Items() {
        return No_of_Items;
    }

    public void setNo_of_Items(int no_of_Items) {
        No_of_Items = no_of_Items;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Category='" + Category + '\'' +
                ", Company='" + Company + '\'' +
                ", Product='" + Product + '\'' +
                ", Color='" + Color + '\'' +
                ", Description='" + Description + '\'' +
                ", Price=" + Price +
                ", Discount=" + Discount +
                ", No_of_Items=" + No_of_Items +
                '}';
    }
}

