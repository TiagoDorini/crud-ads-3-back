package br.com.tiago.tat.ads.cliente.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiago.tat.ads.cliente.dto.ClienteDTO;
import br.com.tiago.tat.ads.cliente.service.ClienteService;

@RestController
@RequestMapping("/tcc")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ResponseEntity<List<ClienteDTO>> listarClientes() {
		return clienteService.listarClientes();
	}

}
