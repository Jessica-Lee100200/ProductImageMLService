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


package com.sap.apibhub.sdk.client;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-14T07:11:38.840Z")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
