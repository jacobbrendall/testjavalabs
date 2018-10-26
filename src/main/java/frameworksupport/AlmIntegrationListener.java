//package frameworksupport;
//
//import com.google.gson.JsonObject;
//import com.rallydev.rest.request.CreateRequest;
//import com.rallydev.rest.response.CreateResponse;
//import org.testng.ITestResult;
//import org.testng.TestListenerAdapter;
//import com.rallydev.rest.RallyRestApi;
//
//public class AlmIntegrationListener extends TestListenerAdapter {
//private RallyRestApi restApi;
//
//    public AlmIntegrationListener() {
//    }
//
//
//
//    CreateRequest createRequest;
//
//    JsonObject updateTestCase ;
//
//
//    public void onTestSuccess(ITestResult tr) {
//        getPassedTests();
//    }
//
//    private void updateTestCaseStatus(TestCaseStatus testCase){
//        CreateResponse createResponse = null;
//     //   JsonObject updateTestCase = this.convertToJsonObject(testCase);
//    }
//
//}
