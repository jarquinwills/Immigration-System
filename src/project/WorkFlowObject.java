package project;

/**
 * This class creates the object that handles the workflow of the system.
 * @author Wills Jarquin
 *
 */

public class WorkFlowObject {
	
	/** This variable keeps a series of steps to compare to other object statuses. */
	private enum step {APPROVE, REVIEW}
	/** This variable keeps the id of the workflow. */
	private String id;
	
	/**
	 * This object generates an instance of a WorkFlowObject.
	 */
	public WorkFlowObject() {
		
	}
	
	/**
	 * This object generates an instance of a WorkFlowObject.
	 * @param id is the id to assign to the WorkFlowObject.
	 */
	public WorkFlowObject(String id) {
		
	}
	
	
	/**
	 * This function sets the id of the workflow object.
	 * @param id is the new id to assign the object.
	 */
	public void setId(String id) {
		
	}
	
	
	/**
	 * This method gets the current id of the workflow object
	 * @return the id of the workflow object.
	 */
	public String getId() {
		return "";
	}
	
}
