package model;

import Abstract.AbstractMazeFactory;

public class MazeFactory extends AbstractMazeFactory {
	
	public MazeFactory(){};
	
	public String makeMaze() {
		return "Labirinto de Constru��o";
	}

	
	public String makeWall() {
		return "Parede de constru��o";
	}

	
	public String makeRoom() {
		return "Quarto de Constru��o";
	}

	
	public String makeDoor() {
		return "Porta do Edif�cio";
	}

}
