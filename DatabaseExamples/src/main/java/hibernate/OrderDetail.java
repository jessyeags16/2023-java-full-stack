package hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "orderDetails")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "order_id", insertable = false, updatable = false)
	private Integer orderId;
	
	@Column(name = "product_id")
	private Integer productId;
	
	@Column(name = "quantity_ordered")
	private Integer quantityOrdered;
	
	@Column(name = "price_each", columnDefinition ="decimal", precision =10, scale =2 )
	private Double priceEach;
	
	@Column(name = "order_line_number")
	private Short orderLineNumber;
	
	@ToString.Exclude // wont do a to string on this 
	@ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id", nullable = false) // is your foreign key null or not?
	private Order order;
	
	
	

}
