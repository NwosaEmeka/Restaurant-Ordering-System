package resta;

class Address {
	private String houseNo,street,city,state,zip;
	
	public Address(){
		
	}
	
	public Address(String houseNo, String street,String city,String state, String zip){
		this.houseNo = houseNo;
		this.street = street;
		this.city= city;
		this.state = state;
		this.zip = zip;
	}
	public String getHouseNo(){
		return houseNo;
	}
	public String getStreet(){
		return street;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;
	}
	public String getZip(){
		return zip;
	}
	
	public String toString(){
		return "Address: " + houseNo + "  " + street + "  " + city + "  " + state + "\nZip Code: " + zip + "\n\n";
	}

}