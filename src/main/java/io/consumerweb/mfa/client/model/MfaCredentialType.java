package io.consumerweb.mfa.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(io.consumerweb.mfa.client.model.MfaCredentialType.class)
public enum MfaCredentialType
{
    QUESTIONS("QUESTIONS"), 
    EMAIL("EMAIL"), 
    SMS("SMS"), 
    PHONE("PHONE");
    
    private String value;
    
    private MfaCredentialType(final String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
    
    public static MfaCredentialType fromValue(final String text) {
        for (final MfaCredentialType b : values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
    
    public static class Adapter extends TypeAdapter<MfaCredentialType>
    {
        @Override
        public void write(final JsonWriter jsonWriter, final MfaCredentialType enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }
        
        @Override
        public MfaCredentialType read(final JsonReader jsonReader) throws IOException {
            final String value = jsonReader.nextString();
            return MfaCredentialType.fromValue(String.valueOf(value));
        }
    }
}
