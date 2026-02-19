package response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class annotations {

	@JsonProperty("dataset_name")
	private String datasetName;

	@JsonProperty("dataset_link")
	private String datasetLink;

	@JsonProperty("source_name")
	private String sourceName;

	@JsonProperty("subtopic")
	private String subtopic;

	@JsonProperty("source_description")
	private String sourceDescription;

	@JsonProperty("table_id")
	private String tableID;

	@JsonProperty("topic")
	private String topic;

	public String getDatasetName() {
		return datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
	}

	public String getDatasetLink() {
		return datasetLink;
	}

	public void setDatasetLink(String datasetLink) {
		this.datasetLink = datasetLink;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSubtopic() {
		return subtopic;
	}

	public void setSubtopic(String subtopic) {
		this.subtopic = subtopic;
	}

	public String getSourceDescription() {
		return sourceDescription;
	}

	public void setSourceDescription(String sourceDescription) {
		this.sourceDescription = sourceDescription;
	}

	public String getTableID() {
		return tableID;
	}

	public void setTableID(String tableID) {
		this.tableID = tableID;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}
