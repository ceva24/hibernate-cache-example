package uk.co.ceva24.hce

import groovy.transform.ToString

@ToString(includePackage = false, includes = 'username')
class Person {

    String username

    static mapping = {
        version false
        cache true
        id generator: 'assigned'
    }

    static constraints = {
        id bindable: true
    }
}