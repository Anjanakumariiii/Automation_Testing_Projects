package response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeasureAnnotations {

	@JsonProperty("units_of_measurement")
	private String unitsOfMeasurement;

	@JsonProperty("aggregation_method")
	private String aggregationMethod;

	@JsonProperty("pre_aggregation_method")
	private String preAggregationMethod;

	@JsonProperty("error_for_measure")
	private String errorForMeasure;

	@JsonProperty("error_type")
	private String errorType;

	public String getUnitsOfMeasurement() {
		return unitsOfMeasurement;
	}

	public void setUnitsOfMeasurement(String unitsOfMeasurement) {
		this.unitsOfMeasurement = unitsOfMeasurement;
	}

	public String getAggregationMethod() {
		return aggregationMethod;
	}

	public void setAggregationMethod(String aggregationMethod) {
		this.aggregationMethod = aggregationMethod;
	}

	public String getPreAggregationMethod() {
		return preAggregationMethod;
	}

	public void setPreAggregationMethod(String preAggregationMethod) {
		this.preAggregationMethod = preAggregationMethod;
	}

	public String getErrorForMeasure() {
		return errorForMeasure;
	}

	public void setErrorForMeasure(String errorForMeasure) {
		this.errorForMeasure = errorForMeasure;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
}
