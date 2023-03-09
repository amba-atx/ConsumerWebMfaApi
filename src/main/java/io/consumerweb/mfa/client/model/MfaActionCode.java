package io.consumerweb.mfa.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(io.consumerweb.mfa.client.model.MfaActionCode.Adapter.class)
public enum MfaActionCode
{
    ALLOW("ALLOW"), 
    CHALLENGE("CHALLENGE"), 
    DENY("DENY"), 
    NONE("NONE"), 
    REDIRECT_COLLECT("REDIRECT_COLLECT"), 
    REVIEW("REVIEW");
    
    private String value;
    
    private MfaActionCode(final String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
    
    public static MfaActionCode fromValue(final String text) {
        for (final MfaActionCode b : values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
    
    public static class Adapter extends TypeAdapter<MfaActionCode>
    {
        @Override
        public void write(final JsonWriter jsonWriter, final MfaActionCode enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }
        
        @Override
        public MfaActionCode read(final JsonReader jsonReader) throws IOException {
            final String value = jsonReader.nextString();
            return MfaActionCode.fromValue(String.valueOf(value));
        }
    }
}
