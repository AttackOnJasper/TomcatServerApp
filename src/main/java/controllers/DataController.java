package controllers;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;

import services.DataService;


@Controller
public final class DataController {
	@Autowired
	private DataService dataService;
	
	@RequestMapping(value="/data/{id}",method=RequestMethod.GET, produces="text/plain; charset=utf-8")
	public String getAllData(@PathVariable int id, HttpServletRequest request, HttpServletResponse response){
		System.out.println("here");
		return ""+id;
	}
	
}
