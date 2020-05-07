package controller;

import java.util.List;

import javax.faces.bean.*;

import entities.Product;
import model.*;

@ManagedBean(name = "productController")
@SessionScoped
public class ProductController {

	private ProductModel pm = new ProductModel();
	private Product p = new Product();

	public List<Product> findAll() {
		return pm.findAll();
	}

	public String add() {
		this.pm.create(this.p);
		this.p = new Product();
		return "index";
	}

	public void delete(Product p) {
		this.pm.delete(p);
	}

	public String edit(Product p) {
		this.p = p;
		return "edit";
	}

	public String edit() {
		this.pm.update(this.p);
		return "index";
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

}
