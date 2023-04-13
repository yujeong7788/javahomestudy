package JANGYUJEONG.submit11_2;

public class Food {
	private String name; // 음식이름
	private String word; // 초성 힌트
	private String size; // 몇글자 힌트
	private String ingredient;// 재료 설명
	
	public Food() {}
	
	public Food(String name, String word, String size, String ingredient) {
		super();
		this.name = name;
		this.word = word;
		this.size = size;
		this.ingredient = ingredient;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", word=" + word + ", size=" + size + ", ingredient=" + ingredient + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	
}
