package main.java.ticTacToe.models;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import main.java.ticTacToe.utils.Direction;

public class SetBoard extends Board {

	private Map<Color, Set<Coordinate>> coordinates;

	SetBoard() {
		coordinates = new HashMap<>();
		for (int i = 0; i < Color.values().length-1; i++) {
			coordinates.put(Color.values()[i], new HashSet<>());
		}
	}

	Color getColor(Coordinate coordinate) {
		assert coordinate != null;
		for (Color color : coordinates.keySet()) {
			if (coordinates.get(color).contains(coordinate)) {
				return color;
			}
		}
		return Color.NONE;
	}

	boolean complete() {
		int contTokens = 0;
		for (Color color : coordinates.keySet()) {
			contTokens += coordinates.get(color).size();
		}
		return contTokens == Coordinate.DIMENSION * coordinates.keySet().size();
	}

	boolean existTicTacToe(Color color) {
		assert color != Color.NONE;
		Set<Coordinate> coordinateSet = coordinates.get(color);
		if (coordinateSet.size() != Coordinate.DIMENSION) {
			return false;
		}
		Coordinate[] coordinateArray = coordinateSet.toArray(new Coordinate[0]);
		Direction direction = coordinateArray[0].direction(coordinateArray[1]);
		if (direction == Direction.NON_EXISTENT) {
			return false;
		}
		for (int i = 1; i < Coordinate.DIMENSION - 1; i++) {
			if (coordinateArray[i].direction(coordinateArray[i + 1]) != direction) {
				return false;
			}
		}
		return true;
	}

	boolean empty(Coordinate coordinate) {
		assert coordinate != null;
		return !this.full(coordinate, Color.XS)
				&& !this.full(coordinate, Color.OS);
	}

	void put(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != null;
		assert color != Color.NONE;
		assert this.empty(coordinate);
		assert !this.complete();
		coordinates.get(color).add(coordinate.clone());
	}

	void remove(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != null;
		assert color != Color.NONE;
		assert this.getColor(coordinate) == color;
		coordinates.get(color).remove(coordinate);
	}

	boolean full(Coordinate coordinate, Color color) {
		assert coordinate != null;
		assert color != Color.NONE;
		return coordinates.get(color).contains(coordinate);
	}

	void clear() {
		for (Color color : coordinates.keySet()) {
			coordinates.get(color).clear();
		}
	}

	@Override
	public String toString() {
		Color[][] colors = new Color[3][3];
		for (Color color : coordinates.keySet()) {
			for (Coordinate coordinate : coordinates.get(color)) {
				colors[coordinate.getRow()][coordinate.getColumn()] = this
						.getColor(coordinate);
			}
		}
		String result = "";
		for(int i=0; i<colors.length; i++){
			for(int j=0; j<colors[i].length; j++){
				char color = '.';
				if (colors[i][j] != null) {
					color = colors[i][j].name().charAt(0);
				}
				result += color + " ";
			}
			result += " \n";
		}
		return result;
	}
}
