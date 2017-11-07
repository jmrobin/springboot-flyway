package jmr.springboot.flyway.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import jmr.springboot.flyway.entity.Referee;

public interface RefereeRepository extends JpaRepository<Referee, Long>
{
	Optional<Referee> findById(Long id);
	Optional<Referee> findByName(String name);
}
