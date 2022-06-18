package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Empleado;
import ar.edu.unju.fi.service.IEmpleadoService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class EmpleadoController {
	
	@Autowired
	IEmpleadoService empleadoService;
	
	@GetMapping("/empleado/nuevo")
	public String getEmpleadoForm(Model model) {
		
		model.addAttribute("empleado", empleadoService.getEmpleado());
		
		return "nuevoempleado";
	}
	
	@PostMapping("/empleado/guardar")
	public ModelAndView guardarEmpleado(Model model, @ModelAttribute (name = "empleado") Empleado empleado, BindingResult result) {
		
		ModelAndView modelView;
		
		if(result.hasErrors()) {
			modelView = new ModelAndView("nuevoempleado");
			
			return modelView;
		}else{
			modelView = new ModelAndView("nuevoempleado");
			String msj = "El objeto se guardó correctamente en la base de datos.";
			model.addAttribute("mensaje", msj);
			model.addAttribute("barrio", empleadoService.getEmpleado());
			empleadoService.addEmpleado(empleado);
			
			return modelView;
		}
	}

}
