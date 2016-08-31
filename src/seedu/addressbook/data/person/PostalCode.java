package seedu.addressbook.data.person;

public class PostalCode {
	 public final String value;
	    private boolean isPrivate;
	    
	    public PostalCode(String postalCode, boolean isPrivate) {
	    	this.isPrivate = isPrivate;
	    	this.value = postalCode;
	    	
	    }
	    
	    public String getPostalCode() {
	    	return this.value;
	    }
	    
	    @Override
	    public String toString() {
	        return value;
	    }

	    @Override
	    public boolean equals(Object other) {
	        return other == this // short circuit if same object
	                || (other instanceof PostalCode // instanceof handles nulls
	                && this.value.equals(((PostalCode) other).value)); // state check
	    }

	    @Override
	    public int hashCode() {
	        return value.hashCode();
	    }

	    public boolean isPrivate() {
	        return isPrivate;
	    }
}
