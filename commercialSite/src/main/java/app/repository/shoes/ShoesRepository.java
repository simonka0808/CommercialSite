package app.repository.shoes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.model.Shoes;
import app.util.ShoesSize;

@Repository
public interface ShoesRepository extends JpaRepository<Shoes, String> {

	List<Shoes> findByShoesSize(int size);
	
	List<Shoes> findByPriceLessThanEqual(double price);
	
	List<Shoes> findByInStockIsTrue();
	
	List<Shoes> findByShoesSizeEquals(int size);
	
	List<Shoes> findByShoesBrandEquals(String brand);
}
