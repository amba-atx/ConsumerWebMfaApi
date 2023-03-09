package io.consumerweb.mfa.client.model;

import java.util.Objects;

public class AdminRequest
{
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(new Object[0]);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AdminRequest {\n");
        sb.append("}");
        return sb.toString();
    }
    
    @SuppressWarnings("unused")
	private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
