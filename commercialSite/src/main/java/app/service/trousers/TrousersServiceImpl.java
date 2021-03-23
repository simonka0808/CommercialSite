package app.service.trousers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.model.Trousers;
import app.repository.bags.BagRepository;
import app.repository.trousers.TrousersRepository;
import app.service.bags.BagsServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data
@AllArgsConstructor
public class TrousersServiceImpl implements TrousersService {

	@Autowired
	TrousersRepository trousersRepository;

	@Override
	public List<Trousers> getAllTrousersByColour(String colour) {
		return trousersRepository.findByColour(colour);
	}

	@Override
	public List<Trousers> getAllTrousersInStock() {
		return trousersRepository.findByInStockIsTrue();
	}

	@Override
	public List<Trousers> getAllTrousersByPrice(double price) {
		return trousersRepository.findByPriceGreaterThanEqual(price);
	}

	@Override
	public List<Trousers> getAllTrousersByModel(String model) {
		return trousersRepository.findByTrousersModel(model);

	}

	@Override
	public Trousers save(Trousers tr) {
		return trousersRepository.save(tr);
	}

}
