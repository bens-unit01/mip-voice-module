package com.megamip.voice;

import java.util.Arrays;

public class VoiceCommand {
	
	
	
	private String action;
	private String[] args;
	
	
	// constructors 
	
	public VoiceCommand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VoiceCommand(String input){
		
		String[] inputArray = input.split(" ");
		try{
		     action = inputArray[0];	
		     args = new String[inputArray.length-1];
		     
		     for(int i =1; i< inputArray.length; i++){
		    	 
		    	 args[i] = inputArray[i];
		     }
			
		}catch(Exception ex){
			
			action = null;
			args = null;
		}
		
	}

	
	// getters and setters 
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

	@Override
	public String toString() {
		return "VoiceCommand [action=" + action + ", args="
				+ Arrays.toString(args) + "]";
	}
	
	

	
	
	
	

}
