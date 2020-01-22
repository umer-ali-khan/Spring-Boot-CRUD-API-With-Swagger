package io.springbootrestapi.starterapp.topic;

public class PatchTopic {

	private String description;

	public PatchTopic() {
		super();
		this.description = "No description";
	}

	public PatchTopic(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
