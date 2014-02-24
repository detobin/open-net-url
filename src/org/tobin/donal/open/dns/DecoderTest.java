package org.tobin.donal.open.dns;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class DecoderTest {

	@Test
	public void testMain() {
		assertEquals("http://androidforums.com/samsung-galaxy-s2-international/523455-ics-csc-you-eligible-update.html",Decoder.parse("http://www.website-unavailable.com/main?wc=Ew1nGg5%2FA3RAAhJuAAkdEx4WURAD&url=guidetest.a.id.opendns.com%2F%3Furl%3Dforum%252Exda%252Ddevelopers%252Ecom%252Fshowthread%252Ephp%253Ft%253D800257&ref=http%3A%2F%2Fandroidforums.com%2Fsamsung-galaxy-s2-international%2F523455-ics-csc-you-eligible-update.html&w=943&h=920&ifc=0",true));
		assertEquals("http://forum.xda-developers.com/showthread.php?t=800257",Decoder.parse("http://www.website-unavailable.com/main?wc=Ew1nGg5%2FA3RAAhJuAAkdEx4WURAD&url=guidetest.a.id.opendns.com%2F%3Furl%3Dforum%252Exda%252Ddevelopers%252Ecom%252Fshowthread%252Ephp%253Ft%253D800257&ref=http%3A%2F%2Fandroidforums.com%2Fsamsung-galaxy-s2-international%2F523455-ics-csc-you-eligible-update.html&w=943&h=920&ifc=0",false));
	}

	@Test
	public void testMain2() {
		assertEquals("http://androidforums.com/samsung-galaxy-s2-international/523455-ics-csc-you-eligible-update.html",Decoder.parse("http://www.website-unavailable.com/main?wc=Ew1nGg5%2FA3RAAhJuAAkdEx4WURAD&url=www.sammobile.com%2Ffirmware%2F%3Fpage%3D1%26t%3D1&ref=http%3A%2F%2Fandroidforums.com%2Fsamsung-galaxy-s2-international%2F523455-ics-csc-you-eligible-update.html&w=943&h=920&ifc=0",true));
		assertEquals("http://www.sammobile.com/firmware/?page=1&t=1",Decoder.parse("http://www.website-unavailable.com/main?wc=Ew1nGg5%2FA3RAAhJuAAkdEx4WURAD&url=www.sammobile.com%2Ffirmware%2F%3Fpage%3D1%26t%3D1&ref=http%3A%2F%2Fandroidforums.com%2Fsamsung-galaxy-s2-international%2F523455-ics-csc-you-eligible-update.html&w=943&h=920&ifc=0",false));
	}

	@Test
	@Ignore
	public void testMain3() {
		assertEquals("",Decoder.parse("",true));
	}
}
