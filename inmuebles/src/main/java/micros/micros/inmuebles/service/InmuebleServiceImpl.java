package micros.micros.inmuebles.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import micros.micros.inmuebles.model.Inmueble;
import micros.micros.inmuebles.repository.InmuebleRepository;

@Service
public class InmuebleServiceImpl implements InmuebleService{
	
	private final InmuebleRepository inmuebleRepository;

	public InmuebleServiceImpl(InmuebleRepository inmuebleRepository) {
		this.inmuebleRepository = inmuebleRepository;
	}
	
	@Override
	public Inmueble saveInmueble (Inmueble inmueble)
	{
		
		inmueble.setFecha(LocalDateTime.now());
		return inmuebleRepository.save(inmueble);
	}
	
	
	@Override
	public void deleteInmueble(Long inmuebleId) {
		inmuebleRepository.deleteById(inmuebleId);
		
		
	}
	
	@Override
	public List<Inmueble> findAllInmuebles(){
		
		return inmuebleRepository.findAll();
		
	}
	

}
