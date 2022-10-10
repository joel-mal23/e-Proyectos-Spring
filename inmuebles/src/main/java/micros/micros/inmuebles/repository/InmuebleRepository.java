package micros.micros.inmuebles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import micros.micros.inmuebles.model.Inmueble;

public interface InmuebleRepository extends JpaRepository <Inmueble, Long>{
	

}
