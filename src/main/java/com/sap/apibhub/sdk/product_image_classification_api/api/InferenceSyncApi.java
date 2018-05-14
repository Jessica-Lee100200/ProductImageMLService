/*
 * Product Image Classification API
 * The model for this service was obtained by retraining the Image Classifier on approx. 50k Icecat images. There are 29 categories available: antivirus_security_software, computer_monitors_slash_workstations, digital_cameras, external_hard_drives, graphics_cards, internal_hard_drives, keyboards, LED_TVs, memory_modules, mice, mobile_device_chargers, motherboards, mounting_kits, network_switches, networking_cables, networking_cards, notebooks_and_accessories, other, power_adapters, power_cables, printers_and_accessories, processors, projection_screens, rechargeable_batteries, servers, smartphones, tablets, uninterruptible_power_supplies, USB_flash_drives_and_accessories.
 *
 * OpenAPI spec version: Alpha
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.product_image_classification_api.api;

import com.sap.apibhub.sdk.client.ApiCallback;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.ApiException;
import com.sap.apibhub.sdk.client.ApiResponse;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.apibhub.sdk.client.Pair;
import com.sap.apibhub.sdk.client.ProgressRequestBody;
import com.sap.apibhub.sdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;
import com.sap.apibhub.sdk.product_image_classification_api.model.Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InferenceSyncApi {
    private ApiClient apiClient;

    public InferenceSyncApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InferenceSyncApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for inferenceSyncPost */
    private com.squareup.okhttp.Call inferenceSyncPostCall(File files, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/inference_sync".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (files != null)
        localVarFormParams.put("files", files);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY"  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call inferenceSyncPostValidateBeforeCall(File files, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = inferenceSyncPostCall(files, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * The Product Image Classification service (synchronous) accepts &lt;b&gt;archive files&lt;/b&gt; with .zip extension, multiple &lt;b&gt;image files&lt;/b&gt; on different image formats like .jpeg, .png, .tif, or .bmp as input and returns a classification list with its probabilities.&lt;br&gt;&lt;br&gt; 
     * @param files This parameter is required. &lt;br&gt;The list of file(s) to be uploaded. &lt;br&gt;Either one archive file, one image file, or multiple image files are supported: &lt;ul&gt; &lt;li&gt;Image files - &lt;i&gt;different image formats, such as .jpeg, .png, .tif, or .bmp &lt;/i&gt;&lt;/li&gt; &lt;li&gt;Archive files - &lt;i&gt;one file with the format &#39;*_/zip&#39;&lt;/i&gt; &lt;/ul&gt; &lt;ul&gt; &lt;/ul&gt; (optional)
     * @return Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Response inferenceSyncPost(File files) throws ApiException {
        ApiResponse<Response> resp = inferenceSyncPostWithHttpInfo(files);
        return resp.getData();
    }

    /**
     * 
     * The Product Image Classification service (synchronous) accepts &lt;b&gt;archive files&lt;/b&gt; with .zip extension, multiple &lt;b&gt;image files&lt;/b&gt; on different image formats like .jpeg, .png, .tif, or .bmp as input and returns a classification list with its probabilities.&lt;br&gt;&lt;br&gt; 
     * @param files This parameter is required. &lt;br&gt;The list of file(s) to be uploaded. &lt;br&gt;Either one archive file, one image file, or multiple image files are supported: &lt;ul&gt; &lt;li&gt;Image files - &lt;i&gt;different image formats, such as .jpeg, .png, .tif, or .bmp &lt;/i&gt;&lt;/li&gt; &lt;li&gt;Archive files - &lt;i&gt;one file with the format &#39;*_/zip&#39;&lt;/i&gt; &lt;/ul&gt; &lt;ul&gt; &lt;/ul&gt; (optional)
     * @return ApiResponse&lt;Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Response> inferenceSyncPostWithHttpInfo(File files) throws ApiException {
        com.squareup.okhttp.Call call = inferenceSyncPostValidateBeforeCall(files, null, null);
        Type localVarReturnType = new TypeToken<Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * The Product Image Classification service (synchronous) accepts &lt;b&gt;archive files&lt;/b&gt; with .zip extension, multiple &lt;b&gt;image files&lt;/b&gt; on different image formats like .jpeg, .png, .tif, or .bmp as input and returns a classification list with its probabilities.&lt;br&gt;&lt;br&gt; 
     * @param files This parameter is required. &lt;br&gt;The list of file(s) to be uploaded. &lt;br&gt;Either one archive file, one image file, or multiple image files are supported: &lt;ul&gt; &lt;li&gt;Image files - &lt;i&gt;different image formats, such as .jpeg, .png, .tif, or .bmp &lt;/i&gt;&lt;/li&gt; &lt;li&gt;Archive files - &lt;i&gt;one file with the format &#39;*_/zip&#39;&lt;/i&gt; &lt;/ul&gt; &lt;ul&gt; &lt;/ul&gt; (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call inferenceSyncPostAsync(File files, final ApiCallback<Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = inferenceSyncPostValidateBeforeCall(files, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
