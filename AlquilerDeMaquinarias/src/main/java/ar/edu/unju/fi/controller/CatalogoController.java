package ar.edu.unju.fi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Catalogo;
import ar.edu.unju.fi.service.ICatalogoService;

@Controller
public class CatalogoController {
	
	@Autowired
	ICatalogoService catalogoService;
	
	@GetMapping("/catalogo/nuevo")
	public String getFormCatalogo(Model model) {
		
		model.addAttribute("catalogo", catalogoService.getCatalogo());
		
		return "nuevocatalogo";
	}
	
	@PostMapping("catalogo/guardar")
	public ModelAndView guardarCatalogo(Model model, @ModelAttribute("catalogo") Catalogo catalogo, BindingResult result){
		
		ModelAndView modelView;
		
		if(result.hasErrors()){
			modelView = new ModelAndView("nuevocatalogo");
			
			return modelView;
		}else {
			modelView = new ModelAndView("nuevocatalogo");
			String msj = "El objeto se guardó correctamente en la base de datos.";
			model.addAttribute("mensaje", msj);
			model.addAttribute("catalogo", catalogoService.getCatalogo());
			catalogoService.addCatalogo(catalogo);
			
			return modelView;
		}
	}
	
	@GetMapping("/catalogo/lista")
	public String getListaCatalogos(Model model) {
		
		model.addAttribute("catalogo", catalogoService.getCatalogo());
		model.addAttribute("catalogos", catalogoService.getAllCatalogos());
		
		return "listacatalogos";
	}

}
