package micros.micros.inmuebles.service;

import java.util.List;

import micros.micros.inmuebles.model.Inmueble;


public interface InmuebleService {

	Inmueble saveInmueble(Inmueble inmueble);

	void deleteInmueble(Long inmuebleId);

	List<Inmueble> findAllInmuebless();

}
