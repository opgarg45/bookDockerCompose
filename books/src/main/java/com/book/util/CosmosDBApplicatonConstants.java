package com.book.util;

public class CosmosDBApplicatonConstants {
	
	/**epredia-iotdatabase settings**/
	
	public static final String COSMOS_DB_URL="https://epridiasqlcosom.documents.azure.com";
	public static final String COSMOS_DB_KEY="6vlqfYbnCNwBvABvAOrD49hJ8yShI5lntHsmKi466ycQGEetGXy2b9zQIwp6PMNlpjiWG0OmN3AC7ZoMrqKusA==";
	
		 
	/**epredia-iotdatabase settings**/
	       
	public static final String FORWARD_SLASH="/";                        
	
	public static final String RESOURCE_TYPE_DBS="dbs";
	public static final String RESOURCE_TYPE_COLLS="colls";
	public static final String RESOURCE_TYPE_DOCS="docs";
	public static final String RESOURCE_TYPE_PKRANGES="pkranges";
	public static final String DATABASE="book";  
	public static final String COLLECTION_NAME="bookCollection"; 
	public static final String BOOK_COLLECTION_DOC_RESOURCE_LINK=RESOURCE_TYPE_DBS+FORWARD_SLASH+DATABASE+FORWARD_SLASH+RESOURCE_TYPE_COLLS+FORWARD_SLASH+COLLECTION_NAME;
	public static final String BOOK_COLLECTION_DOC_RESOURCE_LINK_ID=RESOURCE_TYPE_DBS+FORWARD_SLASH+DATABASE+FORWARD_SLASH+RESOURCE_TYPE_COLLS+FORWARD_SLASH+COLLECTION_NAME+FORWARD_SLASH+RESOURCE_TYPE_DOCS;

	public static final String EVENTS_COLLECTION_NAME="revosDeviceMetadata";
	public static final String EVENTS_COLLECTION_DOC_RESOURCE_LINK=RESOURCE_TYPE_DBS+FORWARD_SLASH+DATABASE+FORWARD_SLASH+RESOURCE_TYPE_COLLS+FORWARD_SLASH+EVENTS_COLLECTION_NAME;
	public static final String TELEMETRY_COLLECTION_NAME="revosDeviceTelemetry";
	public static final String TELEMETRY_COLLECTION_DOC_RESOURCE_LINK=RESOURCE_TYPE_DBS+FORWARD_SLASH+DATABASE+FORWARD_SLASH+RESOURCE_TYPE_COLLS+FORWARD_SLASH+TELEMETRY_COLLECTION_NAME;
	public static final String GENERIC_ERROR_CODE="1001";
	public static final String GENERIC_ERROR_MSG="Service Not Available.Please check with Administrator ! ";
	public static final String KEY_TYPE="master";
	public static final String TOKEN_VERSION = "1.0";

	
	public static final String POST="POST";     
	public static final String GET="GET";
	public static final String PUT="PUT";     
	public static final String DELETE="DELETE";
	
	

	
	/**eprediaDB settings**/
	
	//public static final String COSMOS_DB_URL="https://eprediainfy.documents.azure.com";
	//public static final String COSMOS_DB_KEY="7Ycq917vRc5g83cTeEyldT8Y6RQwjHbAivcMlqFFrXyFxK9ipNLcB8pqqArwLYTwZM89kPcZH3EU2tmtJmKScw==";
	
	
	
	 
	/**eprediaDB settings**/
	
	public static final String BOOKS_ENDPOINT=FORWARD_SLASH+RESOURCE_TYPE_DBS+FORWARD_SLASH+DATABASE+FORWARD_SLASH+RESOURCE_TYPE_COLLS+FORWARD_SLASH+COLLECTION_NAME+FORWARD_SLASH+RESOURCE_TYPE_DOCS; 
	public static final String DB_DEVICES_ENDPOINT=FORWARD_SLASH+RESOURCE_TYPE_DBS+FORWARD_SLASH+DATABASE+FORWARD_SLASH+RESOURCE_TYPE_COLLS+FORWARD_SLASH+COLLECTION_NAME+FORWARD_SLASH+RESOURCE_TYPE_DOCS;
	public static final String DB_EVENTS_PKRANGES_ENDPOINT=FORWARD_SLASH+RESOURCE_TYPE_DBS+FORWARD_SLASH+DATABASE+FORWARD_SLASH+RESOURCE_TYPE_COLLS+FORWARD_SLASH+EVENTS_COLLECTION_NAME+FORWARD_SLASH+RESOURCE_TYPE_PKRANGES;
	public static final String DB_TELEMETRY_ENDPOINT=FORWARD_SLASH+RESOURCE_TYPE_DBS+FORWARD_SLASH+DATABASE+FORWARD_SLASH+RESOURCE_TYPE_COLLS+FORWARD_SLASH+TELEMETRY_COLLECTION_NAME+FORWARD_SLASH+RESOURCE_TYPE_DOCS;
}

