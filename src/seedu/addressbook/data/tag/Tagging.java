package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	private String name;
	private String tag;
	private String addOrDelete;
	
	public Tagging(Person person, Tag tag, String addOrDelete) {
		this.name = person.getName().toString();
		this.tag = tag.tagName;
		this.addOrDelete = addOrDelete;		
	}
	
	@Override
	public String toString() {
		return addOrDelete + ' ' + name + " [" + tag + ']';
	}
	
} 
