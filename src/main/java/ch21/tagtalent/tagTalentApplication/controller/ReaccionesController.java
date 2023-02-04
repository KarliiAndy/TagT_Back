package ch21.tagtalent.tagTalentApplication.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ch21.tagtalent.tagTalentApplication.model.Reacciones;
import ch21.tagtalent.tagTalentApplication.service.ReaccionesService;

@RestController
@RequestMapping(path = "/api/reaccion/")
public class ReaccionesController {
	private final ReaccionesService reaccionesService;
	@Autowired
	public ReaccionesController(ReaccionesService reaccionService) {
				this.reaccionesService=reaccionService;		
	}
		
	@GetMapping
	public List<Reacciones>getAllReacciones(){
		return reaccionesService.getAllReacciones();
	}
		
	@GetMapping(path = "{reaId}") 
	public Reacciones getReaccion(@PathVariable("reaId") Long id ) {
		return reaccionesService.getReaccion(id);
	}
	
	@DeleteMapping
	public Reacciones deleteReacciones(Long id) {
		return reaccionesService.deleteReaccion(id);
	}
		
	@PostMapping
	public Reacciones addReacciones(@RequestBody Reacciones reaccion) {
		return reaccionesService.addReaccion(reaccion);
	}

}
