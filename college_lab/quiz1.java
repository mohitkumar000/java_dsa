package college_lab;


public class quiz1 {
	class a1{
		a1()
		{
			System.out.println("a1 no args constructor");
		}
		a1(int a)
		{
			System.out.println(a);
		}
	}
	class b1 extends a1{
		b1()
		{
			System.out.println("b1 no args constructor");
		}
		b1(int b)
		{
			super(1000);
			System.out.println(b);
		}
		class c1 extends b1{
			c1()
			{
				System.out.println("a1 no args constructor");
			}
			c1(int c)
			{
				super(1000);
				System.out.println(c);
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 ca = new c1(10);

	}

}
