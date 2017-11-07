package jmr.springboot.flyway.service;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import jmr.springboot.flyway.repository.RefereeRepository;
import jmr.springboot.flyway.entity.Referee;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RefereeServiceTest
{
	@InjectMocks
	private RefereeService service;
	
	@Mock
	private RefereeRepository repository;
	
	@Before
	public void init()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void findByIdTest()
	{
		// arrange
		Long id = 9L;
		Referee referee = new Referee("Jimmy", "Org");
		referee.setId(id);
		Optional<Referee> expected = Optional.of(referee);
		when(repository.findById(id)).thenReturn(Optional.of(referee));
		// act
		Optional<Referee> actual = service.findById(id);
		// assert
		assertEquals( true, actual.isPresent());
		assertEquals(expected.get().getId(), actual.get().getId());
		assertEquals(expected.get().getName(), actual.get().getName());
	}
}
