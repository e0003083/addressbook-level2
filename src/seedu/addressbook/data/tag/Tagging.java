package seedu.addressbook.data.tag;

import java.util.ArrayList;

import seedu.addressbook.data.person.Person;

public class Tagging {
	private String name;
	private String tag;
	private String addOrDelete;
	public static ArrayList<String> allTaggings = new ArrayList<String>(); 
	
	public Tagging(Person person, Tag _tag, String _addOrDelete) {
		this.name = person.getName().toString();
		this.tag = _tag.tagName;
		this.addOrDelete = _addOrDelete;
		allTaggings.add(addOrDelete + ' ' + name + ' ' + '[' + tag + ']');
	}
	
	@Override
	public String toString(){
		String output = "";
		for(String taggings : allTaggings) {
			output += taggings;
		}
		return output;
	}
	
	
} 
