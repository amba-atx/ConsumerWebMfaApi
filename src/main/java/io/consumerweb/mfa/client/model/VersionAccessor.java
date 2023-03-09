package io.consumerweb.mfa.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

public class VersionAccessor
{
    @SerializedName("version")
    private List<String> version;
    
    public VersionAccessor() {
        this.version = null;
    }
    
    public VersionAccessor version(final List<String> version) {
        this.version = version;
        return this;
    }
    
    public VersionAccessor addVersionItem(final String versionItem) {
        if (this.version == null) {
            this.version = new ArrayList<String>();
        }
        this.version.add(versionItem);
        return this;
    }
    
    @ApiModelProperty("")
    public List<String> getVersion() {
        return this.version;
    }
    
    public void setVersion(final List<String> version) {
        this.version = version;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final VersionAccessor versionAccessor = (VersionAccessor)o;
        return Objects.equals(this.version, versionAccessor.version);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.version);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class VersionAccessor {\n");
        sb.append("    version: ").append(this.toIndentedString(this.version)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
