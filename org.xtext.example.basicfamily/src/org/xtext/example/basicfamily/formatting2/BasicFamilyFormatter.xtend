/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.basicfamily.formatting2

import com.google.inject.Inject
import org.eclipse.sirius.sample.basicfamily.Family
import org.eclipse.sirius.sample.basicfamily.Person
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.basicfamily.services.BasicFamilyGrammarAccess

class BasicFamilyFormatter extends AbstractFormatter2 {
	
	@Inject extension BasicFamilyGrammarAccess

	def dispatch void format(Family family, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Person person : family.getMembers()) {
			person.format;
		}
	}
	
	// TODO: implement for 
}