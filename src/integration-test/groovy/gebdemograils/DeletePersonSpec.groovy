package gebdemograils

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class DeletePersonSpec extends GebSpec {

    void 'test deleting person'() {
        when:
        to PersonListPage

        then:
        at PersonListPage

        when:
        int originalNumberOfPeople = numberOfPeople
        to CreatePersonPage

        then:
        at CreatePersonPage

        when:
        createPerson 'Adrian', 'Belew'

        then:
        at ShowPersonPage

        and:
        firstName == 'Adrian'
        lastName == 'Belew'

        when:
        to PersonListPage

        then:
        at PersonListPage

        and:
        numberOfPeople == originalNumberOfPeople + 1

        when:
        clickFirstName('Adrian')

        then:
        at ShowPersonPage
        firstName == 'Adrian'
        lastName == 'Belew'

        when:
        withConfirm(false) {
            deletePerson()
        }

        then:
        at ShowPersonPage

        when:
        to PersonListPage

        then:
        at PersonListPage
        numberOfPeople == originalNumberOfPeople + 1

        when:
        clickFirstName('Adrian')

        then:
        at ShowPersonPage
        firstName == 'Adrian'
        lastName == 'Belew'

        when:
        withConfirm(true) {
            deletePerson()
        }

        then:
        at PersonListPage

        then:
        at PersonListPage
        numberOfPeople == originalNumberOfPeople
    }
}
