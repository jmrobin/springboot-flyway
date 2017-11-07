package jmr.springboot.flyway.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jmr.springboot.flyway.repository.RefereeRepository;
import jmr.springboot.flyway.entity.Referee;

@Service
public class RefereeService
{
	@Autowired
	RefereeRepository refereeRepository;
	
	public List<Referee> findAll()
	{
		return refereeRepository.findAll();
	}
	
	public Optional<Referee> findById(Long id)
	{
		return refereeRepository.findById(id);
	}
	
	public Referee create( Referee referee )
	{
		return refereeRepository.save(referee);
	}
	
	public void delete(Referee referee)
	{
		refereeRepository.delete(referee);
	}
	
	public void deleteAll()
	{
		refereeRepository.deleteAll();
	}
	
}
