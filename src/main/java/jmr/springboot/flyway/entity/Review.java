package jmr.springboot.flyway.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reviews")
public class Review
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="manuscript", nullable=false)
	private String manuscript;
	
	@Column(name="publishable", nullable=false)
	private boolean publishable;
	
	public Review()
	{
		// empty constructor for JPA
	}

	public Review( String manuscript, boolean publishable )
	{
		this.manuscript = manuscript;
		this.publishable = publishable;
	}

	public Long getId()
	{
		return id;
	}

	public void setId( Long id )
	{
		this.id = id;
	}

	public String getManuscript()
	{
		return manuscript;
	}

	public void setManuscript( String manuscript )
	{
		this.manuscript = manuscript;
	}

	public boolean isPublishable()
	{
		return publishable;
	}

	public void setPublishable( boolean publishable )
	{
		this.publishable = publishable;
	}
	
}
