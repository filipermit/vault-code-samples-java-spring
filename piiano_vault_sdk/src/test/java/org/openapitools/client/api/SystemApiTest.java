/*
 * Piiano Vault REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ConfigConfig;
import org.openapitools.client.model.GcDeletionCount;
import org.openapitools.client.model.ModelsAllGenerations;
import org.openapitools.client.model.ModelsHealth;
import org.openapitools.client.model.ModelsKMSStatus;
import org.openapitools.client.model.ModelsLicense;
import org.openapitools.client.model.ModelsProductVersion;
import org.openapitools.client.model.RestHTTPError;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemApi
 */
@Disabled
public class SystemApiTest {

    private final SystemApi api = new SystemApi();

    /**
     * Get control service status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void controlHealthTest() throws ApiException {
        ModelsHealth response = api.controlHealth();
        // TODO: test validations
    }

    /**
     * Get data service status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dataHealthTest() throws ApiException {
        ModelsHealth response = api.dataHealth();
        // TODO: test validations
    }

    /**
     * Purge expired and soft deleted objects and tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void garbageCollectionTest() throws ApiException {
        String reason = null;
        String filter = null;
        Boolean dryRun = null;
        String adhocReason = null;
        Boolean reloadCache = null;
        List<GcDeletionCount> response = api.garbageCollection(reason, filter, dryRun, adhocReason, reloadCache);
        // TODO: test validations
    }

    /**
     * Get cluster information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getClusterInfoTest() throws ApiException {
        ModelsAllGenerations response = api.getClusterInfo();
        // TODO: test validations
    }

    /**
     * Get system configuration
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigurationTest() throws ApiException {
        ConfigConfig response = api.getConfiguration();
        // TODO: test validations
    }

    /**
     * Get KMS status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getKmsTest() throws ApiException {
        ModelsKMSStatus response = api.getKms();
        // TODO: test validations
    }

    /**
     * Get license
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLicenseTest() throws ApiException {
        ModelsLicense response = api.getLicense();
        // TODO: test validations
    }

    /**
     * Get Vault version
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVaultVersionTest() throws ApiException {
        ModelsProductVersion response = api.getVaultVersion();
        // TODO: test validations
    }

    /**
     * Rotate data encryption keys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void rotateKeysTest() throws ApiException {
        api.rotateKeys();
        // TODO: test validations
    }

    /**
     * Trigger an artificial error
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void triggerErrorTest() throws ApiException {
        api.triggerError();
        // TODO: test validations
    }

}
