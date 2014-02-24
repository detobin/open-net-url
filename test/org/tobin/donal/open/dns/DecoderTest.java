package org.tobin.donal.open.dns;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class DecoderTest {

	@Test
	public void testMain() {
		assertEquals(Messages.getString("DecoderTest.out.0"),Decoder.parse(Messages.getString("DecoderTest.in.0"),true)); //$NON-NLS-1$ //$NON-NLS-2$
		assertEquals(Messages.getString("DecoderTest.out.1"),Decoder.parse(Messages.getString("DecoderTest.in.1"),false)); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Test
	public void testMain2() {
		assertEquals(Messages.getString("DecoderTest.out.2"),Decoder.parse(Messages.getString("DecoderTest.in.2"),true)); //$NON-NLS-1$ //$NON-NLS-2$
		assertEquals(Messages.getString("DecoderTest.out.3"),Decoder.parse(Messages.getString("DecoderTest.in.3"),false)); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Test
	public void testMain4() {
		assertEquals(Messages.getString("DecoderTest.out.4"),Decoder.parse(Messages.getString("DecoderTest.in.4"),true)); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Test
	@Ignore
	public void testMain3() {
		assertEquals("",Decoder.parse("",true)); //$NON-NLS-1$ //$NON-NLS-2$
	}
}
