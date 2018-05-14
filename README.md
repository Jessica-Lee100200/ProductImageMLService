## This source has been genereated using swagger codegen (https://github.com/swagger-api/swagger-codegen/tree/v2.2.2)

# com.sap.apibhub.sdk

## In case if you want to customize or enhance the generated project, import the project to an IDE of your choice and then follow the instructions given below to build, deploy and consume the library. 

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, execute the following command:

```shell
mvn install
```

To deploy the API client library to a remote Maven repository, configure the settings of the repository and execute the following command:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add the following dependency to your project's POM:

```xml
<dependency>
    <groupId>com.sap.apibhub</groupId>
    <artifactId>com.sap.apibhub.sdk</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add the following dependency to your project's build file:

```groovy
compile "com.sap.apibhub:com.sap.apibhub.sdk:1.0.0"
```

### Others

Generate the JAR by executing the following command:

    mvn package

Manually install the following JARs:

* target/com.sap.apibhub.sdk-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instructions given above and execute the following sample Java code to consume an API:

```java

import com.sap.apibhub.sdk.client.*;
import com.sap.apibhub.sdk.client.auth.*;
import com.sap.apibhub.sdk.product_image_classification_api.model.*;
import com.sap.apibhub.sdk.product_image_classification_api.api.InferenceSyncApi;

import java.io.File;
import java.util.*;

public class InferenceSyncApiExample {

    public static void main(String[] args) {
    
		ApiClient defaultClient = Configuration.getDefaultApiClient(); 
		Map<String, Authentication> authentications = defaultClient.getAuthentications();       
		
		//Currently Base Path points to sandbox system, change it to call your API Endpoint
		defaultClient.setBasePath("https://sandbox.api.sap.com/ml/prodimgclassifier");
		//You can obtain your API key on the Settings page of SAP API Business Hub. In the Settings page, choose the Show API Key toggle button to display and copy your API key. You have to be logged in to view your API Key.
		defaultClient.addDefaultHeader("APIKey","<YOUR APIBHUB SANDBOX APIKEY>"); 		
		authentications.put("APIBHUB_SANDBOX_APIKEY", new ApiKeyAuth("header", "APIKey"));
		            
        InferenceSyncApi apiInstance = new InferenceSyncApi();
        apiInstance.setApiClient(defaultClient);
        File files = new File("/path/to/file.txt"); // File | This parameter is required. <br>The list of file(s) to be uploaded. <br>Either one archive file, one image file, or multiple image files are supported: <ul> <li>Image files - <i>different image formats, such as .jpeg, .png, .tif, or .bmp </i></li> <li>Archive files - <i>one file with the format '*_/zip'</i> </ul> <ul> </ul>
        try {
            Response result = apiInstance.inferenceSyncPost(files);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InferenceSyncApi#inferenceSyncPost");
            System.err.println("API Response : \n"+e.getResponseBody()); 
        }
    }
}

```

## Documentation for Authorization

Authorization information not available


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

