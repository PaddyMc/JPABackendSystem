package jpa.example.model;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Players")
public class Player implements Serializable {
	
	private static final long serialVersionUID = 1;
			
	@Id 
	@GeneratedValue(strategy = AUTO)
	@Column(name = "ID", nullable=false, unique=true)
	private int id;
	
	@Column(name = "Player_Name")
	private String name;
	
	@Column(name = "Player_Player")
	private String player;
		
	@Column(name="Player_Score")
	private String score;

	//Constructor
	public Player() {
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
	
	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
	
	public String getScore()
	{
		return this.score;
	}
	public void setScore(String score)
	{
		this.score = score;
	}


}