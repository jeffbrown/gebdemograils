package gebdemograils

import geb.Page

class CreatePersonPage extends Page {

    static url = '/people/create'

    static at = {
        title == 'Create Person'
    }

    static content = {
        firstNameText { $('input', type: 'text', name: 'firstName') }
        lastNameText { $('input', type: 'text', name: 'lastName') }
        createButton { $('input', type: 'submit', name: 'create') }
    }

    void createPerson(String firstName, String lastName) {
        firstNameText = firstName
        lastNameText = lastName
        createButton.click()
    }
}
