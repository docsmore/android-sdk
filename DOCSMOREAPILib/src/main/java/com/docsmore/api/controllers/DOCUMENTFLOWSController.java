/*
 * DOCSMOREAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.docsmore.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.docsmore.api.*;
import com.docsmore.api.models.*;
import com.docsmore.api.exceptions.*;
import com.docsmore.api.http.client.HttpClient;
import com.docsmore.api.http.client.HttpContext;
import com.docsmore.api.http.request.HttpRequest;
import com.docsmore.api.http.response.HttpResponse;
import com.docsmore.api.http.response.HttpStringResponse;
import com.docsmore.api.http.client.APICallBack;

public class DOCUMENTFLOWSController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static DOCUMENTFLOWSController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the DOCUMENTFLOWSController class 
     */
    public static DOCUMENTFLOWSController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new DOCUMENTFLOWSController();
            }
        }
        return instance;
    }

    /**
     * Document Flow Collection
     * @return    Returns the void response from the API call 
     */
    public void getDocumentFlowCollectionAsync(
                final APICallBack<List<DocumentFlowCollectionResponse>> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/api/docflow/getdocflows");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5008725316678165774L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            List<DocumentFlowCollectionResponse> _result = APIHelper.deserialize(_responseBody,
									new TypeReference<List<DocumentFlowCollectionResponse>>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}