/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
<class name>
-----------------------------------------
<data, i.e. variables>
-----------------------------------------
<actions, i.e. methods>
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables. 
	private String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private String birthday;
	private String validFromDate;
	private String expirationDate;
	private String sex;


public String getSurname()
	{
		return this.surname;
	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
		
}

public void setSurname (String surname){
		this.surname = surname;
	/***** MUTATORS *****/

	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.
	}

	public String getGivenName(){
	
	    return this.givenName;
	
	}

	public String getUscisNumber(){
	
	    return this.uscisNumber;
	
	}

	public String getCountryOfOrigin(){
	
	    return this.countryOfOrigin;
	
	}
	public String getBirthday(){
	
	    return this.birthday;
	
	}
	public String getValidFromDate(){
	
	    return this.validFromDate;
	
	}
	public String getExpirationDate(){	
			
	    return this.expirationDate;
	
	}	
	public String getSex(){
	
	    return this.sex;
	}

public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin, String birthday, String validFromDate, String expirationDate, String sex) {
	
	this.surname = surname; // or setSurname(surname);
	this.givenName = givenName;
	this.uscisNumber = uscisNumber;
	this.countryOfOrigin = countryOfOrigin;
	this.birthday = birthday;
	this.validFromDate = validFromDate;
	this.expirationDate = expirationDate;
	this.sex = sex;
	//TODO: Write the setAll method. Remember to include documentation.
	surname = "Chapeton-Lamas";
	givenName = "Nery";
	uscisNumber = "12-4-789";
	countryOfOrigin = "Guatemala";
	birthday = "2451564";
	validFromDate = "3956753";
	expirationDate = "3956840";
	sex = "M";
	}

	

}