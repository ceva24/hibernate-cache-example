package uk.co.ceva24.hce

class PersonController {

    static defaultAction = 'get'

    PersonService personService

    def get(Long id) {

        respond personService.getPerson(id)
    }

    def list(String id) {

        respond personService.getPeople(id ?: '')
    }
}