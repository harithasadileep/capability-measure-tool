package com.capability.mapper;

import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.TypeMappingBuilder;
import org.dozer.loader.api.TypeMappingOptions;
import org.springframework.stereotype.Component;

import com.capability.entities.CapabilityEntity;
import com.capability.entities.ClusterEntity;
import com.capability.entities.MapEntity;
import com.capability.raml.model.ClusterView;
import com.capability.raml.model.Map;
import com.capability.raml.model.MapView;

/**
 *
 * @author dsomajohassula
 * 
 *         The Class CustomBeanMappingBuilder.
 */
@Component
public class CustomBeanMappingBuilder extends BeanMappingBuilder {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.dozer.loader.api.BeanMappingBuilder#configure()
	 */
	@SuppressWarnings("unused")
	@Override
	protected void configure() {
		String dateFormat = "MM-dd-yyyy HH:mm:ssZ";

		TypeMappingBuilder getMapListBuilder = mapping(MapEntity.class, Map.class,
				TypeMappingOptions.wildcard(true), TypeMappingOptions.dateFormat(dateFormat),
				TypeMappingOptions.trimStrings(true));
		getMapListBuilder.fields("mapEntityKey.mapId", "mapId");
		getMapListBuilder.fields("mapEntityKey.versionId", "versionId");
		getMapListBuilder.fields("mapEntityKey.sectorId", "sectorId");
		getMapListBuilder.fields("createDt", "createDt");
		getMapListBuilder.fields("lastUpdateDt", "lastUpdateDt");
		
		TypeMappingBuilder getClusterViewBuilder = mapping(CapabilityEntity.class, ClusterView.class,
				TypeMappingOptions.wildcard(true), TypeMappingOptions.dateFormat(dateFormat),
				TypeMappingOptions.trimStrings(true));
		getClusterViewBuilder.fields("capabilityEntityKey.mapId", "mapId");
		getClusterViewBuilder.fields("capabilityEntityKey.versionId", "versionId");
		getClusterViewBuilder.fields("capabilityEntityKey.sectorId", "sectorId");
		getClusterViewBuilder.fields("capabilityEntityKey.capabilityId", "capabilityId");
		getClusterViewBuilder.fields("clusterId", "clusterId");
		getClusterViewBuilder.fields("createDt", "createDt");
		getClusterViewBuilder.fields("lastUpdateDt", "lastUpdateDt");
		
		
		TypeMappingBuilder getMapViewBuilder = mapping(ClusterEntity.class, MapView.class,
				TypeMappingOptions.wildcard(true), TypeMappingOptions.dateFormat(dateFormat),
				TypeMappingOptions.trimStrings(true));
		getMapViewBuilder.fields("clusterEntityKey.mapId", "mapId");
		getMapViewBuilder.fields("clusterEntityKey.versionId", "versionId");
		getMapViewBuilder.fields("clusterEntityKey.sectorId", "sectorId");
		getMapViewBuilder.fields("clusterEntityKey.clusterId", "clusterId");
		getMapViewBuilder.fields("createDt", "createDt");
		getMapViewBuilder.fields("lastUpdateDt", "lastUpdateDt");


	}
}
