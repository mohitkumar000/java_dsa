package inheritance_example;

public class employee extends Person{

	String name;
	double annual_salary=25000;
	double year=2000;
	
	String liceance = "df12346";
	
	  public double getName() {
		    return annual_salary;
	}
	  public void setName(String Name) {
		    this.name =Name;
	  }
	 employee()
	 {
		 System.out.println("year of joining"+year);
		 System.out.println("total_annaul salar"+annual_salary);
	 }

		 
		  
}
