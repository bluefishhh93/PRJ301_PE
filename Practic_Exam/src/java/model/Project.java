/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author xuant
 */
public class Project implements Serializable{
    private String projectID;
    private String name;
    private int quality;
    private boolean feature;

    public Project() {
    }

    public Project(String projectID, String name, int quality, boolean feature) {
        this.projectID = projectID;
        this.name = name;
        this.quality = quality;
        this.feature = feature;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public boolean isFeature() {
        return feature;
    }

    public void setFeature(boolean feature) {
        this.feature = feature;
    }

    @Override
    public String toString() {
        return "Project{" + "projectID=" + projectID + ", name=" + name + ", Quantity=" + quality + ", feature=" + feature + '}';
    }
    
    
    
}
