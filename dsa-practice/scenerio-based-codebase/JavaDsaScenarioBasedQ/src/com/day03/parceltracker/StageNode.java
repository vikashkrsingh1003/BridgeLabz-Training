package com.day03.parceltracker;

public class StageNode {
  
	String stage;
    StageNode next; 
    
    public StageNode(String stage) {
    	this.stage = stage;
    	this.next= null;
    }
    
    public String getStage() {
        return stage;
    }
}
