package br.com.tiago.tat.ads.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tiago.tat.ads.cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
}
