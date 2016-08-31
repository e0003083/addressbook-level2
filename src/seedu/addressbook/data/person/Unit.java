package seedu.addressbook.data.person;

public class Unit {
	 public final String value;
	    private boolean isPrivate;
	    
	    public Unit(String unit, boolean isPrivate) {
	    	this.isPrivate = isPrivate;
	    	this.value = unit;
	    	
	    }
	    
	    public String getUnit() {
	    	return this.value;
	    }
	    
	    @Override
	    public String toString() {
	        return value;
	    }

	    @Override
	    public boolean equals(Object other) {
	        return other == this // short circuit if same object
	                || (other instanceof Unit // instanceof handles nulls
	                && this.value.equals(((Unit) other).value)); // state check
	    }

	    @Override
	    public int hashCode() {
	        return value.hashCode();
	    }

	    public boolean isPrivate() {
	        return isPrivate;
	    }
}
