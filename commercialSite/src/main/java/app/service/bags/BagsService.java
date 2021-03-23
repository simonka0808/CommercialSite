package app.service.bags;

import java.util.List;

import org.springframework.stereotype.Service;

import app.dto.BagDto;
import app.model.Bag;
import app.model.User;

@Service
public interface BagsService {

	public List<Bag> getAllBagsByColour(String colour);

	public List<Bag> getAllBagInStock();

	public List<Bag> getAllBagsByBrand(String brandName);

	public List<Bag> getAllBagsByDescription(String description);

	public Bag saveBag(Bag b);

	public void deleteBag(String uuid);

	public void updateBag(BagDto dto, String uuid);
 
}
