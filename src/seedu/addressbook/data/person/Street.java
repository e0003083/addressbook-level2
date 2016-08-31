package seedu.addressbook.data.person;

public class Street {
	 public final String value;
	    private boolean isPrivate;
	    
	    public Street(String street, boolean isPrivate) {
	    	this.isPrivate = isPrivate;
	    	this.value = street;
	    	
	    }
	    
	    public String getStreet() {
	    	return this.value;
	    }
	    
	    @Override
	    public String toString() {
	        return value;
	    }

	    @Override
	    public boolean equals(Object other) {
	        return other == this // short circuit if same object
	                || (other instanceof Street // instanceof handles nulls
	                && this.value.equals(((Street) other).value)); // state check
	    }

	    @Override
	    public int hashCode() {
	        return value.hashCode();
	    }

	    public boolean isPrivate() {
	        return isPrivate;
	    }
}
