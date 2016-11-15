package org.datasays.es2;

import java.io.Serializable;

import com.google.gson.annotations.Expose;

public class EsItem implements Serializable{
	private static final long serialVersionUID = 2352684084618744566L;
	private String id;
	private String index;
	private String type;
	@Expose
	private String json;

	public EsItem() {
		super();
	}

	public EsItem(String id) {
		this();
		this.id = id;
	}

	public EsItem(String index, String type, String id) {
		this(id);
		if(index != null){
			this.index = index;
		}
		if(type != null){
			this.type = type;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}
}
