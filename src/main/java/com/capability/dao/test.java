/*package com.capability.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.capability.raml.model.Cluster;
import com.capability.raml.model.PutClustrList;

public class test {
	
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		PutClustrList putClustrList = new PutClustrList();
		
		List<Cluster> clusterList = new ArrayList<Cluster>();
		Cluster cluster = new Cluster();
		cluster.setClusterId("CL1");
		cluster.setClusterNm("test");
		cluster.setMapName("test map");
		cluster.setSectorName("test sector");
		
		
		clusterList.add(cluster);
		putClustrList.setCluster(clusterList);

		//Object to JSON in file
		try {
			mapper.writeValue(new File("C:\\Users\\dsomajohassula\\Desktop\\json\\user.json"), putClustrList);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String jsonInString = null;
		try {
			jsonInString = mapper.writeValueAsString(putClustrList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jsonInString);
	}

}
*/