package jmr.springboot.flyway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jmr.springboot.flyway.entity.Referee;
import jmr.springboot.flyway.service.RefereeService;

@RestController
@RequestMapping("/referees")
public class RefereeController
{
	@Autowired
	RefereeService refereeService;
	
	@GetMapping
	public List<Referee> getAll()
	{
		return refereeService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Referee> getById(@PathVariable Long id)
	{
		if( refereeService.findById(id).isPresent())
		{
			Referee referee = refereeService.findById(id).get();
			return new ResponseEntity<Referee>( referee, HttpStatus.OK );
		}
		else
		{
			return new ResponseEntity<Referee>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public Referee create(@RequestBody Referee referee)
	{
		return refereeService.create(referee);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id)
	{
		if( refereeService.findById(id).isPresent() )
		{	
			refereeService.delete(refereeService.findById(id).get());
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
}
