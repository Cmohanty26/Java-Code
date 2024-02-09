package com.Interface;


	 class Resizable implements Example2{
		int width,height;
		Resizable(int width, int height){
			this.width=width;
			this.height=height;
		}
		public int resizeWidth(int width) {
			this.width=width;
			return width;
		}
		public int resizeHeight(int height) {
			this.height=height;
			return height;
		}
		public void printSize()
		{
			int w=resizeWidth(35);
			int h=resizeHeight(55);
			System.out.println(w+" ");
		}
		
	}
	
	interface Example2{
		int resizeWidth(int width);
		int resizeHeight(int height);
		public static void main(String []args) {
			Resizable r= new Resizable(10,20);
			int rw=r.resizeWidth(30);
			int rh=r.resizeHeight(60);
			System.out.println(rw+" "+rh);
			r.printSize();
		}
	}
	


