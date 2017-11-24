# Getting started

TODO: Add a description

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

* Browse to locate the folder containing the source code. Select the location of the DOCSMOREAPI gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

## How to Use

The following section explains how to use the DOCSMOREAPI library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

In the following step naigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line ```compile project(path: ':DOCSMOREAPI')``` to the dependencies section as shown in the illustration below.

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=DOCSMORE%20API&workspaceName=DOCSMOREAPI&projectName=DOCSMOREAPILib&rootNamespace=com.docsmore.api)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > DOCSMOREAPILib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### 

API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java

com.docsmore.api.Configuration.initialize(appContext);
DOCSMOREAPIClient client = new DOCSMOREAPIClient();
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [GetAnAccessTokenController](#get_an_access_token_controller)
* [DOCUMENTFLOWSController](#documentflows_controller)

## <a name="get_an_access_token_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.docsmore.api.controllers.GetAnAccessTokenController") GetAnAccessTokenController

### Get singleton instance

The singleton instance of the ``` GetAnAccessTokenController ``` class can be accessed from the API Client.

```java
GetAnAccessTokenController getAnAccessToken = client.getGetAnAccessToken();
```

### <a name="create_get_auth_token_async"></a>![Method: ](https://apidocs.io/img/method.png "com.docsmore.api.controllers.GetAnAccessTokenController.createGetAuthTOKENAsync") createGetAuthTOKENAsync

> *Tags:*  ``` Skips Authentication ``` 

> Make sure you call this in server side code. Exposing apiKey and clientSecret is a not a good idea on front end.


```java
void createGetAuthTOKENAsync(
        final GetAuthTOKENRequest body,
        final APICallBack<GetAuthTOKENResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
try {
    String bodyValue = "{    \"apiKey\": \"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\",    \"clientSecret\": \"XXXXXXXXXXXXX\"}";
    GetAuthTOKENRequest body = mapper.readValue(bodyValue,new TypeReference<GetAuthTOKENRequest> (){});
    // Invoking the API call with sample inputs
    getAnAccessToken.createGetAuthTOKENAsync(body, new APICallBack<GetAuthTOKENResponse>() {
        public void onSuccess(HttpContext context, GetAuthTOKENResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="documentflows_controller"></a>![Class: ](https://apidocs.io/img/class.png "com.docsmore.api.controllers.DOCUMENTFLOWSController") DOCUMENTFLOWSController

### Get singleton instance

The singleton instance of the ``` DOCUMENTFLOWSController ``` class can be accessed from the API Client.

```java
DOCUMENTFLOWSController dOCUMENTFLOWS = client.getDOCUMENTFLOWS();
```

### <a name="get_document_flow_collection_async"></a>![Method: ](https://apidocs.io/img/method.png "com.docsmore.api.controllers.DOCUMENTFLOWSController.getDocumentFlowCollectionAsync") getDocumentFlowCollectionAsync

> *Tags:*  ``` Skips Authentication ``` 

> Document Flow Collection


```java
void getDocumentFlowCollectionAsync(final APICallBack<List<DocumentFlowCollectionResponse>> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
dOCUMENTFLOWS.getDocumentFlowCollectionAsync(new APICallBack<List<DocumentFlowCollectionResponse>>() {
    public void onSuccess(HttpContext context, List<DocumentFlowCollectionResponse> response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



