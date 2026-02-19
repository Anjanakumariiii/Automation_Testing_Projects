
package response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DimensionAnnotations {

	@JsonProperty("dim_type")
	private String dimType;

	public String getDimType() {
		return dimType;
	}

	public void setDimType(String dimType) {
		this.dimType = dimType;
	}
}
