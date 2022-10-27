package Correios;


public class Pacote {

	private int id;
	private String CPFdestinatario;
	
	public Pacote(){
		
	}
	
	public Pacote (int id, String CPFdestinatario) {
		setId(id);
		setCPFdestinatario(CPFdestinatario);
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setCPFdestinatario(String CPFdestinatario) {
		this.CPFdestinatario = CPFdestinatario;
	}
	


	
	        
	
}

