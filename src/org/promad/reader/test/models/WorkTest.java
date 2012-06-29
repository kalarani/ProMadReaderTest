package org.promad.reader.test.models;

import static org.junit.Assert.assertEquals;

import org.json.JSONArray;
import org.junit.Test;
import org.promad.reader.models.Work;

public class WorkTest {

	@Test
	public void testUrlConstruction(){
		JSONArray jsonUrls = new JSONArray();
		jsonUrls.put("/url1");
		jsonUrls.put("/url2");
		
		Work work = new Work("title", "author", jsonUrls);
		
		assertEquals("http://www.projectmadurai.org/url1", work.getUrls().get(0));
		assertEquals("http://www.projectmadurai.org/url2", work.getUrls().get(1));
	}
}
