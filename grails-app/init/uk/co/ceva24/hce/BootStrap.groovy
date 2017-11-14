package uk.co.ceva24.hce

class BootStrap {

    def init = {

        new Person(id: 1, username: 'user1').save()
        new Person(id: 2, username: 'user2').save()
    }
}