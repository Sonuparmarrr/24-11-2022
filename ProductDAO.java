package com.spring.core.jdbc.dao.com;
import java.util.List;

public interface ProductDAO {
	public void save(Product product);

	public Product getById(int id);
		
	public void update(Product product);
		
	public void deleteById(int id);

	public List< Product > getAll();

	public Product getByName(String name);

	public List< Product > getByNames(String substring);

	public List<Product> getByBetweenPrice(double iPrice, double oPrice);

	public List<Product> getDiscontinuedProducts();

}