package com.Interface;

//public interface Example1 {
//	


	 interface Example1{
		int resizeWidth(int width);
		int resizeHeight(int height);
		public static void main(String [] args) {
			Rectangle r= new Rectangle();
			Rectangle.Rectangle1 re= r.new Rectangle1(10,30);
			r.printSize();int w=re.resizeWidth(20);
			int h=re.resizeHeight(35);System.out.println(h+" "+w);
			
		}
		
	}
	class Rectangle {
		public void printSize() {
			System.out.println("outer class");
			
		}
		class Rectangle1 implements Example1{
			int width,height;
			Rectangle1(int width,int height){
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
		}
		
	}

//}
