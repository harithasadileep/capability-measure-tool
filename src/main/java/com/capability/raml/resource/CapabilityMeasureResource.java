
package com.capability.raml.resource;

import javax.validation.constraints.NotNull;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import com.capability.raml.model.ExceptionMessage;
import com.capability.raml.model.GetClusterViewResponse;
import com.capability.raml.model.GetMapViewResponse;
import com.capability.raml.model.GetMapsResponse;
import com.capability.raml.model.PutCapabilityDetails;
import com.capability.raml.model.PutCapabilityDimensionNotes;
import com.capability.raml.model.PutClusterListResponse;
import com.capability.raml.model.PutClustrList;
import com.capability.raml.model.PutMapsResponse;

@Path("CapabilityMeasure")
public interface CapabilityMeasureResource {


    /**
     * Returns a single MapView. Service used to Get(retrieve) a collection of ClientMaps.
     * 
     * @param password
     *     
     * @param mapName
     *     
     * @param sectorName
     *     
     */
    @GET
    @Path("MapView/{mapName}/{sectorName}")
    @Produces({
        "application/json"
    })
    CapabilityMeasureResource.GetCapabilityMeasureMapViewByMapNameBySectorNameResponse getCapabilityMeasureMapViewByMapNameBySectorName(
        @PathParam("mapName")
        @NotNull
        String mapName,
        @PathParam("sectorName")
        @NotNull
        String sectorName,
        @QueryParam("password")
        String password)
        throws Exception
    ;

    /**
     * Returns a single ClusterView. Service used to Get(retrieve) a collection of ClientMaps.
     * 
     * @param clusterName
     *     
     * @param mapName
     *     
     * @param sectorName
     *     
     */
    @GET
    @Path("ClusterView/{mapName}/{sectorName}/{clusterName}")
    @Produces({
        "application/json"
    })
    CapabilityMeasureResource.GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse getCapabilityMeasureClusterViewByMapNameBySectorNameByClusterName(
        @PathParam("mapName")
        @NotNull
        String mapName,
        @PathParam("sectorName")
        @NotNull
        String sectorName,
        @PathParam("clusterName")
        @NotNull
        String clusterName)
        throws Exception
    ;

    /**
     * Returns a single Maps. Service used to Get(retrieve) a collection of CapabilityMaps.
     * 
     * @param searchDesc
     *     
     * @param mapType
     *     
     */
    @GET
    @Path("Maps")
    @Produces({
        "application/json"
    })
    CapabilityMeasureResource.GetCapabilityMeasureMapsResponse getCapabilityMeasureMaps(
        @QueryParam("mapType")
        String mapType,
        @QueryParam("searchDesc")
        String searchDesc)
        throws Exception
    ;

    /**
     * 
     * @param mapName
     *     
     * @param sectorName
     *     
     */
    @POST
    @Path("Archive/{mapName}/{sectorName}")
    @Produces({
        "application/json"
    })
    CapabilityMeasureResource.PostCapabilityMeasureArchiveByMapNameBySectorNameResponse postCapabilityMeasureArchiveByMapNameBySectorName(
        @PathParam("mapName")
        @NotNull
        String mapName,
        @PathParam("sectorName")
        @NotNull
        String sectorName)
        throws Exception
    ;

    /**
     * Create a new resource
     * 
     * 
     * @param entity
     *      e.g. {
     *       "result" : "success",
     *       "key" : "unique key of the CapabilityMap"
     *     }
     */
    @POST
    @Path("Cluster")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    CapabilityMeasureResource.PostCapabilityMeasureClusterResponse postCapabilityMeasureCluster(PutClustrList entity)
        throws Exception
    ;

    /**
     * Create a new resource
     * 
     * 
     * @param entity
     *      e.g. {
     *     	"capability": {
     *     		"capabilityId": "",
     *     		"mapId": "",
     *     		"versionId": "",
     *     		"sectorId": "",
     *     		"clusterId": "",
     *     		"capNotes": "",
     *     		"capabilityDesc": "",
     *     		"capabilityNm": "",
     *     		"capabilityPos": "",
     *     		"highValue": "",
     *     		"createDt": "",
     *     		"lastUpdateDt": "",
     *     		"truncCapabilityNm": "",
     *     		"usrNmLastUpd": ""
     *     
     *     	},
     *     	"dimensionMaturityLevelList": [{
     *     
     *     
     *     			"capabilityId": "",
     *     			"mapId": "",
     *     			"versionId": "",
     *     			"sectorId": "",
     *     			"dimId": "",
     *     			"clusterId": "",
     *     			"dimNotes": "",
     *     			"currentMaturity": "",
     *     			"futureMaturity": "",
     *     			"dimMatGap": "",
     *     			"capabilityCurrentMat": "",
     *     			"capabilityFutureMat": "",
     *     			"capMatGap": "",
     *     			"createDt": "",
     *     			"lastupdateDt": ""
     *     		}, {
     *     			"capabilityId": "",
     *     			"mapId": "",
     *     			"versionId": "",
     *     			"sectorId": "",
     *     			"dimId": "",
     *     			"clusterId": "",
     *     			"dimNotes": "",
     *     			"currentMaturity": "",
     *     			"futureMaturity": "",
     *     			"dimMatGap": "",
     *     			"capabilityCurrentMat": "",
     *     			"capabilityFutureMat": "",
     *     			"capMatGap": "",
     *     			"createDt": "",
     *     			"lastupdateDt": ""
     *     		}
     *     
     *     	]
     *     }
     */
    @POST
    @Path("capabilityDetailsUpdate")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    CapabilityMeasureResource.PostCapabilityMeasureCapabilityDetailsUpdateResponse postCapabilityMeasureCapabilityDetailsUpdate(PutCapabilityDetails entity)
        throws Exception
    ;

    /**
     * Create a new resource
     * 
     * 
     * @param entity
     *      e.g. {
     *       "result" : "success",
     *       "key" : "unique key of the CapabilityMap"
     *     }
     */
    @POST
    @Path("CapabilityDimensionNote")
    @Consumes("application/json")
    @Produces({
        "application/json"
    })
    CapabilityMeasureResource.PostCapabilityMeasureCapabilityDimensionNoteResponse postCapabilityMeasureCapabilityDimensionNote(PutCapabilityDimensionNotes entity)
        throws Exception
    ;

    public class GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse
        extends com.capability.raml.support.ResponseWrapper
    {


        private GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Standard response for successful HTTP requests. The actual response will depend on the request method used. In a GET request, the response will contain an entity corresponding to the requested resource. In a POST request, the response will contain an entity describing or containing the result of the action.
         *  e.g. examples/Maps/get-clusterView-response-example.json
         * 
         * 
         * @param entity
         *     examples/Maps/get-clusterView-response-example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse withJsonOK(GetClusterViewResponse entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse(responseBuilder.build());
        }

        /**
         * The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).
         *  e.g. examples/exception/exception.example.json
         * 
         * 
         * @param entity
         *     examples/exception/exception.example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse withJsonBadRequest(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse(responseBuilder.build());
        }

        /**
         * The requested resource could not be found but may be available again in the future. Subsequent requests by the client are permissible.
         *  e.g. examples/exception/exception.example.json
         * 
         * 
         * @param entity
         *     examples/exception/exception.example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse withJsonNotFound(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse(responseBuilder.build());
        }

        /**
         * A generic error message, given when an unexpected condition was encountered and no more specific message is suitable.
         *  e.g. examples/exception/exception.example.json
         * 
         * 
         * @param entity
         *     examples/exception/exception.example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse withJsonInternalServerError(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureClusterViewByMapNameBySectorNameByClusterNameResponse(responseBuilder.build());
        }

    }

    public class GetCapabilityMeasureMapViewByMapNameBySectorNameResponse
        extends com.capability.raml.support.ResponseWrapper
    {


        private GetCapabilityMeasureMapViewByMapNameBySectorNameResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Standard response for successful HTTP requests. The actual response will depend on the request method used. In a GET request, the response will contain an entity corresponding to the requested resource. In a POST request, the response will contain an entity describing or containing the result of the action.
         *  e.g. examples/Maps/get-mapView-response-example.json
         * 
         * 
         * @param entity
         *     examples/Maps/get-mapView-response-example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureMapViewByMapNameBySectorNameResponse withJsonOK(GetMapViewResponse entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureMapViewByMapNameBySectorNameResponse(responseBuilder.build());
        }

        /**
         * The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).
         *  e.g. examples/exception/exception.example.json
         * 
         * 
         * @param entity
         *     examples/exception/exception.example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureMapViewByMapNameBySectorNameResponse withJsonBadRequest(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureMapViewByMapNameBySectorNameResponse(responseBuilder.build());
        }

        /**
         * The requested resource could not be found but may be available again in the future. Subsequent requests by the client are permissible.
         *  e.g. examples/exception/exception.example.json
         * 
         * 
         * @param entity
         *     examples/exception/exception.example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureMapViewByMapNameBySectorNameResponse withJsonNotFound(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureMapViewByMapNameBySectorNameResponse(responseBuilder.build());
        }

        /**
         * A generic error message, given when an unexpected condition was encountered and no more specific message is suitable.
         *  e.g. examples/exception/exception.example.json
         * 
         * 
         * @param entity
         *     examples/exception/exception.example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureMapViewByMapNameBySectorNameResponse withJsonInternalServerError(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureMapViewByMapNameBySectorNameResponse(responseBuilder.build());
        }

    }

    public class GetCapabilityMeasureMapsResponse
        extends com.capability.raml.support.ResponseWrapper
    {


        private GetCapabilityMeasureMapsResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Standard response for successful HTTP requests. The actual response will depend on the request method used. In a GET request, the response will contain an entity corresponding to the requested resource. In a POST request, the response will contain an entity describing or containing the result of the action.
         *  e.g. examples/Maps/get-maps-response-example.json
         * 
         * 
         * @param entity
         *     examples/Maps/get-maps-response-example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureMapsResponse withJsonOK(GetMapsResponse entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureMapsResponse(responseBuilder.build());
        }

        /**
         * The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).
         *  e.g. examples/exception/exception.example.json
         * 
         * 
         * @param entity
         *     examples/exception/exception.example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureMapsResponse withJsonBadRequest(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureMapsResponse(responseBuilder.build());
        }

        /**
         * The requested resource could not be found but may be available again in the future. Subsequent requests by the client are permissible.
         *  e.g. examples/exception/exception.example.json
         * 
         * 
         * @param entity
         *     examples/exception/exception.example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureMapsResponse withJsonNotFound(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureMapsResponse(responseBuilder.build());
        }

        /**
         * A generic error message, given when an unexpected condition was encountered and no more specific message is suitable.
         *  e.g. examples/exception/exception.example.json
         * 
         * 
         * @param entity
         *     examples/exception/exception.example.json
         *     
         */
        public static CapabilityMeasureResource.GetCapabilityMeasureMapsResponse withJsonInternalServerError(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.GetCapabilityMeasureMapsResponse(responseBuilder.build());
        }

    }

    public class PostCapabilityMeasureArchiveByMapNameBySectorNameResponse
        extends com.capability.raml.support.ResponseWrapper
    {


        private PostCapabilityMeasureArchiveByMapNameBySectorNameResponse(Response delegate) {
            super(delegate);
        }

        /**
         * successfull archive e.g. {
         *   "result" : "success",
         *   "key" : "unique key of the CapabilityMap"
         * }
         * 
         * @param entity
         *     {
         *       "result" : "success",
         *       "key" : "unique key of the CapabilityMap"
         *     }
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureArchiveByMapNameBySectorNameResponse withJsonOK(PutMapsResponse entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureArchiveByMapNameBySectorNameResponse(responseBuilder.build());
        }

        /**
         * record not found to archive
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureArchiveByMapNameBySectorNameResponse withJsonNotFound(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureArchiveByMapNameBySectorNameResponse(responseBuilder.build());
        }

        /**
         * internal server problem
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureArchiveByMapNameBySectorNameResponse withJsonInternalServerError(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureArchiveByMapNameBySectorNameResponse(responseBuilder.build());
        }

    }

    public class PostCapabilityMeasureCapabilityDetailsUpdateResponse
        extends com.capability.raml.support.ResponseWrapper
    {


        private PostCapabilityMeasureCapabilityDetailsUpdateResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Succesfully updated a new resource e.g. {
         *   "result" : "success",
         *   "key" : "unique key of the CapabilityMap"
         * }
         * 
         * @param entity
         *     {
         *       "result" : "success",
         *       "key" : "unique key of the CapabilityMap"
         *     }
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureCapabilityDetailsUpdateResponse withJsonOK(PutMapsResponse entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureCapabilityDetailsUpdateResponse(responseBuilder.build());
        }

        /**
         * Record not found
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureCapabilityDetailsUpdateResponse withJsonNotFound(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureCapabilityDetailsUpdateResponse(responseBuilder.build());
        }

        /**
         * Internal server error
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureCapabilityDetailsUpdateResponse withJsonInternalServerError(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureCapabilityDetailsUpdateResponse(responseBuilder.build());
        }

        /**
         * Bad Request
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureCapabilityDetailsUpdateResponse withJsonBadRequest(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureCapabilityDetailsUpdateResponse(responseBuilder.build());
        }

    }

    public class PostCapabilityMeasureCapabilityDimensionNoteResponse
        extends com.capability.raml.support.ResponseWrapper
    {


        private PostCapabilityMeasureCapabilityDimensionNoteResponse(Response delegate) {
            super(delegate);
        }

        /**
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureCapabilityDimensionNoteResponse withJsonOK(PutMapsResponse entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureCapabilityDimensionNoteResponse(responseBuilder.build());
        }

        /**
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureCapabilityDimensionNoteResponse withJsonNotFound(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureCapabilityDimensionNoteResponse(responseBuilder.build());
        }

        /**
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureCapabilityDimensionNoteResponse withJsonInternalServerError(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureCapabilityDimensionNoteResponse(responseBuilder.build());
        }

        /**
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureCapabilityDimensionNoteResponse withJsonConflict(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(409).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureCapabilityDimensionNoteResponse(responseBuilder.build());
        }

    }

    public class PostCapabilityMeasureClusterResponse
        extends com.capability.raml.support.ResponseWrapper
    {


        private PostCapabilityMeasureClusterResponse(Response delegate) {
            super(delegate);
        }

        /**
         * Succesfully updated a new resource
         *  e.g. {
         *   "result" : "success",
         *   "key" : "unique key of the CapabilityMap"
         * }
         * 
         * @param entity
         *     {
         *       "result" : "success",
         *       "key" : "unique key of the CapabilityMap"
         *     }
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureClusterResponse withJsonOK(PutClusterListResponse entity) {
            Response.ResponseBuilder responseBuilder = Response.status(200).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureClusterResponse(responseBuilder.build());
        }

        /**
         * resource not found
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureClusterResponse withJsonNotFound(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(404).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureClusterResponse(responseBuilder.build());
        }

        /**
         * internal server problem
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureClusterResponse withJsonInternalServerError(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(500).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureClusterResponse(responseBuilder.build());
        }

        /**
         * Bad Request
         * 
         * @param entity
         *     
         */
        public static CapabilityMeasureResource.PostCapabilityMeasureClusterResponse withJsonBadRequest(ExceptionMessage entity) {
            Response.ResponseBuilder responseBuilder = Response.status(400).header("Content-Type", "application/json");
            responseBuilder.entity(entity);
            return new CapabilityMeasureResource.PostCapabilityMeasureClusterResponse(responseBuilder.build());
        }

    }

}
