package com.sap.consumer;

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
		
		defaultClient.setBasePath("https://sandbox.api.sap.com/ml/prodimgclassifier");
		defaultClient.addDefaultHeader("APIKey","e9ZLBOfIplCOnibykWXsAfkMUexchhHN"); 		
		authentications.put("APIBHUB_SANDBOX_APIKEY", new ApiKeyAuth("header", "APIKey"));
		            
        InferenceSyncApi apiInstance = new InferenceSyncApi();
        apiInstance.setApiClient(defaultClient);
        File files = new File("C:\\Users\\i042416\\Desktop\\th.bmp"); 
        try {
            Response result = apiInstance.inferenceSyncPost(files);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("API Response : \n"+e.getResponseBody()); 
        }
    }
}