package getset_method.com;

public class Protected {

	
	
	 public static void main(String[] args) {
			Protected p= new Protected();
			int b=p.getBala();
			System.out.println(b);
			
			p.setBala(300000);
			b=p.getBala();
			System.out.println(b);
	}
	
			
			private int bala=100;
			

		public int getBala() {
			return bala;
		}
		public void setBala(int bala) {
			this.bala=bala;
		}

		}

	

