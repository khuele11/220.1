
public class main {

	public static void main(String[] args) {
		covidTrack exposedList= new covidTrack();
		
		//Add a person's identifying number into the exposedList whenever it is discovered they came into contact with an infected person
		exposedList.add(797865);
		exposedList.add(753784);
		exposedList.add(797865);
		
		
		//Print out the total number of people have to be in quarantine using quarantineNumber() 
		System.out.println(exposedList.quarantineNumber());
		

	}

}
