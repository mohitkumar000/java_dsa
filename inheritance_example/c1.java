package inheritance_example;
import java.util.*;

public class c1 extends b1 {
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
