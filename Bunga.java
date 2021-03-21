package bunga;

public class Bunga {
	int harga;
	String jenis;
	//instace Method
	void kedai(){
		System.out.println("mekar Jaya");
	}
	//constructor
		public Bunga(){
			harga=0;
		}
	//class method
		public int getHarga(){
			return harga;
		}
		
		public void setHarga(int nilai) {
			harga=nilai;
		}
	
	//The main method
	public static void main(String[] args) {
		Bunga mawar = new Bunga();
			mawar.jenis="mawar";
			mawar.setHarga(20000);
				System.out.println(mawar.jenis);
				System.out.println(mawar.getHarga());
		Bunga melati = new Bunga ();
			melati.jenis="melati";
			melati.setHarga(35000);
				System.out.println(melati.jenis);
				System.out.println(melati.getHarga());
		Bunga kamboja= new Bunga();
			kamboja.jenis="kamboja";
			kamboja.setHarga(45000);
				System.out.println(kamboja.jenis);
				System.out.println(kamboja.getHarga());
	}
}
