package response;

public class Property {

	private String name;
	private String caption;
	private String type;
	private Object annotations;

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

	public Object getAnnotations() {
		return annotations;
	}

	public void setAnnotations(Object annotations) {
		this.annotations = annotations;
	}
}
