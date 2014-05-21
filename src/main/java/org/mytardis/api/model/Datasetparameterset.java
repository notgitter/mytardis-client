
package org.mytardis.api.model;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.mytardis.api.client.TardisObject;


/**
 * A dataset's parameter set
 * @author Nick May 
 * @version 1.0
 * 
 */
@Generated("org.jsonschema2pojo")
public class Datasetparameterset extends TardisObject {

    @Expose
    private Object dataset = null;
    @Expose
    private Integer id;
    @Expose
    private Object parameters = null;
    @SerializedName("resource_uri")
    @Expose
    private String resourceUri = "No default provided.";
    @Expose
    private Object schema = null;

    public Object getDataset() {
        return dataset;
    }

    public void setDataset(Object dataset) {
        this.dataset = dataset;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public Object getSchema() {
        return schema;
    }

    public void setSchema(Object schema) {
        this.schema = schema;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

}
