package br.com.tiago.tat.ads.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.tiago.tat.ads.cliente.dto.ClienteDTO;
import br.com.tiago.tat.ads.cliente.model.Cliente;
import br.com.tiago.tat.ads.cliente.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public ResponseEntity<List<ClienteDTO>> listarClientes() {

		List<Cliente> clientes = this.clienteRepository.findAll();

		if (clientes.isEmpty()) {
			System.out.println("Lista vazia");
		}

		return ResponseEntity.ok().body(ClienteDTO.converter(clientes));

	}

}
