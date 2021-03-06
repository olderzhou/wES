package org.datasays.wes.actions;

import okhttp3.HttpUrl;
import org.datasays.wes.core.RequestInfo;
import org.datasays.wes.types.*;
// documentation: https://www.elastic.co/guide/en/elasticsearch/reference/5.x/modules-scripting.html
public class PutScript extends RequestInfo{

	public PutScript(String baseUrl){
		super(baseUrl);
	}
	public PutScript(HttpUrl baseUrl){
		super(baseUrl);
	}

	// body*:The document
	@Override
	public void setBody(Object body) {
		super.setBody(body);
	}

	//Script ID
	private String id;
	//Script language
	private String lang;
	public PutScript setParts(String id,String lang){
		this.id=id;
		this.lang=lang;

		return this;
	}

	@Override
	public String parseUrl(String method) {
		if(!"PUT".equalsIgnoreCase(method) && !"POST".equalsIgnoreCase(method)){
			throw new IllegalArgumentException("Unsupported method:"+method);
		}
		//=>/_scripts/{lang}/{id}
		if(id != null && lang != null ){
			setUrl("_scripts", lang, id);
			return super.parseUrl(method);
		}

		return null;
	}
}
