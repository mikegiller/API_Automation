package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CreateSourceExample
import io.swagger.model.CreateSourceExampleResponse
import io.swagger.model.GetSourceExample
import io.swagger.model.GetSourceListExample
import io.swagger.model.OffsetInvalidExample
import io.swagger.model.PartialUpdateSourceExample
import io.swagger.model.PartialUpdateSourceExampleResponse
import io.swagger.model.SourceInvalidRequestExample
import io.swagger.model.SourceNotFoundExample
import io.swagger.model.SourceUpdateInvalidRequestExample

import java.util.*;

@Mixin(ApiUtils)
class SourcesApi {
    String basePath = "https://localhost"
    String versionPath = "/api/v1"

    def createSource ( CreateSourceExample body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/sources"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    CreateSourceExampleResponse.class )
                    
    }
    def deleteSource ( String sourceId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/sources/{sourceId}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (sourceId == null) {
            throw new RuntimeException("missing required params sourceId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getSource ( String sourceId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/sources/{sourceId}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (sourceId == null) {
            throw new RuntimeException("missing required params sourceId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    GetSourceExample.class )
                    
    }
    def getSourceList ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/sources"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    GetSourceListExample.class )
                    
    }
    def partialUpdateSource ( String sourceId, PartialUpdateSourceExample body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/sources/{sourceId}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (sourceId == null) {
            throw new RuntimeException("missing required params sourceId")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    PartialUpdateSourceExampleResponse.class )
                    
    }
}
