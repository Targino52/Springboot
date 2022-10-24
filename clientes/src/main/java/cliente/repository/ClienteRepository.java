package cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cliente.exemplo.clientes.model.cliente;

public interface ClienteRepository extends JpaRepository<cliente, Long> {
    
}
