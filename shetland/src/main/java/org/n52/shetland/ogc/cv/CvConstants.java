/*
 * Copyright 2015-2018 52°North Initiative for Geospatial Open Source
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
package org.n52.shetland.ogc.cv;

import org.n52.shetland.w3c.SchemaLocation;

public interface CvConstants {

    String NS_CV = "http://www.opengis.net/cv/0.2/gml32";

    String NS_CV_PREFIX = "cv";

    String SCHEMA_LOCATION_URL_CV = "http://bp.schemas.opengis.net/06-188r2/cv/0.2.2_gml32/cv.xsd";

    SchemaLocation CV_SCHEMA_LOCATION = new SchemaLocation(NS_CV, SCHEMA_LOCATION_URL_CV);

}
