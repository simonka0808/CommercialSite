package app.service.bags;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.dto.BagDto;
import app.model.Bag;
import app.model.User;
import app.repository.bags.BagRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
@Transactional
public class BagsServiceImpl implements BagsService {

	@Autowired
	BagRepository bagsRepostiroy;

	@Override
	public List<Bag> getAllBagsByColour(String colour) {
		return bagsRepostiroy.findByColour(colour);
	}

	@Override
	public List<Bag> getAllBagInStock() {
		return bagsRepostiroy.findByInStockIsTrue();
	}

	@Override
	public List<Bag> getAllBagsByBrand(String brandName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bag> getAllBagsByDescription(String descriptionByUser) {
		String[] splitDescriptionByUser = descriptionByUser.split(", ");

		List<Bag> allBags = bagsRepostiroy.findAll();
		List<Bag> bagsByDescription = new ArrayList<>();
		for (int i = 0; i < allBags.size(); i++) {
			if (allBags.get(i).getDescription().split(",").equals(splitDescriptionByUser)) {
				bagsByDescription.add(allBags.get(i));
			}
		}
		return bagsByDescription;

	}

	@Override
	public Bag saveBag(Bag b) {
		return bagsRepostiroy.save(b);

	}

	@Override
	public void deleteBag(String uuid) {

		bagsRepostiroy.deleteById(uuid);
	}

	@Override
	public void updateBag(BagDto bagDto, String uuid) {

		if (bagDto == null || uuid == null) {
			return;
		}

		Bag bag = bagsRepostiroy.getOne(uuid);

		if (bagDto != null && uuid != null) {

			bag.setBagBrand(bagDto.getBagBrand());
			bag.setBagModel(bagDto.getBagModel());
			bag.setBagQuantity(bagDto.getBagQuantity());
			bag.setPrice(bagDto.getPrice());
			bag.setColour(bagDto.getColour());
			bag.setDescription(bagDto.getDescription());

		}

	}

}
