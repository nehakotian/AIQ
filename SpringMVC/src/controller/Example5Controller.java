package controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import repository.FlightRepository;
import entity.Flight;

@Controller
public class Example5Controller {

	@Autowired
	private FlightRepository flightRepository;
	
	@RequestMapping("/example5Controller")
	public String execute(@RequestParam("flightNo") String flightNo, Map model) { //get "flightNo" from user and add in FlightNo and inject map model
		Flight flight = flightRepository.getFlightInfo(flightNo);
		model.put("flight", flight);// we are adding flight object to map
		return "example5Output";
	}
}
