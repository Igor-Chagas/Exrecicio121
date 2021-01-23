package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
		
	public Order (Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Date getMoment() {
		return moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public Client getClient() {
		return client;
	}
	
	public List<OrderItem> getItem(){
		return items;
	}
	
		public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		Double total = 0.0;
		for (OrderItem st : items) {
			total += st.subTotal();
		}
		return total;
	}
	
	public String toString(int i) {
				return getItem().get(i).getProduct().getNameProduct() 
					+ ", $" + String.format("%.2f", getItem().get(i).getProduct().getPrice())
					+ ", Quantity: "+ getItem().get(i).getQuantity()
					+ ", Subtotal: $" + String.format("%.2f", getItem().get(i).subTotal());	
	}
	
	public String toString() {
		return String.format("%.2f", total());
	}
	
}


