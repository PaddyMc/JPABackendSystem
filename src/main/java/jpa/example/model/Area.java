package jpa.example.model;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Areas")
public class Area implements Serializable {
	
	private static final long serialVersionUID = 1;
			
	@Id 
	@GeneratedValue(strategy = AUTO)
	@Column(name = "ID", nullable=false, unique=true)
	private int id;
	
	@Column(name = "Area_Name")
	private String name;
	
	@Column(name = "Area_Player")
	private String player;
		
	@Column(name="Area_Score")
	private String score;

	//Constructor
	public Area() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getArea() {
		return score;
	}

	public void setArea(String score) {
		this.score = score;
	}
	
	public String getScore(){
		return this.score;
	}
	
	public void setScore(String score){
		this.score = score;
	}
}
