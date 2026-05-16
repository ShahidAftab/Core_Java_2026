package LearningDay2;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mobName = "Samsung";
		switch(mobName) {
		case "Iphone":{
			System.out.println("Kindly buy a Iphone.");
		}
		case "Motorola":{
			System.out.println("Kindly buy a Motorola.");
		}
		case "Samsung":{
			System.out.println("Kindly buy a Samsung.");
		}
		case "GooglePixel":{
			System.out.println("Kindly buy a GooglePixel.");
			break;
		}
		case "Oppo":{
			System.out.println("Kindly buy a Oppo.");
		}
		default:{
			System.out.println("Kindly add valid mobile name.");
		}
		}

	}

}
