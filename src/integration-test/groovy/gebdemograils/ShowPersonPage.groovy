package gebdemograils

import geb.Page

class ShowPersonPage extends Page {

    static at = {
        title == 'Show Person'
    }

    static content = {
        deleteButton { $('input.delete', type: 'submit', ) }
        firstNameText { $('li.fieldcontain div.property-value', 'aria-labelledby': 'firstName-label')}
        lastNameText { $('li.fieldcontain div.property-value', 'aria-labelledby': 'lastName-label')}
    }

    void deletePerson() {
        deleteButton.click()
    }

    String getFirstName() {
        firstNameText.text()
    }

    String getLastName() {
        lastNameText.text()
    }
}
