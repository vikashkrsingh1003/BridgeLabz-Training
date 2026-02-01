package com.lambdaexpressions.smarthome;

class SmartLightController {

    public void activateLight(String trigger, LightAction action) {
         System.out.println("Trigger received: " + trigger);
        action.execute();
    }
}

public  class SmartHome {
	
	    public static void main(String[] args) {

	        SmartLightController controller = new SmartLightController();
	        controller.activateLight("MOTION", () ->
	        System.out.println("Motion detected: Hallway lights ON"));

	    controller.activateLight("NIGHT", () ->
	        System.out.println("Night mode: Lights DIMMED to 30%"));

	     controller.activateLight("VOICE", () ->
	        System.out.println("Voice command: Party mode lights ON"));
	    }

}
