// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.versioning.added.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.versioning.added.AddedServiceVersion;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in InterfaceV2s.
 */
public final class InterfaceV2sImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final InterfaceV2sService service;

    /**
     * The service client containing this operation class.
     */
    private final AddedClientImpl client;

    /**
     * Initializes an instance of InterfaceV2sImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    InterfaceV2sImpl(AddedClientImpl client) {
        this.service
            = RestProxy.create(InterfaceV2sService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public AddedServiceVersion getServiceVersion() {
        return client.getServiceVersion();
    }

    /**
     * The interface defining all the services for AddedClientInterfaceV2s to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{endpoint}/versioning/added/api-version:{version}")
    @ServiceInterface(name = "AddedClientInterface")
    public interface InterfaceV2sService {
        @Post("/interface-v2/v2")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> v2InInterface(@HostParam("endpoint") String endpoint,
            @HostParam("version") String version, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept, @BodyParam("application/json") BinaryData body,
            RequestOptions requestOptions, Context context);

        @Post("/interface-v2/v2")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> v2InInterfaceSync(@HostParam("endpoint") String endpoint,
            @HostParam("version") String version, @HeaderParam("Content-Type") String contentType,
            @HeaderParam("Accept") String accept, @BodyParam("application/json") BinaryData body,
            RequestOptions requestOptions, Context context);
    }

    /**
     * The v2InInterface operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     enumProp: String(enumMember) (Required)
     *     unionProp: BinaryData (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     enumProp: String(enumMember) (Required)
     *     unionProp: BinaryData (Required)
     * }
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> v2InInterfaceWithResponseAsync(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.v2InInterface(this.client.getEndpoint(),
            this.client.getVersion(), contentType, accept, body, requestOptions, context));
    }

    /**
     * The v2InInterface operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     enumProp: String(enumMember) (Required)
     *     unionProp: BinaryData (Required)
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     prop: String (Required)
     *     enumProp: String(enumMember) (Required)
     *     unionProp: BinaryData (Required)
     * }
     * }</pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> v2InInterfaceWithResponse(BinaryData body, RequestOptions requestOptions) {
        final String contentType = "application/json";
        final String accept = "application/json";
        return service.v2InInterfaceSync(this.client.getEndpoint(), this.client.getVersion(), contentType, accept, body,
            requestOptions, Context.NONE);
    }
}