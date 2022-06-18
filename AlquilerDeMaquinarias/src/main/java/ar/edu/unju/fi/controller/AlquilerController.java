package ar.edu.unju.fi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.model.Alquiler;
import ar.edu.unju.fi.model.Cliente;
import ar.edu.unju.fi.model.Maquinaria;
import ar.edu.unju.fi.service.IAlquilerService;
import ar.edu.unju.fi.service.IClienteService;
import ar.edu.unju.fi.service.IMaquinariaService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class AlquilerController {

	List<Maquinaria> maquinarias = new ArrayList<Maquinaria>();
	
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	@Autowired
	IAlquilerService alquilerService;
	
	@Autowired
	IMaquinariaService maquinariaService;
	
	@Autowired
	IClienteService clienteService;
	
	@GetMapping("/alquiler/nuevo")
	public String getAlquilerForm(Model model) {
		
		this.maquinarias = maquinariaService.getAllMaquinaria();
		this.clientes = clienteService.getAllCliente();
		
		model.addAttribute("maquinarias", maquinarias);
		model.addAttribute("clientes", clientes);
		
		model.addAttribute("alquiler", alquilerService.getAlquiler());
		
		return "nuevoalquiler";
	}
	
	@PostMapping("/alquiler/guardar")
	public ModelAndView guardarAlquiler(Model model, @ModelAttribute (name = "alquiler") Alquiler alquiler, BindingResult result) {
		
		ModelAndView modelView;
		
		if(result.hasErrors()) {
			modelView = new ModelAndView("nuevoalquiler");
			modelView.addObject("maquinarias", maquinariaService.getAllMaquinaria());
			modelView.addObject("clientes", clienteService.getAllCliente());
			return modelView;
		}else {
			this.maquinarias = maquinariaService.getAllMaquinaria();
			modelView = new ModelAndView("nuevoalquiler");
			String msj = "El objeto se ha guardado correctamente en la base de datos.";
			model.addAttribute("mensaje", msj);
			model.addAttribute("alquiler", alquilerService.getAlquiler());
		
			modelView.addObject("maquinarias", maquinariaService.getAllMaquinaria());
			modelView.addObject("clientes", clienteService.getAllCliente());
			alquilerService.addAlquiler(alquiler);
			return modelView;
		}
	}
	
	@GetMapping("/alquiler/lista")
	public String getListaAlquiler(Model model) {

		model.addAttribute("alquiler", alquilerService.getAlquiler());
		model.addAttribute("alquileres",alquilerService.getAllAlquiler());

		return "listaalquileres";
	}
	
	
	
}
