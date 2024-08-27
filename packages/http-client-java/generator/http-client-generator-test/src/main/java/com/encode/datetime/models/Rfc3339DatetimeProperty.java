// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.encode.datetime.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The Rfc3339DatetimeProperty model.
 */
@Immutable
public final class Rfc3339DatetimeProperty implements JsonSerializable<Rfc3339DatetimeProperty> {
    /*
     * The value property.
     */
    @Generated
    private final OffsetDateTime value;

    /**
     * Creates an instance of Rfc3339DatetimeProperty class.
     * 
     * @param value the value value to set.
     */
    @Generated
    public Rfc3339DatetimeProperty(OffsetDateTime value) {
        this.value = value;
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    @Generated
    public OffsetDateTime getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value",
            this.value == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.value));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Rfc3339DatetimeProperty from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Rfc3339DatetimeProperty if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Rfc3339DatetimeProperty.
     */
    @Generated
    public static Rfc3339DatetimeProperty fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OffsetDateTime value = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    value = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            return new Rfc3339DatetimeProperty(value);
        });
    }
}