package arquitectura.micros.compra.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arquitectura.micros.compra.model.Compra;
import arquitectura.micros.compra.repository.CompraRepository;

@Service
public class CompraServiceImpl implements CompraService{

	
	@Autowired
	private CompraRepository compraRepository;
	
	
	@Override
	public Compra saveCompra(Compra compra)
	{
		compra.setFechaCompra(LocalDateTime.now());
		
		return  compraRepository.save(compra);

	}
	
	@Override
	public List<Compra> findAllComprasOfUser(Long userId)
	{
		return compraRepository.findAllByUserId(userId);
	}

}
