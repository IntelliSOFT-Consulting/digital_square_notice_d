package org.openmrs.module.hei.atomfeed.client.api;

import org.ict4h.atomfeed.client.AtomFeedProperties;
import org.springframework.stereotype.Component;

@Component
public class HieAtomFeedProperties extends AtomFeedProperties {
    //  TODO : Read properties from properties file or global properties

    private String openMrsUri = "http://localhost:8050";
    private String fhirBaseUri = "http://localhost:8050/openmrs/ws/fhir2/R4";
    private String patientFeedUri = "http://localhost:8050/openmrs/ws/atomfeed/patient/recent";
    private String encounterFeedUri = "http://localhost:8050/openmrs/ws/atomfeed/encounter/recent";
    private String openmrsAuthUri = "http://localhost:8050/openmrs/ws/rest/v1/session";
    private String openmrsUser = "admin";
    private String openMrsPassword = "test";
    private int feedMaxFailedEvents = 10000;
    private int feedConnectionTimeoutInMilliseconds = 10000;
    private int feedReplyTimeoutInMilliseconds = 20000;

    public String getOpenMrsUri() {
        return openMrsUri;
    }

    public String getFhirBaseUri() {
        return fhirBaseUri;
    }

    public String getPatientFeedUri() {
        return patientFeedUri;
    }

    public String getEncounterFeedUri() {
        return encounterFeedUri;
    }

    public String getOpenmrsAuthUri() {
        return openmrsAuthUri;
    }

    public String getOpenmrsUser() {
        return openmrsUser;
    }

    public String getOpenMrsPassword() {
        return openMrsPassword;
    }

    @Override
    public int getMaxFailedEvents() {
        return feedMaxFailedEvents;
    }

    @Override
    public int getReadTimeout() {
        return feedReplyTimeoutInMilliseconds;
    }

    @Override
    public int getConnectTimeout() {
        return feedConnectionTimeoutInMilliseconds;
    }
}