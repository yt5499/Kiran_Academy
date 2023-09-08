package level1;

public class Marks {

	public static void main(String[] args) {
		
		byte mr=88,ma=67,eng=55,sci=72,h=66;
		float total = 500f;
		float obtained = mr+ma+eng+sci+h;
		
		System.out.println("Subject Marks");
		System.out.println(".......................");
		
		System.out.println("Marathi\t"+mr+"\nMaths\t"+ma+"\nEnglish\t"+eng+"\nScience\t"+sci+"\nHindi\t"+h);
		System.out.println(".......................");
		System.out.println("Total:\t\t"+total+"\nObtained Marks:\t"+obtained+"\nPercentage:\t"+((obtained*100)/total));
	}

}
