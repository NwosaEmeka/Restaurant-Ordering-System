package resta;

class Person {
	private String firstName, lastName;
	
	//Constructor without Argument
	public Person(){
		
	}
	//Constructor with argument
	public Person (String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String toString (){
	    return  "Name: " +firstName + "  " + lastName;
	}

}



