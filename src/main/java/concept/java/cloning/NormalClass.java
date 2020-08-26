package concept.java.cloning;

public class NormalClass {

	private Integer id;
	private String name;

	public NormalClass(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NormalClass [id=" + id + ", name=" + name + "]";
	}

}
