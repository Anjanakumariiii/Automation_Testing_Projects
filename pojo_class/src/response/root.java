package response;

public class root {

	private String name;
	private String caption;
	private annotations annotations;
	private Dimension[] dimensions;
	private Measure[] measures;

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String value) {
		this.caption = value;
	}

	public annotations getAnnotations() {
		return annotations;
	}

	public void setAnnotations(annotations value) {
		this.annotations = value;
	}

	public Dimension[] getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimension[] value) {
		this.dimensions = value;
	}

	public Measure[] getMeasures() {
		return measures;
	}

	public void setMeasures(Measure[] value) {
		this.measures = value;
	}
}
