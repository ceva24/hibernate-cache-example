package uk.co.ceva24.hce

class PersonService {

    Person getPerson(Long id) {

        log.info "Getting person with id ${id}"

        def person = Person.get(id)

        log.info "Retrieved person: ${person}"

        return person
    }

    List<Person> getPeople(String term) {

        log.info "Getting people with username matching '${term}'"

        def people = Person.findAllByUsernameIlike("%${term}%")

        log.info "Retrieved people: ${people}"

        return people
    }
}