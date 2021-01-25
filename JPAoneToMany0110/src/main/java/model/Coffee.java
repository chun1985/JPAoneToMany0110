package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the coffees database table.
 * 
 */
@Entity
@Table(name = "coffees")
@NamedQuery(name = "Coffee.findAll", query = "SELECT c FROM Coffee c")
public class Coffee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COF_NAME")
	private String cofName;

	private double price;

	private int sales;

	private int total;

	// bi-directional many-to-one association to Supplier
	@ManyToOne
	@JoinColumn(name = "SUP_ID")
	private Supplier supplier;

	public Coffee() {
	}

	public String getCofName() {
		return this.cofName;
	}

	public void setCofName(String cofName) {
		this.cofName = cofName;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSales() {
		return this.sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

}