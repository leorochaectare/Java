package Classes.Feriados;


public class Feriados {
	private String description;
	private String date;
	
	public Feriados(String description, String date) {
		this.description = description;
		this.date = date;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Feriados [description=" + description + ", date=" + date + "]";
	}

	
	
	
	
}
