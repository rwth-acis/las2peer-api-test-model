package i5.las2peer.apiTestModel.report;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Java class for "testsuite" element in JUnit XML report.
 */
@XmlRootElement(name = "testsuite")
public class ReportTestSuite {

    @XmlAttribute
    private int tests;

    @XmlAttribute
    private int failures;

    @XmlElement(name = "testcase")
    private List<ReportTestCase> testCases;

    @XmlElement(name = "system-out")
    private String systemOut;

    public int getTests() {
        return tests;
    }

    public int getFailures() {
        return failures;
    }

    public List<ReportTestCase> getTestCases() {
        return testCases;
    }

    public String getSystemOut() {
        return systemOut;
    }
}
