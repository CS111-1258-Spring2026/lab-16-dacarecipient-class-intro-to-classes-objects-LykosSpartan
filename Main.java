/********************************************
*	DEVELOPER:	<name>
* COLLABORATORS: <names>
*	LAST MODIFIED:	<date>
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    //TODO PART 3: test your setter/getter here!
    DACArecipient recipient1 = new DACArecipient();
    System.out.println("Person 1");
    System.out.println("-----------------------------");
    recipient1.setAll("Chapeton-Lamas", "Nery", "12-4-789", "Guatemala", "2451564", "3956753", "3956840", "M");
    System.out.println("surname: " + recipient1.getSurname());
    System.out.println("given name: " + recipient1.getGivenName());
    System.out.println("USCIS number: " + recipient1.getUscisNumber());
    System.out.println("country of origin: " + recipient1.getCountryOfOrigin());
    System.out.println("birthday(JDN): " + recipient1.getBirthday());
    System.out.println("valid from date: " + recipient1.getValidFromDate());
    System.out.println("expiration date: " + recipient1.getExpirationDate());
    System.out.println("sex: " + recipient1.getSex());


  }
}