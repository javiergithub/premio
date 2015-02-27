package demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador{
	
	@RequestMapping
	@ResponseBody
	public String home(){
		return "Hola Mundo !";
	}
}