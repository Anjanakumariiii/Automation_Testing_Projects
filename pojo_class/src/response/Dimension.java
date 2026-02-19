package response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dimension {

	private String name;
	private String caption;
	private String type;
	private DimensionAnnotations annotations;
	private Hierarchy[] hierarchies;

	@JsonProperty("default_hierarchy")
	private String defaultHierarchy;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public DimensionAnnotations getAnnotations() {
		return annotations;
	}

	public void setAnnotations(DimensionAnnotations annotations) {
		this.annotations = annotations;
	}

	public Hierarchy[] getHierarchies() {
		return hierarchies;
	}

	public void setHierarchies(Hierarchy[] hierarchies) {
		this.hierarchies = hierarchies;
	}

	public String getDefaultHierarchy() {
		return defaultHierarchy;
	}

	public void setDefaultHierarchy(String defaultHierarchy) {
		this.defaultHierarchy = defaultHierarchy;
	}
}
