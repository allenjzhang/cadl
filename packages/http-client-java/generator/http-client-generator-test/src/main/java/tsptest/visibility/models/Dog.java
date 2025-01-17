// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package tsptest.visibility.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The Dog model.
 */
@Immutable
public final class Dog implements JsonSerializable<Dog> {
    /*
     * The id property.
     */
    @Generated
    private int id;

    /*
     * The secretName property.
     */
    @Generated
    private final String secretName;

    /*
     * The name property.
     */
    @Generated
    private final String name;

    /**
     * Creates an instance of Dog class.
     * 
     * @param secretName the secretName value to set.
     * @param name the name value to set.
     */
    @Generated
    private Dog(String secretName, String name) {
        this.secretName = secretName;
        this.name = name;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Generated
    public int getId() {
        return this.id;
    }

    /**
     * Get the secretName property: The secretName property.
     * 
     * @return the secretName value.
     */
    @Generated
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("secretName", this.secretName);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Dog from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Dog if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Dog.
     */
    @Generated
    public static Dog fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int id = 0;
            String secretName = null;
            String name = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    id = reader.getInt();
                } else if ("secretName".equals(fieldName)) {
                    secretName = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            Dog deserializedDog = new Dog(secretName, name);
            deserializedDog.id = id;

            return deserializedDog;
        });
    }
}
