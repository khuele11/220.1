public class covidTrack {
	private int num=0;
	private int[] exposed;
	private int[] exposed2;
	
	public covidTrack() {
		num=0;
		exposed = new int[3];
	}
	
	public void add(int newPerson) {
		//check if the array is full; if it is full, create a new array that is twice the size of the old one and copied the value over
		if(exposed.length==num) {
			exposed2= new int[exposed.length*2];
			for(int i=0;i<exposed.length;i++) {
				exposed2[i]=exposed[i];
			}
			exposed=exposed2;
		}
		
		//check whether the number is already in the array
		boolean isNew=true; 
		for (int i=0;i<exposed.length;i++) {
			if(exposed[i]==newPerson) {isNew=false;}
		}
		
		//add the new number into the array 
		if(isNew==true) {
			exposed[num]=newPerson;
			num++;
		}
	}
	
	public int quarantineNumber() {
		return num;
	}
}
