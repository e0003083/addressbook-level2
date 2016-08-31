package seedu.addressbook.data.person;

public class Block {
    public final String value;
    private boolean isPrivate;
    
    public Block(String block, boolean isPrivate) {
    	this.isPrivate = isPrivate;
    	this.value = block;
    	
    }
    
    public String getBlock() {
    	return this.value;
    }
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
                && this.value.equals(((Block) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
    
}
