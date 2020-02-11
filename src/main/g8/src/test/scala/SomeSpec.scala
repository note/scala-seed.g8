package example

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{Matchers, WordSpec}

class SomeSpec extends WordSpec with Matchers with TypeCheckedTripleEquals {
	"2 + 2" should {
		"equal 4" in {
			assert((2 + 2) === 4)
		}
	}
}