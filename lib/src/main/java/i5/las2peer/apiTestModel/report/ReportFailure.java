package i5.las2peer.apiTestModel.report;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * Java class for "failure" element in JUnit XML report.
 */
public class ReportFailure {

    @XmlAttribute
    private String message;

    public String getMessage() {
        return message;
    }
}
