package org.agorava.xing.jackson;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.agorava.xing.model.Contacts;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class ContactsNodeMixin {

	@JsonCreator
	ContactsNodeMixin(@JsonProperty("contacts") Contacts contacts) {
	}
}
