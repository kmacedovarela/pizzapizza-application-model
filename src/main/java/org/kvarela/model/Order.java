package org.kvarela.model;

/*
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "order")
public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String address;
	private java.lang.String flavor;
	private java.lang.String phone;
	private java.lang.Double price;
	// @org.kie.api.definition.type.Label(value = "Time in minutes")
	private java.lang.Integer time;
	private java.lang.Double discount;

	private java.lang.String email;

	private java.lang.String customerName;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "ORDER_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "ORDER_ID_GENERATOR", sequenceName = "ORDER_ID_SEQ")
	private java.lang.Long id;

	public Order() {
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.String getFlavor() {
		return this.flavor;
	}

	public void setFlavor(java.lang.String flavor) {
		this.flavor = flavor;
	}

	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}

	public java.lang.Double getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Double price) {
		this.price = price;
	}

	public java.lang.Integer getTime() {
		return this.time;
	}

	public void setTime(java.lang.Integer time) {
		this.time = time;
	}

	public java.lang.Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(java.lang.Double discount) {
		this.discount = discount;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(java.lang.String customerName) {
		this.customerName = customerName;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public Order(java.lang.String address, java.lang.String flavor,
			java.lang.String phone, java.lang.Double price,
			java.lang.Integer time, java.lang.Double discount,
			java.lang.String email, java.lang.String customerName,
			java.lang.Long id) {
		this.address = address;
		this.flavor = flavor;
		this.phone = phone;
		this.price = price;
		this.time = time;
		this.discount = discount;
		this.email = email;
		this.customerName = customerName;
		this.id = id;
	}

}