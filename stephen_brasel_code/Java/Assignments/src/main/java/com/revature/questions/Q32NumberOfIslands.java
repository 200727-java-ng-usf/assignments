package com.revature.questions;
//
//import org.javatuples.Map.Entry;

import java.util.*;

public class Q32NumberOfIslands {

	class coord implements Comparable{
		private Integer x;
		private Integer y;

		public coord(Integer x, Integer y) {
			this.x = x;
			this.y = y;
		}

		public Integer getX() {
			return x;
		}

		public Integer getY() {
			return y;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			coord coord = (coord) o;
			return Objects.equals(x, coord.x) &&
					Objects.equals(y, coord.y);
		}

		@Override
		public int compareTo(Object o) {
			if (this == o) return 0;
			if (o == null || getClass() != o.getClass()) return 1;
			coord coord = (coord) o;
			if(x.compareTo(coord.x) == 0){
				return y.compareTo(coord.y);
			} else {
				return x.compareTo(coord.x);
			}
		}
	}

	private char land = '1';
	private char sea = '0';

	public int numIslands(char[][] _grid) {
		//Check input
		if(_grid == null
				|| _grid.length == 0
				|| _grid[0].length == 0) return 0;

		// Set local variables
		char[][] grid = Arrays.copyOf(_grid, _grid.length);
		int count = 0;
		Queue<coord> searchSpace = new PriorityQueue<>();

		for(int i = 0; i < grid.length; i++){
			for (int j = 0; j < grid[0].length; j++) {
				// if current tile is land
				if(grid[i][j] == land){
					coord p = new coord(i, j);
					searchSpace.add(p);
					while(!searchSpace.isEmpty()){
						coord temp = searchSpace.poll();
						int x = temp.getX();
						int y = temp.getY();

						if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == sea){
							continue;
						}
						grid[x][y] = sea;
						//up
						searchSpace.add(new coord(temp.getX() - 1, temp.getY()));
						//right
						searchSpace.add(new coord(temp.getX(), temp.getY() + 1));
						//down
						searchSpace.add(new coord(temp.getX() + 1, temp.getY()));
						//left
						searchSpace.add(new coord(temp.getX(), temp.getY() - 1));
					}
					count++;
				}
			}
		}
		return count;
	}
}
