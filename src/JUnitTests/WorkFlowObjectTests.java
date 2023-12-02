package JUnitTests;
import org.openjfx.WorkFlowObject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

class WorkFlowObjectTests {
	
	/**
	 * 
	 */
	@Test
	void testConstructor() {
		//generate new Workflow Object.
		WorkFlowObject wfObj = new WorkFlowObject();
		
		//Check if WorkflowObject was generated properly.
		assertEquals(wfObj.getClass(), WorkFlowObject.class);
	}
	
	/**
	 * 
	 */
	@Test
	void testConstructorWithParameter() {
		//Default ID.
		String id = "1234";
		
		//generate new Workflow Object.
		WorkFlowObject wfObj = new WorkFlowObject(id);
		
		//Check if the id was assigned to the predetermined.
		assertEquals(id, wfObj.getId());
	}
	
	/**
	 * 
	 */
	@Test
	void testSetId() {
		//Default ID.
		String id = "1234";
		String idVariation = "1235";
		
		//generate new Workflow Object.
		WorkFlowObject wfObj = new WorkFlowObject(id);
		
		//Reset ID to variation.
		wfObj.setId(idVariation);
		
		//Check if the id was assigned to the variation.
		assertEquals(idVariation, wfObj.getId());
	}
	
	/**
	 * 
	 */
	@Test
	void testGetId() {
		//Default ID.
		String id = "1234";
		
		//generate new Workflow Object.
		WorkFlowObject wfObj = new WorkFlowObject();
		
		//Reset ID to variation.
		wfObj.setId(id);
		
		//Check if the get method matches what was assigned.
		assertEquals(id, wfObj.getId());
	}

}
