package assignment1;

public class participant {
	String Firstname;
	String Lastname;
	String Gender;
	String race;

	participant(String firstN,String lastN,String gender,String Race){
		this.Firstname=firstN;
		this.Lastname=lastN;
		this.Gender=gender;
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
	public void setgend(String gender) {
		this.Gender=gender;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	
	public String getLastname() {
		return Lastname;
	}
	public String getGender() {
		return Gender;
	}
	public String getRace() {
		return race;
	}
	
	public String toString() {
		return "Participant name : "+Firstname+" "+Lastname+"\nGender : "+Gender+"\nRace :"+race;
	}
}
