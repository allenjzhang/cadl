// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armstreamstyleserialization.generated;

import com.azure.core.util.BinaryData;
import com.cadl.armstreamstyleserialization.models.SawShark;
import org.junit.jupiter.api.Assertions;

public final class SawSharkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SawShark model = BinaryData.fromString("{\"sharktype\":\"saw\",\"age\":171767066,\"dna\":\"upi\"}")
            .toObject(SawShark.class);
        Assertions.assertEquals(171767066, model.age());
        Assertions.assertEquals("upi", model.dna());
    }
}