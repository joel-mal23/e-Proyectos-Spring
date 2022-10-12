package arquitectura.micros.compra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import arquitectura.micros.compra.model.Compra;

public interface CompraRepository  extends JpaRepository<Compra,Long>  {
	
	List<Compra> findAllByUserId(Long userId); 
	
}
