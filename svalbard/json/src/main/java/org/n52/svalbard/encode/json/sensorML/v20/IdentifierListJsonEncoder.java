/*
 * Copyright 2015-2020 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.svalbard.encode.json.sensorML.v20;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.n52.shetland.ogc.sensorML.Term;
import org.n52.shetland.ogc.sensorML.elements.SmlIdentifier;
import org.n52.svalbard.encode.exception.EncodingException;
import org.n52.svalbard.encode.json.JSONEncoder;
import org.n52.svalbard.encode.json.ListEncoderKey;

import java.util.List;

/**
 * JSON Encoder for List of SmlIdentifier
 *
 * @author <a href="mailto:j.speckamp@52north.org">Jan Speckamp</a>
 * @see SmlIdentifier
 */
public class IdentifierListJsonEncoder extends JSONEncoder<List<SmlIdentifier>> implements SensorML20JsonEncoder {

    public IdentifierListJsonEncoder() {
        super(new ListEncoderKey(SmlIdentifier.class));
    }

    @Override public JsonNode encodeJSON(List<SmlIdentifier> smlIdentifiers) throws EncodingException {
        ObjectNode json = jsonFactory.objectNode();
        json.put(TYPE, "IdentifierList");
        if (!smlIdentifiers.isEmpty()) {
            json.put("identifier", encodeObjectsToJson(smlIdentifiers));
        }
        return json;
    }
}
