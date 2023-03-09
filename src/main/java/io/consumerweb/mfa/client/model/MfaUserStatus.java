package io.consumerweb.mfa.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(io.consumerweb.mfa.client.model.MfaUserStatus.Adapter.class)
public enum MfaUserStatus
{
    NOTENROLLED("NOTENROLLED"), 
    UNVERIFIED("UNVERIFIED"), 
    VERIFIED("VERIFIED"), 
    DELETE("DELETE"), 
    LOCKOUT("LOCKOUT"), 
    UNLOCKED("UNLOCKED"), 
    NEWUSER("NEWUSER");
    
    private String value;
    
    private MfaUserStatus(final String value) {
        this.value = value;
    }
    
    public String getValue() {
        return this.value;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
    
    public static MfaUserStatus fromValue(final String text) {
        for (final MfaUserStatus b : values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
    
    public static class Adapter extends TypeAdapter<MfaUserStatus>
    {
        @Override
        public void write(final JsonWriter jsonWriter, final MfaUserStatus enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }
        
        @Override
        public MfaUserStatus read(final JsonReader jsonReader) throws IOException {
            final String value = jsonReader.nextString();
            return MfaUserStatus.fromValue(String.valueOf(value));
        }
    }
}
