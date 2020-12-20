package assignment1;

public class participant {
	String Firstname;
	String Lastname;
	String race;

	participant(String firstN,String lastN,String Race){
		this.Firstname=firstN;
		this.Lastname=lastN;
		this.race=Race;
	}
	
	public void setFirstname(String firstN) {
		this.Firstname=firstN;
	}
	public void setLastname(String lastN) {
		this.Lastname=lastN;
	}
	public void setRace(String race) {
		this.race=race;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	
	public String getLastname() {
		return Lastname;
	}
	public String getRace() {
		return race;
	}
	
	public String toString() {
		return "Participant name : "+Firstname+" "+Lastname+"\nRace :"+race;
	}
}
