package io.github.adrianulbona.cloc.data;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by adrianulbona on 30/08/16.
 */
public class AnnotatedGeoHashStreamerTest {

	@Test
	public void testCount() throws Exception {
		assertEquals(1195623, new AnnotatedGeoHashStreamer().stream().count());
	}
}