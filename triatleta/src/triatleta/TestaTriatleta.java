package triatleta;

public class TestaTriatleta {
	public static void main (String[] args) {
		
		Triatleta t1 = new Triatleta("João");
		t1.vizualizar();
		
		t1.aquecer();
		t1.nadar();
		t1.pedalar();
		t1.correr();
		t1.cansou();
	}
}
