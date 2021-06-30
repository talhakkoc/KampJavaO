package kodlama.io.northwind.entities.concretes;

import javax.persistence.*;
import lombok.*;

@Data  
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="product_id")
	private int id ; 
	
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice ;
	
	@Column(name="units_in_stock")
	private short unitsInSrock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;

}
