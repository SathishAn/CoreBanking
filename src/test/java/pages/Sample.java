package pages;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sathish";
		
		if(name.equalsIgnoreCase("Sathish")) {
			System.out.println("This is sathish record");
			
		}else if(name.equalsIgnoreCase("Nikkil")) {
			System.out.println("This is Nikkil record");
		}
		
		switch (name.toLowerCase()) {
		case "sathish":
			System.out.println("This is sathish record");
			break;
		case "Nikkil":
			System.out.println("This is Nikkil record");
			break;
			
		default:
			break;
		}
		
		
		

	}

}
