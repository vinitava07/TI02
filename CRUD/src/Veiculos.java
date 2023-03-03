
public class Veiculos {
	private int id;
	private String placa;
	private String modelo;
	
	public Veiculos() {
		this.id = -1;
		this.placa = "";
		this.modelo = "";
	}
	
	public Veiculos(int id, String placa, String modelo) {
		this.id = id;
		this.placa = placa;
		this.modelo = modelo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Veiculos [id=" + id + ", placa=" + placa + ", "+ "modelo=" + modelo +"]";
	}	
}
