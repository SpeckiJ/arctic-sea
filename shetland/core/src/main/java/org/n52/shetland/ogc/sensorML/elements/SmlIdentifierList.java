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
package org.n52.shetland.ogc.sensorML.elements;

import com.google.common.collect.Lists;
import org.n52.shetland.util.CollectionHelper;

import java.util.List;

/**
 * Implementation of sml:ClassifierList
 *
 * @author <a href="mailto:j.speckamp@52north.org">Jan Speckamp</a>
 */
public class SmlIdentifierList extends SmlIdentifier {

    private List<SmlIdentifier> identification;

    public boolean isSetClassification() {
        return !CollectionHelper.nullEmptyOrContainsOnlyNulls(identification);
    }

    public List<SmlIdentifier> getIdentification() {
        return identification;
    }

    public void setIdentification(List<SmlIdentifier> classifiers) {
        if (isSetClassification()) {
            this.identification.addAll(classifiers);
        } else {
            this.identification = classifiers;
        }
    }

    public void addIdentifier(SmlIdentifier classifier) {
        if (!isSetClassification()) {
            this.identification = Lists.newArrayList();
        }
        this.identification.add(classifier);
    }
}
