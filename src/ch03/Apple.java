package ch03;

public class Apple {
	Integer weight;
	String color;

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	public Apple(int weight) {
		// TODO Auto-generated constructor stub
		this.weight = weight;
	}

	public Apple(int weight, String color) {
		this.weight = weight;
		this.color = color;
	}

	public Integer getWeight() {
		return weight;
	}

	public String getColor() {
		return color;
	}
}
