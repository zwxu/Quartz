package com.ustc.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;  

@XmlRootElement(name = "person")
public class Person implements Serializable {
    private String id;
    private String username;
    private String description;
    @XmlElement(value = "id")
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    

	@XmlElement(value = "name")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
    @XmlElement(value = "description")
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
