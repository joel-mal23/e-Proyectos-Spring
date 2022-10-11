package arquitectura.micros.compra.service;

import java.util.List;

import arquitectura.micros.compra.model.Compra;

public interface CompraService {

	Compra saveCompra(Compra compra);

	List<Compra> findAllComprasOfUser(Long userId);
}
