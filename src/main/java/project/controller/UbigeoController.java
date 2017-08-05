package project.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import project.repository.UbigeoRepository;;

@Controller
@RequestMapping("/admin")
public class UbigeoController {
	
	public static final Log LOG = LogFactory.getLog(UbigeoController.class);
	
	@Autowired
	UbigeoRepository ubigeoRepository;
	
	@ModelAttribute("departamentos")
	public Object populateDepartamentos(){
		Object ubigeo = ubigeoRepository.findDepartamento();
		return ubigeo;
	}
	
	@GetMapping("/ubigeo/{type}/{idDept}/{idProv}")
	public ResponseEntity<Object> getDepartamentos(@PathVariable String type,@PathVariable String idDept, @PathVariable String idProv ){		
		Object ubigeo;
		if ( type.equals("departamento") ){
			ubigeo = ubigeoRepository.findDepartamento();
		}else if ( type.equals("provincia") ){
			ubigeo = ubigeoRepository.findProvincia(idDept);
		}else{
			ubigeo = ubigeoRepository.findDistrito(idProv);
		}		
		if (ubigeo == null) {
			return new ResponseEntity<Object>("No se encontraron registros ", HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<Object>(ubigeo,HttpStatus.OK);
	}
	
	

}
