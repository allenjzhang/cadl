// Code generated by Microsoft (R) TypeSpec Code Generator.

package payload.pageable.serverdrivenpagination;

import io.clientcore.core.annotation.Metadata;
import io.clientcore.core.annotation.TypeConditions;
import io.clientcore.core.serialization.json.JsonReader;
import io.clientcore.core.serialization.json.JsonSerializable;
import io.clientcore.core.serialization.json.JsonToken;
import io.clientcore.core.serialization.json.JsonWriter;
import java.io.IOException;
import java.util.List;
import payload.pageable.Pet;

/**
 * The LinkResponse model.
 */
@Metadata(conditions = { TypeConditions.IMMUTABLE })
public final class LinkResponse implements JsonSerializable<LinkResponse> {
    /*
     * The pets property.
     */
    @Metadata(generated = true)
    private final List<Pet> pets;

    /*
     * The links property.
     */
    @Metadata(generated = true)
    private final LinkResponseLinks links;

    /**
     * Creates an instance of LinkResponse class.
     * 
     * @param pets the pets value to set.
     * @param links the links value to set.
     */
    @Metadata(generated = true)
    private LinkResponse(List<Pet> pets, LinkResponseLinks links) {
        this.pets = pets;
        this.links = links;
    }

    /**
     * Get the pets property: The pets property.
     * 
     * @return the pets value.
     */
    @Metadata(generated = true)
    public List<Pet> getPets() {
        return this.pets;
    }

    /**
     * Get the links property: The links property.
     * 
     * @return the links value.
     */
    @Metadata(generated = true)
    public LinkResponseLinks getLinks() {
        return this.links;
    }

    /**
     * {@inheritDoc}
     */
    @Metadata(generated = true)
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("pets", this.pets, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("links", this.links);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinkResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinkResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LinkResponse.
     */
    @Metadata(generated = true)
    public static LinkResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<Pet> pets = null;
            LinkResponseLinks links = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("pets".equals(fieldName)) {
                    pets = reader.readArray(reader1 -> Pet.fromJson(reader1));
                } else if ("links".equals(fieldName)) {
                    links = LinkResponseLinks.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new LinkResponse(pets, links);
        });
    }
}
