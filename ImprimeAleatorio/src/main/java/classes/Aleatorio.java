package classes;

public class Aleatorio {
	private String vAleatorio;

	public String getvAleatorio() {
		
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		vAleatorio = Integer.toString(randomNum);
		
		return vAleatorio;
	}

	public void setvAleatorio(String vAleatorio) {
		this.vAleatorio = vAleatorio;
	}
}