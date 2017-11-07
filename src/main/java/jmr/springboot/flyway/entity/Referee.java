package jmr.springboot.flyway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="referees")
public class Referee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="name", nullable=false, unique=true)
	private String name;
	
	@Column(name="organization", nullable=false)
	private String organization;
	
	public Referee()
	{
		// empty constructor for JPA
	}

	public Referee( String name, String organization )
	{
		this.name = name;
		this.organization = organization;
	}

	public Long getId()
	{
		return id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public String getOrganization()
	{
		return organization;
	}

	public void setOrganization( String organization )
	{
		this.organization = organization;
	}
}
