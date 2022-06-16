package ar.edu.unju.fi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Catalogo;
import ar.edu.unju.fi.model.Maquinaria;
import ar.edu.unju.fi.service.ICatalogoService;
import ar.edu.unju.fi.service.IMaquinariaService;

@Controller
public class MaquinariaController {
	
	List<Catalogo> catalogos = new ArrayList<Catalogo>();
	
	@Autowired
	ICatalogoService catalogoService;
	
	@Autowired
	IMaquinariaService maquinariaService;

	@GetMapping("/maquinaria/nueva")
	public String getMaquinariaForm(Model model) {
		
		this.catalogos = catalogoService.getAllCatalogos();
		
		model.addAttribute("catalogos", catalogos);
		model.addAttribute("maquinaria", maquinariaService.getMaquinaria());
		
		return "nuevamaquinaria";
	}
	
	
	@PostMapping("/maquinaria/guardar")
	public ModelAndView saveMaquinaria(Model model, @RequestParam("file") MultipartFile file , @ModelAttribute("maquinaria") Maquinaria maquinaria, BindingResult result){
		
		ModelAndView modelView;
		
		if(result.hasErrors()) {
			
			modelView = new ModelAndView("nuevamaquinaria");
			modelView.addObject("catalogos", catalogoService.getAllCatalogos());
		
			return modelView;
		}else {
			
			this.catalogos = catalogoService.getAllCatalogos();
			modelView = new ModelAndView("nuevamaquinaria");
			String msj = "El objeto se ha guardado correctamente en la base de datos.";
			model.addAttribute("mensaje", msj);
			model.addAttribute("maquinaria", maquinariaService.getMaquinaria());
			modelView.addObject("catalogos", catalogos);
			maquinariaService.addMaquinaria(file , maquinaria);
			
			return modelView;
		}
	}
	
	@GetMapping("/maquinaria/lista")
	public String getListaMaquinarias(Model model) {
		
		model.addAttribute("maquinaria", maquinariaService.getMaquinaria());
		model.addAttribute("maquinarias", maquinariaService.getAllMaquinaria());
		
		return "listamaquinarias";
		
	}	
	
}
